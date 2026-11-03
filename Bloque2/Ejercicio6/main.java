public class main{
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        long[] array = new long[200000000];
        long suma =0;

        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int)(Math.random()*101);

            array[i]=aleatorio;
        }
        long medio = System.currentTimeMillis();
    
        for (int i = 0; i < array.length; i++) {
            
            suma+=array[i];
        }

        System.out.println(suma);
        long fin = System.currentTimeMillis();


        System.out.println("A duracion generacion: " +(medio-inicio)+"ms");

        System.out.println("A duracion suma " +(fin-medio)+"ms");


        eficiencia f1 = new eficiencia();
        eficiencia f2 = new eficiencia();
        eficiencia f3 = new eficiencia();
        eficiencia f4 = new eficiencia();

        f1.start();
        f2.start();
        f3.start();
        f4.start();

        try {
            f1.join();
            f2.join();
            f3.join();
            f4.join();
} catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("\n\n Datos con tiempos optimizados");
        long tiempogenerar = f1.getTiempoGenerar()+f2.getTiempoGenerar()+f3.getTiempoGenerar()+f4.getTiempoGenerar();
        long nuevaSuma = f1.getsacarsuma()+f2.getsacarsuma()+f3.getsacarsuma()+f4.getsacarsuma();
        long tiempoSumar = f1.getTiempoSuma()+f2.getTiempoSuma()+f3.getTiempoSuma()+f4.getTiempoSuma();

        System.out.println("Tiempo en guardar en todas las array: " + tiempogenerar + " ms");
        System.out.println("Tiempo en sumar todos los elementos de todas las array: " + tiempoSumar + " ms");
        System.out.println("Resultado de la suma: " + nuevaSuma);
    }
}