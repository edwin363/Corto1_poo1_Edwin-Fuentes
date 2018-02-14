/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author rigoberto
 */
public class Alumnos {
    private String nombre;
    private String apellido;
    private double nota;

    public Alumnos(String nombre, String apellido, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public Alumnos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
    
}
