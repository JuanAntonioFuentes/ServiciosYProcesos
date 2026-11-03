
public class Cronometro extends Thread{
    int tiempo;
    
    
    public Cronometro(){
            this.tiempo = 30;
    }
    public void run(){
        try {
        for (int i = tiempo; i > 0; i--) {
            System.out.println("Quedan: " + (i)+ " segundos");
            sleep(1000);
        }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
