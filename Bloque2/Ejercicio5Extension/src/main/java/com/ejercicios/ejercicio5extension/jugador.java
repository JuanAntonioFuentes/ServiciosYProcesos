/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.ejercicio5extension;

/**
 *
 * @author Juan Antonio
 */
public class jugador extends Thread{
    

    
    String nombre;
    int fila;
    ventana ventana;

    public jugador(String no, int fi, ventana ve){

        this.nombre = no;
        this.fila = fi;
        this.ventana = ve;
        
    }

    public void run(){

        for (int i = 0; i < 10; i++) {
            int tiempo = (int)((Math.random()*2001
        )+1000);
            System.out.println("El jugador " + nombre +" va por la vuelta "+ (i+1));
            
            ventana.nuevaPosicion(fila,i);

            
            if (i==9) {
                System.out.println("El jugador " + nombre+ " a finalizado la carrera");
            }
            try {
                sleep(tiempo);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


    }
}
