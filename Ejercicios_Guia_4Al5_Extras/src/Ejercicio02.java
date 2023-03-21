
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class Ejercicio02 {
    
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int a, b, c, d, aux; 
        a=1;
        b=2;
        c=3;
        d=4;
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de d: " + d);
        
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("-------------------------- \n ");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de d: " + d);
    }
    
}
