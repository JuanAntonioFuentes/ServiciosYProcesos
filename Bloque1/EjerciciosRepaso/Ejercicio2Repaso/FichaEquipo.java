
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FichaEquipo {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd","/c", "systeminfo");
            Process proceso = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            int lineasContadas=0;
            int lineasGuardadas=0;

            String linea ;
            String textoEntero="";

            BufferedWriter guardar = new BufferedWriter(new FileWriter("./equipo.txt"));
            
                while (((linea = reader.readLine())!=null)||(lineasContadas==70)) {
                    
                    textoEntero = (textoEntero+"\n"+linea);
                    lineasContadas++;
                    if (linea.contains("Nombre de host")|| linea.contains("Nombre del sistema operativo")||linea.contains("Modelo del sistema")) {
                        guardar.write(linea + "\n");
                        lineasGuardadas++;                    
                    }
                }
            guardar.close();
            reader.close();
            proceso.waitFor();
            System.out.println(lineasGuardadas + " datos guardados en equipo.txt");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}   
