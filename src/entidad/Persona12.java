/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;

/**
 *
 * @author NALDO
 */
public class Persona12 {
    
    //atributos
    private String name;
    private Date nacimiento;
    
    //constructor vacio

    public Persona12() {
    }
    //contructor con los parametros

    public Persona12(String name, Date nacimiento) {
        this.name = name;
        this.nacimiento = nacimiento;
    }
    //getter && setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
}
