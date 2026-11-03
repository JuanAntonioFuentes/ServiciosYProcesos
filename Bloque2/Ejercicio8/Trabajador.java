public class Trabajador extends Thread{
    

    Almacen almacen1 = new Almacen();
    
    public Trabajador(Almacen a){
        this.almacen1 = a;
    }

    public void run(){
        while (true) {
            try {
                sleep((int)(Math.random()*4000)+1000);
            } catch (InterruptedException ex) {
                System.getLogger(Trabajador.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
                    almacen1.eleminarProducto();
        }
    }
}
