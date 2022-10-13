/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class RectanguloServicio {
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner (System.in);
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("ingrese la altura del rectangulo");
        r1.setAltura(leer.nextDouble());
        System.out.println("ingrese la base del rectangulo");
        r1.setBase(leer.nextDouble());
        
        return r1;
    }
    
    public void calcularSuperficie(Rectangulo r1){
    
        double superficie;
        superficie = r1.getBase() * r1.getAltura();
        System.out.println("la superficie del rectangulo es: "+superficie);
} 
    public void calcularPerimetro(Rectangulo r1){
        
        double perimetro;
        perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("el perimetro del rectangulo es: "+perimetro);
    }
    
    public void graficarRectangulo(Rectangulo r1){
        
        
       for (int i = 1; i <= r1.getAltura(); i++) {
            for (int j = 1; j <= r1.getBase(); j++) {
                if ((i == 1) || (i == r1.getAltura())
                        || (j == 1) || (j == r1.getBase())) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

            System.out.println("");
    }
    
}
