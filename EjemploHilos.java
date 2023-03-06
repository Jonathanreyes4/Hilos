public class EjemploHilos {

    public static void main(String[] args) {

        // hilos para operaciones simples
        Thread operacion1Thread = new Thread() {
            @Override
            public void run() {
                int resultado = 2 + 3;
                System.out.println("Resultado de la operación 1: " + resultado);
            }
        };

        Thread operacion2Thread = new Thread() {
            @Override
            public void run() {
                int resultado = 5 - 2;
                System.out.println("Resultado de la operación 2: " + resultado);
            }
        };

        Thread operacion3Thread = new Thread() {
            @Override
            public void run() {
                int resultado = 4 * 6;
                System.out.println("Resultado de la operación 3: " + resultado);
            }
        };

        // hilo para la canción
        Thread cancionThread = new Thread() {
            @Override
            public void run() {
                System.out.println("Estrellita, ¿dónde estás?");
                System.out.println("Me pregunto qué serás.");
                System.out.println("En el cielo y en el mar,");
                System.out.println("Un diamante de verdad.");
            }
        };

        // Iniciamos los cuatro hilos
        operacion1Thread.start();
        operacion2Thread.start();
        operacion3Thread.start();
        cancionThread.start();

    }

}