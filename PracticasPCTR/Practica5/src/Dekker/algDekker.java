package Dekker;

/* Copyright (C) 2006 M. Ben-Ari. See copyright.txt */
/* Programmed by Panu Pitkämäki */

/* Dekker's algorithm */
class algDekker {
    /* Number of processes currently in critical section */
    static volatile int inCS = 0;
    /* Process p wants to enter critical section */
    static volatile boolean wantp = false;
    /* Process q wants to enter critical section */    
    static volatile boolean wantq = false;
    /* Process h wants to enter critical section */    

    static volatile boolean wanth = false;
    /* Which processes turn is it */
    static volatile int turn = 1;

    class H extends Thread{
    	public void run() {
    		while(true) {
    			
    			wanth = true;
    			while (wanth) {
    				if(turn==3) {
    					wanth=false;
    					while(turn==3)
    						Thread.yield();
    					wanth=true;
    			}
    		}
  
                inCS++;
                Thread.yield();
                /* Critical section */
                System.out.println("Number of processes in critical section: "+ inCS);
                inCS--;
                turn = 3;
                wanth = false;
    	}
    }
    
    class P extends Thread {
        public void run() {
            while (true) {
                /* Non-critical section */
                wantp = true;
                while (wantq) {
                    if (turn == 2) {
                        wantp = false;
                        while (turn == 2)
                            Thread.yield();
                        wantp = true;
                    }
                }
                inCS++;
                Thread.yield();
                /* Critical section */
                System.out.println("Number of processes in critical section: "+ inCS);
                inCS--;
                turn = 2;
                wantp = false;
            }
        }
    }
    
    class Q extends Thread {
        public void run() {
            while (true) {
                /* Non-critical section */
                wantq = true;
                while (wantp) {
                    if (turn == 1) {
                        wantq = false;
                        while (turn == 1)
                            Thread.yield();
                        wantq = true;
                    }
                }
                inCS++;
                Thread.yield();
                /* Critical section */
                System.out.println("Number of processes in critical section: "+ inCS);
                inCS--;
                turn = 1;
                wantq = false;
            }
        }
    }

    void Dekker() {
        Thread p = new P();
        Thread q = new Q();
        Thread h = new H();
        p.start();
        q.start();
        h.start();
    }

    public void main(String[] args) {
        new algDekker();
    }
}
}