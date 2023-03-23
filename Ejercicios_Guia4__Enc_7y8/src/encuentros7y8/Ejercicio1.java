/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros7y8;

import java.util.Scanner;

/**
 * Consigna:
 * 
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir 
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
 * función para cada operación matemática y deben devolver sus resultados para 
 * imprimirlos en el main. 
 * 
 * @author bruch
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println(dividicionDe_Y_(4, 5));
    }
    
    public static int sumaDe_Y_(int a, int b){
        return Math.addExact(a, b);
    }
    
    public static int dividicionDe_Y_(int a, int b){
        int resultado;
        if(b<=0){
            resultado=0;
        }else {
            resultado=Math.floorDiv(a, b);
        }
        return resultado;
    }
    public static int restaDe_Y_(int a, int b){
        return Math.subtractExact(a, b);
    }
    public static int multiplicacionDe_Y_(int a, int b){
        return Math.multiplyExact(a, b);
    }
}
