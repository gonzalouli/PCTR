
public class EjemploRunnable implements Runnable {
    
    private String nombre;
    
    public EjemploRunnable(String nombre) // Constructor de la clase EjemploRunnable
    {
        this.nombre = nombre; // Se asigna el valor de la variable local 'nombre' a la variable del objeto 'nombre'
    }
    
    public void run()
    {
        System.out.println(this.nombre); // Logica del hilo.
    }
    
    public static void main (String[] args) {
        EjemploRunnable[] er = new EjemploRunnable[10];
        
        for (int i = 0; i < er.length; i++)
        {
            er[i] = new EjemploRunnable("Pepito perez => " + i); // Se inician los objetos Runnable de forma independiente.
        }
        
        for (EjemploRunnable e: er) // Se inician los hilos con la logico de los objetos Runnable de forma independiente a lo anterior.
        {
            new Thread(e).start(); // No se permite hacer start sobre un objeto de tipo Runnable
                                   // Por tanto, se pasa por parametro a Thread y se empieza.
                                   // Es lo que está diciendo alberto ahora mismo.
        }
        
        // Hilos planificas para su ejecucion, java decide cuando empiezan.
    }
}
