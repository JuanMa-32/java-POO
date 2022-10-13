/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *



• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.

 */
public class PersonaServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        
        System.out.println("ingresar Nombre");
        p1.setNombre(leer.next());
        
        System.out.println("ingresar Edad");
        p1.setEdad(leer.nextInt());
        
        
        System.out.println("Ingresar Sexo");
        p1.setSexo(leer.next());

        if (!(p1.getSexo().equalsIgnoreCase("h") || p1.getSexo().equalsIgnoreCase("m") || p1.getSexo().equalsIgnoreCase("o"))){
            System.out.println("ERROR\n"
            +"dato mal ingresado");
        }
        
        System.out.println("ingrese Altura");
        p1.setAltura(leer.nextDouble());
        
        System.out.println("ingrese Peso");
        p1.setPeso(leer.nextDouble());
        
        return p1;
    }
    
    public int calcularIMC(Persona p1){
        int resp=0;
        double calcularP;
        
        calcularP= p1.getPeso()/(p1.getAltura()*p1.getAltura());
        
        if (calcularP<20){
            resp=-1;
        }else if (calcularP>=20 && calcularP<=25){
            resp=0;
        }else if (calcularP>25){
            resp=1;
        }
        
        return resp;
    }
    
    public boolean esMayorDeEdad(Persona p1){
        boolean resp=false;
        
        if (p1.getEdad()>=18){
            resp=true;
        }
        
        return resp;
    }
}
