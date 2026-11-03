
public class Calculadora {
    
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("calc.exe");
            Process proceso = pb.start();
            System.out.println("Calculadora iniciada correctamente esperando acciones");
            proceso.waitFor();
            System.out.println("La calculadora se cerro correctamente");
        } catch (Exception e) {
            System.out.println("El programa fallo en algo");
        }
    }
    
}