
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;





public class Ejercicio10{
    public static void main(String[] args) {
        try {
            
        
        String comando = "dir \"C:\\Users\\Juan Antonio\\Desktop\\GithubSegundo\\PSP\\Bloque1\"";

        ProcessBuilder examinar = new ProcessBuilder("CMD","/C",comando);
        
        Process p =examinar.start();
            
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String ruta = "./Ejercicio10/comparacion.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
        String linea;
        int contador1=0;
        
        int contador2=0;
        while ((linea = br.readLine())!=null) { 
            bw.write(linea);
            bw.newLine();
            contador1++;
            contador2++;
        }
        bw.close();
        br.close();

        
        while (true) { 
            
            Thread.sleep(5000);
            contador2=0;
            while ((linea = br.readLine())!=null) { 
                bw.write(linea);
                bw.newLine();
                contador2++;
            }
            if(contador1!=contador2){
                break;
            }else{}
        }
    
    } catch (Exception e) {
        }
    }
}
