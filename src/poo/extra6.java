/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import entidad.Ahorcado;


/**
 *
 * @author NALDO
 */
public class extra6 {

    /**
     *Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Ahorcado a1 = new Ahorcado();
        a1.crearJuego();
   
        
       
        boolean flag=true;
       
       
       while(flag){
        flag=a1.juego();
       }
       
        System.out.println("PALABRA:\n");
        System.out.println(a1.getBuscar());
    
    }
    
}
