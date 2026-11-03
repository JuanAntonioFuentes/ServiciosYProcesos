
import java.util.Scanner;

public class Numero extends Thread{

    public Numero (){
    }
    Scanner sc = new Scanner(System.in);
   int aleatorio =(int)(Math.random()*100);

   int numeroIngresado;
   public void getIngresado(int numero){
        this.numeroIngresado=numero;
   }

   public void run(){
    System.out.println("Ingrese el numero para intentar adivinarlo:");
    numeroIngresado = Integer.parseInt(sc.nextLine());
        
    while (true) {
            if (numeroIngresado<aleatorio) {
                System.out.println("El numero que has puesto es mas pequeño, vuelve a intentarlo:");
                numeroIngresado = Integer.parseInt(sc.nextLine());
            }else if (numeroIngresado>aleatorio) {
                System.out.println("El numero que has puesto es mas grande, vuelve a intentarlo:");
                numeroIngresado = Integer.parseInt(sc.nextLine());
            }else{
                System.out.println("Ehorabuena lo has adivinado");
                break;
            }
                
            
        }
   }
}
