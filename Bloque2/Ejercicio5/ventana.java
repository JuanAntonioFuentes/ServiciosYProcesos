
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class ventana extends JFrame{
    
    


    private JLabel titulo = new JLabel("CARRERA");
    private JLabel[][] celdas = new JLabel[5][11];
    
    
    public ventana(){

        setTitle("Competicion");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new MigLayout("wrap 11"));

    }

}
