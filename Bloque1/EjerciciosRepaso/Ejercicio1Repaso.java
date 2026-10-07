
import java.util.Scanner;

public class Ejercicio1Repaso {
    public static void main(String[] args) {
        try {
            int opcion = 0;
            Scanner sc = new Scanner(System.in);

            String web = "https://davante.es";

            String rutaEdge = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";

        
            do {
                System.out.println("=== PANEL DE ESTUDIO ===");
                System.err.println("1. Abrir el campus virtual");
                System.out.println("2. Tomar apuntes");
                System.out.println("3. Ver mis descargas");
                System.out.println("4. Terminar de tomar apuntes");
                System.out.println("5. Salir");

                opcion = Integer.parseInt(sc.nextLine());

                if (opcion ==1) {
                    ProcessBuilder edge = new ProcessBuilder(rutaEdge,web);
                    edge.start();
                }else if (opcion == 2) {
                    ProcessBuilder notas = new ProcessBuilder("notepad","apuntes.txt");
                    notas.start();
                }else if (opcion == 3) {    
                    ProcessBuilder explorador = new ProcessBuilder("explorer", "C:\\Descargas");
                    explorador.start();
                }else if (opcion ==4) {
                    ProcessBuilder cerrar = new ProcessBuilder("cmd","/c", "taskkill /f /im notepad.exe");


                    cerrar.start();
                }

            } while (opcion!=5);
        } catch (Exception e) {
        }
    }
}
