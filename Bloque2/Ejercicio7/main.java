public class main {
    public static void main(String[] args) {
        temperatura tem1 = new temperatura();
        presionat pre1 = new presionat();
        humedad hum1 = new humedad();

        hum1.start();
        pre1.start();
        tem1.start();
    }
}
