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
        Persona[] persona = cargarTodasLasPersonas(nP);     
        boolean [] edad = calcularMayoriaDeEdad(persona, nP); 
        int [] peso = calcularIMCDePersonas(persona, nP);
        
        /*persona[0]= new Persona("asd",21,"h",50,1.30);
        persona[1]= new Persona("asd",10,"h",40,2.10);
        persona[2]= new Persona("asd",11,"h",75,1.60);
        persona[3]= new Persona("asd",25,"h",20,1.90);*/

        System.out.println("Porcentaje de mayoria de edad: "+porcentajeDeMayores(edad)+"%");
        System.out.println("");
        porcentajeDeIMCIdeal(peso);
    }    
    
    
    public static void porcentajeDeIMCIdeal(int[] peso){
        int a=0,b=0,c=0;
        for (int i = 0; i < peso.length; i++) {
            switch (peso[i]) {
                case -1:
                    a++;
                    break;
                case 0:
                    b++;
                    break;
                default:
                    c++;
                    break;
            }
        }
        System.out.println("Porcentaje de personas baja de peso: "+a*100/peso.length);
        System.out.println("Porcentaje de personas de peso correcto: "+b*100/peso.length);
        System.out.println("Porcentaje de personas de sobre peso: "+c*100/peso.length);
    }
    
    public static double porcentajeDeMayores(boolean[] edad){
        int cont=0;
        for (int i = 0; i < edad.length; i++) {
            if(edad[i]){
                cont++;
            }
        }
        return (cont*100)/edad.length;
    }
    
    public static int[] calcularIMCDePersonas(Persona[] persona, ServicioPersona np){
        int vector[] = new int[4];
        for (int i = 0; i < persona.length; i++) {
            vector[i]=np.calcularIMC(persona[i]);
        }
        return vector;
    }
    
    public static boolean[] calcularMayoriaDeEdad(Persona[] persona, ServicioPersona np){
        boolean vector[] = new boolean[4];
        for (int i = 0; i < 4; i++) {
            vector[i]=np.esMayorDeEdad(persona[i]);
        }
        return vector;
    }
    
    public static Persona[] cargarTodasLasPersonas(ServicioPersona np){
        Persona[] persona = new Persona[4];
        for (int i = 0; i < persona.length; i++) {
            persona[i]= np.crearPersona();
        }
        return persona;
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
