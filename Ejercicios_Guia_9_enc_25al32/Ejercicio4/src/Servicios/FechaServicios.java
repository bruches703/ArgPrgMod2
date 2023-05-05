/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class FechaServicios {
    Scanner leer = new Scanner(System.in);
    public Date fechaNacimiento(){
        System.out.println("Ingrese dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese anio de nacimiento");
        int anio = leer.nextInt();

        Date fechaNacimiento =new Date(dia,mes,anio);
        System.out.println(fechaNacimiento.toString());
        return fechaNacimiento;
    }
    
    public Date fechaActual(){
        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());
        return fechaActual;
    }
    
    public void diferencia(Date fecha1, Date fecha2){
        int anio1= fecha1.getYear();
        int anio2= fecha2.getYear();
        System.out.println(anio1+"         "+anio2);
        System.out.println("La diferencia de años es de: "+(anio1-anio2));
    }
}
