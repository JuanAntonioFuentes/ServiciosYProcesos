public class temperatura extends Thread{
    int temperatura =20;

    
    
    public void run(){
        do {
            int aleatorio = (int)(Math.random()*10);
            int incremento = (int)(Math.random()*4);
            try {
                
                if (aleatorio>=5) {
                    temperatura+=incremento;
                    
                }else if (aleatorio<5) {
                    temperatura-=incremento;
                }
                System.out.println("La temperatura = " + temperatura);
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } while ((temperatura>0) && (temperatura<40));
    }
}
