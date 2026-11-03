public class palabra extends Thread{

    String npalabra;
    String texto;

    public palabra(String np, String te){

        this.npalabra = np;
        this.texto = te;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
           
               System.out.println(npalabra+": " +texto+" impresa "+ (i+1)+" veces");
           
            
        }
    }
}