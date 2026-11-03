
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.ejercicio5extension;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Juan Antonio
 */
public class ventana extends JFrame{
    
    


    private JLabel titulo = new JLabel("CARRERA");
    private JLabel[][] celdas = new JLabel[5][10];
    
    
    public ventana(){

        setTitle("Competicion");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new MigLayout("wrap 10","fill"));

        add(titulo,"span11,wrap");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                celdas[i][j] = new JLabel("=");
                add(celdas[i][j]);
            }
        }
        
        celdas[0][0].setText("j1");
        celdas[1][0].setText("j2");
        celdas[2][0].setText("j3");
        celdas[3][0].setText("j4");
        celdas[4][0].setText("j5");
    }
    
    public void nuevaPosicion(int fila, int nueva){
        SwingUtilities.invokeLater(()->{
            for (int i = 0; i < 10; i++) {
                celdas[fila][i].setText("=");
            
            }
            celdas[fila][nueva].setText("j"+(fila));
        });
        
    }

}
