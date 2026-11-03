
public class Restar extends Thread{
    
    int num1;
    int num2;
    
    public Restar(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    public void run(){
        System.out.println("Resta: "+(num1-num2));
    };
}
