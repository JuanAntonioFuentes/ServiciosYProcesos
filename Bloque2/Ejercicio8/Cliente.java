public class Cliente extends Thread{
    
    private Almacen almacen1 = new Almacen();
    private String nombre;
    private long contador;

    public Cliente(String no,Almacen alma){
        this.nombre = no;
        this.almacen1 = alma;
        this.contador =0;
    }

    public void run(){
        while (true) { 
            this.contador++;
            String dato =("Producto " + this.contador +" de: " + this.nombre);
            this.almacen1.insertarProducto(dato);

        }
        
        
    }
}
