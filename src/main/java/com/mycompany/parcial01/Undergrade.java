/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Maria Catalina Hernandez Casas C.C 1017184198

package com.mycompany.parcial01;

public class Undergrade extends Estudiante
{
    //Se adiciona atributo gpa
    private double gpa;
    
    //Se crea constructr con los tres atributos
    public Undergrade(String nombre,double gpa) {
        this.nombre = nombre;
        this.gradoLetra = ' ';
        this.gpa = gpa;
    }
    

    @Override
    public void setGradoLetra() {
        if(90<=gpa && gpa<=100)
        {
            this.gradoLetra='a';
        }else if(80<=gpa && gpa<90)
        {
            this.gradoLetra='b';
        }else if(70<=gpa && gpa<80)
        {
            this.gradoLetra='c';
        }else if(60<=gpa && gpa<=70)
        {
            this.gradoLetra='d';
        }else
        {
            this.gradoLetra='f';
        }
    }
    
}
