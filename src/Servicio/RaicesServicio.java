/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Raices;
import java.util.Scanner;

/**
 *• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
     
 * @author NALDO
 */
public class RaicesServicio {
    
    
    Scanner leer = new Scanner (System.in);
    
    public Raices ingresarDatos(){
         Raices r1 = new Raices(); 
         System.out.println("ingresar el valor de \n"
                + "A:\n"
                + "B:\n"
                + "C:\n");
      
        r1.setA(leer.nextInt());
        r1.setB(leer.nextInt());
        r1.setC(leer.nextInt());
        
        return r1;
    }
    
    
    public double getDiscriminante(Raices r1){
        
        double resp;
        resp = (Math.pow(r1.getB(), 2)) - 4 * r1.getA() * r1.getC();

        return resp;
    }
    
    public boolean tieneRaices(Raices r1){
        
        boolean resp=false;
      
      if(  getDiscriminante( r1)>=0){
          resp=true;
          System.out.println("Tiene 2 posibles soluciones "+resp);
      }  
        
      return resp;
    }
    
     public boolean tieneRaiz(Raices r1){
        
        boolean resp=false;
      
      if(  getDiscriminante( r1)==0){
          resp=true;
          System.out.println("Tiene una posible solucione "+resp);
      }  
        
      return resp;
    }
     
     public void obtenerRaices(Raices valor){
         
            if (tieneRaices(valor) == true) {
            System.out.println("primera solucion = -" + valor.getB() + "+√((" + valor.getB() + "^2)-(4*" + valor.getA() + "*" + valor.getC() + ")))/2*" + valor.getA() + ")");
            System.out.println("segunda solucion = -" + valor.getB() + "-√((" + valor.getB() + "^2)-(4*" + valor.getA() + "*" + valor.getC() + ")))/2*" + valor.getA() + ")");

     }
     }
     
     public void obtenerRaiz(Raices valor){
         if (tieneRaiz(valor)==true){
          System.out.println("primera solucion = -" + valor.getB() + "+√((" + valor.getB() + "^2)-(4*" + valor.getA() + "*" + valor.getC() + ")))/2*" + valor.getA() + ")");
         }
     }
     
     public void calcular(Raices valor){
         
         if (tieneRaiz(valor) == true) {
            
            double resultado = (-valor.getB()+Math.sqrt(valor.getB()*valor.getB()-4*valor.getA()*valor.getC()))/2*valor.getA();
            System.out.println("primer resultado = "+resultado);
        }else if (tieneRaices(valor) == true) {
            double resultado = (-valor.getB()+Math.sqrt(valor.getB()*valor.getB()-4*valor.getA()*valor.getC()))/2*valor.getA();
            System.out.println("primer resultado = "+resultado);
            
            double resultado1 = (-valor.getB()-Math.sqrt(valor.getB()*valor.getB()-4*valor.getA()*valor.getC()))/2*valor.getA();
            System.out.println("segundo resultado = "+ resultado1);
        }else{
            System.out.println("No hay solucion.");
        }

     }
}
