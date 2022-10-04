/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class CircunferenciaServicio {
    
    
    public Circunferencia crearCircunferencia(){
        
        Scanner leer = new Scanner (System.in);
        Circunferencia radio = new Circunferencia();
        
        System.out.println("ingrese el radio: ");
        radio.setRadio(leer.nextDouble());
        
        return radio;
    }
    
    public void area(Circunferencia radio){
        Double area;
        
        area= 3.14*radio.getRadio()*radio.getRadio();
        System.out.println("el area de la circunferencia es: "+area);
    }
    
    public void perimetro(Circunferencia radio){
        double peri;
        
        peri=2*3.14*radio.getRadio();
        System.out.println("el perimetro de la circunferencia es: "+peri);
    }
}
