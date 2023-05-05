/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class PersonaServicios {
    Scanner leer=new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese nombre de la persona: ");
        String nombre=leer.nextLine();
        
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anio de nacimiento: ");
        int anio = leer.nextInt();

        return new Persona(nombre, new Date(anio-1900,mes-1,dia));
    }
    
    public int calcularEdad(Persona persona){
        Date fechaActual= new Date();
        Date fechaNacimiento=persona.getFechaNacimiento();
        return fechaActual.getYear()-fechaNacimiento.getYear();
    }
    
    public boolean esMenorQue(Persona persona, int edad){
        return calcularEdad(persona)<edad;
    }
    public void mostrarPersona(Persona persona){
        Date fechaNacimiento=persona.getFechaNacimiento();
        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Fecha de nacimiento: "+ fechaNacimiento.toString());
    }
}
