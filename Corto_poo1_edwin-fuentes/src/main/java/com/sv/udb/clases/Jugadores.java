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

    String nombre;
    int edad;
    double estatura, peso;

    ArrayList jugadores = new ArrayList();
    ArrayList<Integer> jugadores2 = new ArrayList();
    ArrayList<Integer> jugadores3 = new ArrayList();
    ArrayList<Integer> jugadores4 = new ArrayList();

    public Jugadores() {
    }

    public Jugadores(String nombre, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Integer> getJugadores2() {
        return jugadores2;
    }

    public void setJugadores2(ArrayList<Integer> jugadores2) {
        this.jugadores2 = jugadores2;
    }

    public ArrayList<Integer> getJugadores3() {
        return jugadores3;
    }

    public void setJugadores3(ArrayList<Integer> jugadores3) {
        this.jugadores3 = jugadores3;
    }

    public ArrayList<Integer> getJugadores4() {
        return jugadores4;
    }

    public void setJugadores4(ArrayList<Integer> jugadores4) {
        this.jugadores4 = jugadores4;
    }

    
    
    public String MostrarMasAlto() {
        String hola = "";
        // Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(this.jugadores2, Collections.reverseOrder());
        for (int altura : this.jugadores2) {
            System.out.println(altura);
        }

        return hola;
    }

    public String MostarMenorEdad() {
        String hola = "";

        Collections.sort(jugadores3);
        for (int edad : this.jugadores3) {
            System.out.println(edad);
        }

        return hola;
    }

    public String MostrarMasPeso() {
        String hola = "";

        Collections.sort(this.jugadores4, Collections.reverseOrder());
        for (int peso : this.jugadores4) {
            System.out.println(peso);
        }

        return hola;
    }
}
