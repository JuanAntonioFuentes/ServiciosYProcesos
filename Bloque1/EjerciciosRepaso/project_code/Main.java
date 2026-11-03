import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            String java = System.getProperty("java.home")+File.separator+"bin"+File.separator+"java";

            String cp = System.getProperty("java.class.path");

            ProcessBuilder pb = new ProcessBuilder(java,"-cp",cp,"Calculadora");
            Process activador = pb.start();

            BufferedReader br = new BufferedReader(new InputStreamReader(activador.getInputStream()));

            String lineaLeida;
            while((lineaLeida=br.readLine())!=null){
                System.out.println(lineaLeida);
            }

            activador.waitFor();
            System.out.println("Procesos finalizados");
        } catch (Exception e) {
            System.out.println("Algo Fallo");
        }
    }
}