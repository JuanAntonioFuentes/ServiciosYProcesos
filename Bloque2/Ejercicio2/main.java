
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int numero1 = Integer.parseInt(sc.nextLine());
        System.out.println("Numero 2:");
        int numero2 = Integer.parseInt(sc.nextLine());
        
        
        Restar hilo1 = new Restar(numero1, numero2);
        Multiplicar hilo2 = new Multiplicar(numero1, numero2);
        Dividir hilo3 = new Dividir(numero1, numero2);
        Sumar hilo4 = new Sumar(numero1, numero2);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
    }
}
