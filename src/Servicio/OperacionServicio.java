/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class OperacionServicio {
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner (System.in);
        Operacion op = new Operacion();
        
        System.out.println("ingrese el primer numero");
        op.setN1(leer.nextInt());
        System.out.println("ingrese el segundo numero");
        op.setN2(leer.nextInt());
        
        return op;
    }
    
    public void sumar(Operacion op){
        int total= op.getN1()+op.getN2();
        System.out.println(op.getN1()+" + "+op.getN2()+" = "+total);
    }
    
     public void restar(Operacion op){
        int total= op.getN1()-op.getN2();
        System.out.println(op.getN1()+" - "+op.getN2()+" = "+total);
    }
     
      public void mult(Operacion op){
        int total= op.getN1()*op.getN2();
        if (op.getN1()==0 || op.getN2()==0){
            System.out.println("ERROR AL MULTPILICAR POR 0");
             System.out.println(op.getN1()+" x "+op.getN2()+" = "+0);
        }else{
             System.out.println(op.getN1()+" x "+op.getN2()+" = "+total);
        }
    }
      
       public void div(Operacion op){
        double total= op.getN1()+op.getN2();
         if (op.getN1()==0 || op.getN2()==0){
            System.out.println("ERROR AL dividir POR 0");
             System.out.println(op.getN1()+" / "+op.getN2()+" = "+0);
        }else{
             System.out.println(op.getN1()+" / "+op.getN2()+" = "+total);
        }
    }
       
}
