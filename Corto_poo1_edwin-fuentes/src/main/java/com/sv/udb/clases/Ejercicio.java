/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.AbstractList;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author rigoberto
 */
public class Ejercicio {
    
    public List<Jugadores> jugadores; 
    public Ejercicio() {
        this.jugadores = new ArrayList<>();
    }
    
    //Esta es una funcion
    public boolean IngresarJugadores(String nombre, int edad, double estatura, double peso){
        boolean hola = false;
        //puta que cerote no teoques nada
        try {
            this.jugadores.add(new Jugadores(nombre, edad, estatura, peso));
            hola = true;
            JOptionPane.showMessageDialog(null,"Guardo un nuevo jugador");
            System.out.println(nombre);
            System.out.println(edad);
            System.out.println(estatura);
            System.out.println(peso);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return hola;
        
    }
    
}
