/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaicesServicios;

import Raices.Raices;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class RaicesServicios {
    Scanner leer = new Scanner(System.in);
    
    /**
     * Cargar los valores a, b y c del objeto de tipo Raices
     * @return 
     * Devuelve el objeto de tipo Raices con la carga de valores
     */
    public Raices cargaDeValores(){
        System.out.println("Ingrese el valor de <a> ");
        double a=leer.nextDouble();
        System.out.println("Ingrese el valor de <b> ");
        double b=leer.nextDouble();
        System.out.println("Ingrese el valor de <c> ");
        double c=leer.nextDouble();
        
        return new Raices(a,b,c);
    }
    
    /**
     * a)
     * Obtiene el valor de la discriminante y lo devuelve
     * 
     * @param raices 
     * Contiene los valores de a, b y c
     * 
     * @return 
     * Devuelve los valores del discriminante con la formula (b^2)-4*a*c
     */
    public double getDiscriminante(Raices raices){
        double a=raices.getA();
        double b=raices.getB();
        double c=raices.getC();
        
        return Math.pow(b, 2)-4*a*c;
    }
    
    /**
     * b)
     * @param raices
     * Contiene los valores de a, b y c
     * 
     * @return 
     * Devuelve TRUE si tiene raices, es decir que la discriminante es igual 
     * o mayor a 0(cero)
     */
    public boolean tieneRaices(Raices raices){
        double res=getDiscriminante(raices);
        return res>=0;
    }
    
    /**
     * b)
     * @param raices
     * Contiene los valores de a, b y c
     * 
     * @return 
     * Devuelve TRUE si tiene una unica raiz, es decir que la discriminante 
     * es igual a 0(cero)
     */
    public boolean tieneRaiz(Raices raices){
        double res=getDiscriminante(raices);
        return res==0;
    }
    
    /**
     * d)
     * De tener raices, los mostrara por pantalla
     * 
     * @param raices 
     * Contiene los valores de a, b y c
     */
    public void obtenerRaices(Raices raices){
        if(tieneRaices(raices)){
            double discriminante=getDiscriminante(raices); //obtener el discriminante
            System.out.println("Las raices son: ");
            System.out.println("Posible Raiz 1: "+(-raices.getB() +Math.sqrt(discriminante))/2*raices.getA());
            System.out.println("Posible Raiz 2: "+(-raices.getB() -Math.sqrt(discriminante))/2*raices.getA());
        }
    }
    
    /**
     * e)
     * De tener unja raiz, la mostrara por pantalla
     * 
     * @param raices 
     * Contiene los valores de a, b y c
     */
    public void obtenerRaiz(Raices raices){
        if(tieneRaiz(raices)){
            double discriminante=getDiscriminante(raices); //obtener el discriminante
            System.out.println("La raiz es: "+(-raices.getB() +Math.sqrt(discriminante))/2*raices.getA());
        }
    }
    
    /**
     * De tener raiz o raices las muestra por pantalla, de no tenerlas solo muestra
     * un mensaje
     * 
     * @param raices 
     * Contiene los valores de a, b y c
     */
    public void calcular(Raices raices){
        if(tieneRaices(raices) || tieneRaiz(raices)){
            if(tieneRaiz(raices)){
                obtenerRaiz(raices);
            }else{
                obtenerRaices(raices);
            }
        }else{
            System.out.println("No tiene solucion");
        }
    }
}
