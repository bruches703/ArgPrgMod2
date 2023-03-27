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
        
        System.out.println("Ingrese primer número: ");
        int num1=leer.nextInt();
        System.out.println("Ingrese segundo número: ");
        int num2=leer.nextInt();
        
        switch(menu()){
            case 1:
                System.out.println("La resta es: "+sumaDe_Y_(num2, num2));
                break;
            case 2:
                System.out.println("La resta es: "+restaDe_Y_(num1, num2));
                break;
            case 3:
                System.out.println("La resta es: "+multiplicacionDe_Y_(num1, num2));
                break;
            case 4:
                System.out.println("La resta es: "+dividicionDe_Y_(num1, num2));
                break;
            default:
                System.out.println("Opcion no válida, reinicie");
                break;
        }

        
        System.out.println(dividicionDe_Y_(4, 5));
    }
    
    public static int menu(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese opción:");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        int opcion=leer.nextInt();
        return opcion;
    }
    
    public static int sumaDe_Y_(int a, int b){
        //suma entre a y b
        return Math.addExact(a, b);
    }
    
    public static int dividicionDe_Y_(int a, int b){
        //division entre a y b
        int resultado;
        if(b<=0){
            resultado=0;
        }else {
            resultado=Math.floorDiv(a, b);
        }
        return resultado;
    }
    public static int restaDe_Y_(int a, int b){
        //resta entre a y b
        return Math.subtractExact(a, b);
    }
    public static int multiplicacionDe_Y_(int a, int b){
        // multiplicacion entre a y b
        return Math.multiplyExact(a, b);
    }
}
