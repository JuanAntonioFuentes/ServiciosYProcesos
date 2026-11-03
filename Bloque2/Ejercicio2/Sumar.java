public class Sumar extends Thread{
    int num1;
    int num2;
    
    public Sumar(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    public void run(){
        System.out.println("Sumar: "+(num1+num2));
    };
}
