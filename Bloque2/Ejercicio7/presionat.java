public class presionat extends Thread{
    int presionIni = 50;

    public void run(){
        
        do {
            int decInc = (int)(Math.random()*10);
            int cantida = (int)((Math.random()*5));
            if (decInc<5) {
                presionIni+=cantida;
                
            }else if (decInc>=5) {
                presionIni-=cantida;
            }
            System.out.println("La presion actual es = " + presionIni);
            try {
                sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        } while ((presionIni<100 && presionIni>0));
    }
}
