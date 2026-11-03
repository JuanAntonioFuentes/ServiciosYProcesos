public class FrasesAleatorias extends Thread{
    public FrasesAleatorias(){};

        int posicion;
        int tiempo =(int)((Math.random()*5000)+5000);
        String[] frasesMotivadoras = {
    "El único modo de hacer un gran trabajo es amar lo que haces.",
    "Cree en ti mismo y en todo lo que eres. Hay algo dentro de ti que es más grande que cualquier obstáculo.",
    "No cuentes los días, haz que los días cuenten.",
    "El futuro pertenece a quienes creen en la belleza de sus sueños.",
    "La motivación nos impulsa a comenzar, y el hábito nos permite continuar.",
    "No importa lo lento que vayas, siempre y cuando no te detengas.",
    "El éxito no es la clave de la felicidad. La felicidad es la clave del éxito.",
    "Empieza donde estás, usa lo que tienes, haz lo que puedas.",
    "Lo que con mucho trabajo se adquiere, más se ama.",
    "Cada logro comienza con la decisión de intentarlo."
};

    public void run(){

        while (true) {
            try {
                posicion =(int)(Math.random()*10);
                sleep(tiempo);


                System.out.println(frasesMotivadoras[posicion]);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
