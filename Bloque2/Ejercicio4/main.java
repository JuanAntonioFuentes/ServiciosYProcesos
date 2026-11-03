
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique la palabra 1");
        String palabra1 = sc.nextLine();

        System.out.println("Indique la palabra 1");

        String palabra2 =sc.nextLine();

        System.out.println("Indique la palabra 1");
        String palabra3 =sc.nextLine();

        palabra pal1 = new palabra("Palabra 1",palabra1);
        palabra pal2 = new palabra("Palabra 2",palabra2);
        palabra pal3 = new palabra("Palabra 3",palabra3);
try {
    

        pal1.start();
        pal1.join();

        pal2.start();
        pal3.start();
    } catch (Exception e) {
}
    }
}
