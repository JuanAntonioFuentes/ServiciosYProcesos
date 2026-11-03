public class Almacen extends Thread{
    
    private String [] almacen;
    private int contador;

    public void run(){
        this.almacen= new String[10];
        this.contador = 0;
    }

    public void insertarProducto(String productoID){
        if (this.contador<=9) {
            this.almacen[this.contador]= productoID;
            this.contador++;
            System.out.println("Se ha añadido el :" + productoID);
        }
    }

    public void eleminarProducto(){
        if (this.contador>0) {
            this.contador--;
            System.out.println("Se ha eliminado el "+ this.almacen[this.contador]);
            this.almacen[this.contador]=null;
        }
    }
}
