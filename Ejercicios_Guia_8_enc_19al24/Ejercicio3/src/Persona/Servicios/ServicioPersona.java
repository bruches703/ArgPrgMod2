/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.Servicios;

import Persona.newpackage.Persona;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class ServicioPersona {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad()>=18;
    }
    
    public Persona crearPersona(){
        String sexo;
        
        System.out.println("Ingrese nombre: ");
        String nombre=leer.next();
        
        System.out.println("Ingrese edad: ");
        int edad=leer.nextInt();
        
        System.out.println("Ingrese sexo H/M/O: ");       
        sexo=leer.next();
        while(!"h".equalsIgnoreCase(sexo) && !"m".equals(sexo) && !"o".equals(sexo)){
            System.out.println("Error, reingrese el sexo: ");
            sexo=leer.next();
        }
        
        System.out.println("Ingrese peso:");
        double peso=leer.nextDouble();
        
        System.out.println("Ingrese altura: ");
        double altura=leer.nextDouble();
        
        System.out.println("\n\n");
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int  calcularIMC(Persona persona){
        int opc;
        double calculoPeso;
        calculoPeso= (persona.getPeso()/(Math.pow(persona.getAltura(),2)));
        if(calculoPeso<20){
            opc=-1;
        }else if(calculoPeso>=20 || calculoPeso<=25){
            opc=0;
        }else{
            opc=1;
        }
        return opc;
    }
    
 
}
