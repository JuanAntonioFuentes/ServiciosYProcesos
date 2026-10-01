package ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            
        
        String comando = "gps";
        String ruta = "./ejercicio8/listado.txt";
        ProcessBuilder listado = new ProcessBuilder("PowerShell","/C",comando);

        Process proceso = listado.start();
    
        BufferedReader texto = new BufferedReader( new InputStreamReader(proceso.getInputStream()));

        BufferedWriter escribir = new BufferedWriter(new FileWriter(ruta));
        String linea;
        while ((linea = texto.readLine())!=null) {
            
            escribir.write(linea);
            escribir.newLine();
            
        }

        texto.close();
        escribir.close();

        proceso.destroy();
        } catch (Exception e) {
        }
    }
}
