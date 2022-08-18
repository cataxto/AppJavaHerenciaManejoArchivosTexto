/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Maria Catalina Hernandez Casas C.C 1017184198

package com.mycompany.parcial01;

public class Graduado extends Estudiante
{
    //declaro atributtos adicionales
    private boolean pass1, pass2, pass3;
    
    //Constructor

    public Graduado(String nombre, char a, char b, char c) {
        this.nombre = nombre;
        this.pass1 = (a=='P');
        this.pass2 = (b=='P');
        this.pass3 = (c=='P');
    }

    @Override
    public void setGradoLetra() {
        if(pass1==pass2 && pass2==pass3)
            this.gradoLetra='P';
        else
            this.gradoLetra='N';

    }
    
    
    
    
}
