/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rigoberto
 */
public class Logica {

    List<Alumnos> ListAlumnos;

    public Logica() {
        this.ListAlumnos = new ArrayList<>();
    }

    public boolean ingresarAlumno(String nombre, String apellido, double nota) {
        boolean resp = false;
        
        try {
            this.ListAlumnos.add(new Alumnos(nombre, apellido, nota) );
            resp = true;
            JOptionPane.showMessageDialog(null, "Usted ingreso un nuevo alumno");
            System.err.println(nombre);
            System.err.println(apellido);
            System.err.println(nota);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return resp = false;
    }
    
    public List<Alumnos> getAlumnosReprovados(){
        List<Alumnos> reprovados = new ArrayList();
        
        try {
            for(Alumnos temp: this.ListAlumnos){
                if(temp.getNota() < 6){
                    reprovados.add(temp);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return reprovados;
    }
    
    public List<Alumnos> getAlumnoAprovado(){
        List<Alumnos> aprovados = new ArrayList();
  
        try {
          
        for(Alumnos temp : this.ListAlumnos){
            if(temp.getNota() > 6 ){
                aprovados.add(temp);
            }
        }  
        } catch (Exception e) {
            System.err.println(e);
        }
        
        
        return aprovados;
    }

}
