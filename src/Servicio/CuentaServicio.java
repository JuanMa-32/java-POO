/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Cuenta;
import java.util.Scanner;

/**
 *
 *
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class CuentaServicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
   
    public Cuenta ingresar(){
        
        Cuenta c1 = new Cuenta();
        System.out.println("NUMERO DE CUENTA: ");
        c1.setNcuenta(leer.nextInt());
        System.out.println("NUMERO DE D.N.I: ");
        c1.setDni(leer.nextLong());
        System.out.println("SALDO ACTUAL: ");
        c1.setSaldoActual(leer.nextInt());
        
        return c1;
    }
    
    public void ingresarDinero(Cuenta c1){
         int ingreso;
        System.out.println("Ingrese la cantidad de dinero: ");
        ingreso = leer.nextInt();
        
        c1.setSaldoActual(c1.getSaldoActual()+ingreso);

    } 
    
     public void retirar(Cuenta c1){
         int retiro;
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        retiro = leer.nextInt();
        
        if(c1.getSaldoActual()<retiro){
            c1.setSaldoActual(0);
        }else{
        c1.setSaldoActual(c1.getSaldoActual()-retiro);
        }

    } 
     
       public void extraccionRapida(Cuenta c1){
         int extraccion;
         int porc;
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        extraccion = leer.nextInt();
        porc=c1.getSaldoActual()*20/100;
        
        if(extraccion>porc){
            System.out.println("el dinero a retirar excede el limite ");
        }else{
            System.out.println("extraccion exitosa!");
             c1.setSaldoActual(c1.getSaldoActual()-extraccion);
        }

    } 
       
       public void consultarSueldo(Cuenta c1){
           
           System.out.println("SALDO ACTUAL: ");
           System.out.println(c1.getSaldoActual());
       }
       public void mostrarDatos(Cuenta c1){
           
           System.out.println("NUMERO DE CUENTA: ");
           System.out.println(c1.getNcuenta());
           System.out.println("D.N.I");
           System.out.println(c1.getDni());
       }
       
       public void menu(Cuenta c1){
           
           boolean flag=true;
             CuentaServicio rs = new CuentaServicio();
             
           
           while (flag){
               System.out.println("-----------------");
            System.out.println("ingrese su opcion \n"
                    + "1. ingresar saldo\n"
                    + "2. retirar saldo\n"
                    + "3. extraccion rapida\n"
                    + "4. consultar saldo\n"
                    + "5. datos de la cuenta\n"
                    + "6. salir\n");
            System.out.println("-----------------");
            int opcion = leer.nextInt();
            System.out.println("-----------------");
            switch (opcion){
                case 1:
                    rs.ingresarDinero(c1);
                    break;
                 case 2:
                    rs.retirar(c1);
                    break;
                 case 3:
                    rs.extraccionRapida(c1);
                    break;
                 case 4:
                    rs.consultarSueldo(c1);
                    break;
                 case 5:
                    rs.mostrarDatos(c1);
                    break;
                 case 6:
                     System.out.println("saliendo...");
                     flag=false;
            }
            

           }
       }
}
