//Mostrar en una ventana

import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() ->{

        ventana ventana1 = new ventana();
        ventana1.setVisible(true);
        
        jugador j1 = new jugador("j1",0,ventana1);
        jugador j2 = new jugador("j2",1,ventana1);
        jugador j3 = new jugador("j3",2,ventana1);
        jugador j4 = new jugador("j4",3,ventana1);
        jugador j5 = new jugador("j5",4,ventana1);

        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();
    });
    }
}
