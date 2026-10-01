
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Lanzador {
    public static void main(String[] args) {
        
    try {
        
    
    System.out.println("Soy la clase principal");
    
    String java = System.getProperty("java.home")+ File.separator+"bin"+ File.separator+"java";
    String cp = System.getProperty("java.class.path");

    ProcessBuilder pb = new ProcessBuilder(java, "-cp", cp, "Saludo");

    
    Process hijo = pb.start();

    BufferedReader reader = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
    String linea;

    while((linea=reader.readLine())!=null){
        System.err.println("La otra clase dice:" + linea);
    }

    hijo.waitFor();
    System.out.println("El hijo ha terminado.");

    reader.close();

} catch (Exception e) {
        // TODO: handle exception
    }
}
}
