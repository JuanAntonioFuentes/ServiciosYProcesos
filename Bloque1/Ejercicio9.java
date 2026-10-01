

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
        
        System.out.println("Escribe el nombre del proceso que buscas");
        String nombre = sc.nextLine();


        String comando = "gps";

        ProcessBuilder proceso = new ProcessBuilder("PowerShell", "/C", comando);

        Process listar = proceso.start();

        BufferedReader leerProcesos = new BufferedReader(new InputStreamReader(listar.getInputStream()));

        String linea;

        int numeroVeces=0;
        String vecesEncontrado="Proceso encontrado";
        while ((linea = leerProcesos.readLine())!=null) { 
            if (linea.contains(nombre)) {
                numeroVeces++;
            }
            else{
                
            }
        }
        System.out.println(vecesEncontrado+" "+numeroVeces + " veces");
        } catch (Exception e) {
                }
    }
}
