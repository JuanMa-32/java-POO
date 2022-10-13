/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Servicio.PersonaServicio;
import entidad.Persona;

/**
 *
 
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      
        PersonaServicio ps = new PersonaServicio();
        Persona [] pers = new Persona[4];
        //variables para sacar el porcentaje de peso
        int debajo=0;
        int pIdeal=0;
        int sobreP=0;
        //varaibles para porcentaje de edad
        int may=0;
        int men=0;
        
         
        for (int i = 0; i < 4; i++) {
            pers[i] = ps.crearPersona();
            //calcular peso
            System.out.println("-------------------------------------");
            if (ps.calcularIMC(pers[i]) == -1) {
                System.out.println("Esta por debajo de su peso ideal");
                debajo++;
            } else if (ps.calcularIMC(pers[i]) == 0) {
                System.out.println("Esta en su peso ideal");
                pIdeal++;
            } else {
                System.out.println("Tiene sobrepeso");
                sobreP++;
            }
            //calcular si es mayor de edad
            
            if (ps.esMayorDeEdad(pers[i])==true){
                System.out.println("ES MAYOR DE EDAD");
                may++;
            }else{
                
                System.out.println("ES MENOR DE EDAD");
                men++;
            }
            System.out.println("--------------------------------------");
        }
        
        double porDebajo=(debajo*100)/4;
        double ideal=(pIdeal*100)/4;
        double gordo=(sobreP*100)/4;
        
        double pMayores=(may*100)/4;
        double pMenores=(men*100)/4;
      
        
        System.out.println("PORCENTAJES PESOS\n"
        +"Personas por debajo de su peso ideal: "+porDebajo+"\n"
        +"Personas con peso ideal: "+ideal+"\n"
        +"Personas con sobrepeso: "+gordo+"\n");
           
        System.out.println("PORCENTAJES EDAD\n"
          +"Personas mayores de edad: "+pMayores+"\n"
          +"Personas menores de edad: "+pMenores+"\n");  
      
       
        
        
        
    }
    
}
