/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Maria Catalina Hernandez Casas C.C 1017184198

package com.mycompany.parcial01;

public abstract class Estudiante 
{
    //Declaro atributos
    protected String nombre;
    protected char gradoLetra;

    //Aniado getters de los atributos
    public String getNombre() {
        return nombre;
    }
    
    public char getGradoLetra() {
        return gradoLetra;
    }
    
    //aniado setGradoLetra como abstract
    abstract public void setGradoLetra();
    
}
