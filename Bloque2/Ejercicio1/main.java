public class main{

    public static void main(String[] args) {
        Hilo hilo1 = new  Hilo(1);
        Hilo hilo2 = new  Hilo(2);
        Hilo hilo3 = new  Hilo(3);
        Hilo hilo4 = new  Hilo(4);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }

}