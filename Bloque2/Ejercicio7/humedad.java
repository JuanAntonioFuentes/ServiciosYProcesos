public class humedad extends Thread{
    int atm = 3;

    public void run(){
        do {
            
        int aleatorio = (int)(Math.random()*10);

        int incDec = (int)(Math.random()*2);

        if (aleatorio>=5) {
            atm+=incDec;
        }else if (aleatorio<5) {
            atm-=incDec;
        }
        System.out.println("La presion atmosferica =" +atm);

        try {
            sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
            
        } while ((atm>0)&&(atm<5));

    }
}
