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
    
    //se declara globalmente la lista
    public List<Jugadores> jugadores;
    
    public Ejercicio() {
        //se inicializa la lista
        this.jugadores = new ArrayList<>();
    }
    
    /**
     * 
     * @param nombre
     * @param edad
     * @param estatura
     * @param peso
     * @return boolean
     * En esta funcion se ingresan los futbolistas
     */
    public boolean IngresarJugadores(String nombre, int edad, double estatura, double peso){
        boolean hola = false;
        //aqui se agregan los parametros a la lista y dentro de ella se instancian los parametros
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
    
    public Jugadores getJugadorMasAlto()
    {
        Jugadores resp = null;
        try
        {
            double contador = 0;
            for(Jugadores temp : this.jugadores)
            {
                if(contador < temp.getEstatura())
                {
                    resp = temp;
                }
            }
        }
        catch(Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return resp;
    }
    
}
