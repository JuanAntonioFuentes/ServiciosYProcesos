import java.util.Random;

public class eficiencia extends Thread{
    
   

    
    long inicio;
    long medio;
    long fin;
    long suma =0;
    private final Random rnd = new Random();
    
    public void run(){
        
        long []arrayy = new long[50000000];
        inicio = System.currentTimeMillis();
        for (int i = 0; i < arrayy.length; i++) {
            arrayy[i]=rnd.nextInt(101);
        }
        medio = System.currentTimeMillis();
        for (int i = 0; i < arrayy.length; i++) {
            suma+=arrayy[i];
        }
        fin = System.currentTimeMillis();
    }
    
    public long getsacarsuma(){
        return this.suma;
    }
    public long getTiempoGenerar(){
        return (this.medio-this.inicio);
    }
    public long getTiempoSuma(){
        return (this.fin-this.medio);
    }


}
