/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Persona12;
import java.util.Date;
import java.util.Scanner;



/**
 *• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
public class PersonaServicio12 {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Persona12 crearPersona(){
        
        Persona12 p1 = new Persona12();
        
        System.out.println("ingresar Nombre: ");
        p1.setName(leer.next());
        System.out.println("Ingresar fecha de nacimiento \n"
        +"AÑO:\n"
                + "MES: \n"
                + "DIA: \n");
        int anio= leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        p1.setNacimiento(fecha);
       
        return p1;
    }
    
    
    public void calcularEdad(Persona12 p1){
        
        
        Date fechaActual = new Date();
       
        int edad = (int)(fechaActual.getYear()-p1.getNacimiento().getYear());
        
        System.out.println("La edad de "+p1.getName()+" es "+edad+" años");
       
          
    }
    
    public void menorQue(Date edad, Persona12 p1) {

        if (p1.getNacimiento().after(edad)) {
            System.out.println(p1.getName() + " es menor");
        } else {
            System.out.println(p1.getName() + " es mayor");
        }

    }
    
    
    public void mostrarPersona(Persona12 p1){
        
        System.out.println("NOMBRE: "+p1.getName());
         String fechaCadena = p1.getNacimiento().toString();
         System.out.println("NACIMIENTO: "+fechaCadena);
    }
}