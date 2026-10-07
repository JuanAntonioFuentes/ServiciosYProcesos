import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        try {
            String java = System.getProperty("java.home")+File.separator+"bin"+File.separator+"java";
            
            String cp = System.getProperty("java.class.path");

            ProcessBuilder lanzador = new ProcessBuilder(java, "-cp", cp, "FichaEquipo");

            Process procesoLanzado = lanzador.start();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(procesoLanzado.getInputStream()));

            String texto ;

            System.out.println("Proceso lanzado");
            while ((texto = br.readLine())!=null) {
                System.out.println("[Ficha equipo] "+texto);
            }

            procesoLanzado.waitFor();
            
            System.out.println("Ficha terminada");

            br.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
