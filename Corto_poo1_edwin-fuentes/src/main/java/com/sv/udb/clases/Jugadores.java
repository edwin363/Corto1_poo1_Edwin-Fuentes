/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Estudiante
 */
public class Jugadores {

    String nombre, edad, estatura, peso;

    ArrayList jugadores = new ArrayList();
    ArrayList<Integer> jugadores2 = new ArrayList();
    ArrayList<Integer> jugadores3 = new ArrayList();
    ArrayList<Integer> jugadores4 = new ArrayList();
    public Jugadores() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }


    //Esta es una funcion
    public void RegistroJugadores(String nombre, String edad, String estatura, String peso) {

        try {
            this.nombre = nombre;
            this.edad = edad;
            this.estatura = estatura;
            this.peso = peso;

            //this.jugadores2.add(nombre);
            //this.jugadores2.add(edad);
            this.jugadores2.add(Integer.parseInt(this.estatura));
            this.jugadores3.add(Integer.parseInt(this.edad));
            this.jugadores4.add(Integer.parseInt(this.peso));
            //this.jugadores2.add(peso);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    public String MostrarMasAlto(){
        String hola = "";
           // Comparator<Integer> comparator = Collections.reverseOrder();
            Collections.sort(this.jugadores2,Collections.reverseOrder() );
            for(int altura: this.jugadores2){
                System.out.println(altura);
            }
            
        return hola;
    }
     public String MostarMenorEdad(){
         String hola = "";
         
         Collections.sort(jugadores3);
         for(int edad: this.jugadores3){
             System.out.println(edad);
         }
         
         return hola;
     }
     
     public String MostrarMasPeso(){
         String hola = "";
         
         Collections.sort(this.jugadores4,Collections.reverseOrder() );
            for(int peso: this.jugadores4){
                System.out.println(peso);
            }
         
         return hola;
     }
}
