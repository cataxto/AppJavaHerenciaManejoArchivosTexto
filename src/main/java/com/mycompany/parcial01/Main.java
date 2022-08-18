/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//Maria Catalina Hernandez Casas C.C 1017184198


package com.mycompany.parcial01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Estudiante[] arregloEstudiantes = new Estudiante[10];
        String rutaInput="D:\\Catalina\\Udea\\2022-I\\TecnicasProgramacionYLaboratorio\\Parcial\\Parcial1\\input.txt";
        String rutaOutput="D:\\Catalina\\Udea\\2022-I\\TecnicasProgramacionYLaboratorio\\Parcial\\Parcial1\\output.txt";;
        String textoLinea;
        String[] arrTextoLinea;
        FileReader fEst;
        BufferedReader br;
        FileWriter fOut;
        Estudiante unEstudiante;
        int pCal1, pCal2, pCal3;
        char pVal1, pVal2, pVal3;
        String pNombre="";
        double promNotas;
        
        //Inicializamos los objetos File para lectura y escritura del txt
        fEst = new FileReader(rutaInput);
        br = new BufferedReader(fEst);
        fOut = new FileWriter(rutaOutput);
        
        textoLinea = br.readLine(); //leer prmera linea
        int posLinea=0; //
        while(textoLinea!=null) //Iterar por cada linea
        {
            //System.out.println(textoLinea);
            
            
//            if(textoLinea!=null)
//            {
//                arrTextoLinea = textoLinea.split(" ",4);
//                for(String a:arrTextoLinea)
//                {
//                    System.out.print(a+" -- ");
//                    System.out.println("tipo de pos1"+typeof);
//                }
//            }
            
            //Separamos los componentes d einformacion de cada linea
                arrTextoLinea = textoLinea.split(" ",4);
                
                //Extraigamos el valor de Nombre
                pNombre=arrTextoLinea[0];
            
            if(posLinea<5) //Primero trabajaremos en los undergrade (Lineas 0 a la 4)
            {
                //Pasamos a entero las calificaciones
                pCal1 = Integer.parseInt(arrTextoLinea[1]);
                pCal2 = Integer.parseInt(arrTextoLinea[2]);
                pCal3 = Integer.parseInt(arrTextoLinea[3]);
                
                //Calculamos el promedio
                promNotas = (pCal1+pCal2+pCal3)/3;
                
                //Instanciamos el objeto en el arreglo estudiantes
                arregloEstudiantes[posLinea] =new Undergrade(pNombre, promNotas);
                arregloEstudiantes[posLinea].setGradoLetra();
                unEstudiante=arregloEstudiantes[posLinea];
                //Imprimimos en una linea de output.txt
                fOut.write(unEstudiante.getNombre()+" "+unEstudiante.getGradoLetra()+"\n");
                //guardamos los cambioos en el output.txt
                fOut.flush();
            } 
            else // //Segundo trabajaremos en los graduados (Lineas 5 a la 9)
            {
                //Pasamos a char las valoraciones
                pVal1 = arrTextoLinea[1].charAt(0);
                pVal2 = arrTextoLinea[2].charAt(0);
                pVal3 = arrTextoLinea[3].charAt(0);
                
                //Instanciamos el objeto en el arreglo estudiantes
                arregloEstudiantes[posLinea] =new Graduado(pNombre, pVal1, pVal2, pVal3);
                arregloEstudiantes[posLinea].setGradoLetra();
                unEstudiante=arregloEstudiantes[posLinea];
                //Imprimimos en una linea de output.txt
                fOut.write(unEstudiante.getNombre()+" "+unEstudiante.getGradoLetra()+"\n");
                //guardamos los cambioos en el output.txt
                fOut.flush();
            } 
            
            //Avanzamos siguiente posicion y siguiente linea del archivo
            posLinea++;
            textoLinea = br.readLine();
        }
    }
}
