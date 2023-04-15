/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Persona.Servicios.ServicioPersona;
import Persona.newpackage.Persona;

/**
 *
 * @author bruch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPersona nP = new ServicioPersona();
        Persona persona = nP.crearPersona();
        mensajeDeEdad(persona,nP);
        calculoDePeso(persona, nP);
        
    }
    
    public static void mensajeDeEdad(Persona persona, ServicioPersona nP){
        System.out.println("");
        if(nP.esMayorDeEdad(persona)){
            System.out.println("Es mayor");
        } else {
            System.out.println("Es menor");
        }
        System.out.println("");
    }
    
    public static void calculoDePeso(Persona persona, ServicioPersona nP){
        int calculo=nP.calcularIMC(persona);
        System.out.println("--------------------------------");
        switch (calculo) {
            case -1:
                System.out.println("Esta bajo de peso");
                break;
            case 0:
                System.out.println("El peso es ideal");
                break;
            default:
                System.out.println("Esta pasado de peso");
                break;
        }
        System.out.println("--------------------------------");

    }
    
}
