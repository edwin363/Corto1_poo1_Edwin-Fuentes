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
    
    //declaramos variables globales
    String nombre;
    int edad;
    double estatura, peso;
    
    //constructor que siempre se ejecuta cuando se instancia la clase
    public Jugadores() {
    }
    
    //constructor con parametros de las variables que ocuparemos
    public Jugadores(String nombre, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    
    
    //seteo de los datos que ocuparemos
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
    
    @Override
    public String toString() {
        return this.nombre;
    }

}
