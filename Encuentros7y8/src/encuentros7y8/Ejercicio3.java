/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros7y8;

import java.util.Scanner;

/**
 * Consigna
 * 
 * Crea una aplicación que a través de una función nos convierta una cantidad
 * de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
 * la moneda a convertir que será una cadena, este no devolverá ningún valor 
 * y mostrará un mensaje indicando el cambio (void).
 * El cambio de divisas es:
 *          A-0.86 libras es un 1 €
 *          B-1.28611 $ es un 1 €
 *          C-129.852 yenes es un 1 €
 *
 *
 * @author bruch
 */

public class Ejercicio3 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el monto: ");
        double monto=leer.nextInt();
        
        System.out.println("Escoja la moneda a convertir:");
        System.out.println("1-Libras\n2-Dolares\n3-Yenes");
        int opc = leer.nextInt();
        while(opc!=1 && opc!=2 && opc!=3){
            System.out.println("Opcion incorrecta, reingrese");
            System.out.println("1-Libras\n2-Dolares\n3-Yenes");
            opc = leer.nextInt();
        }
        conversion(monto,opc);
        
    }
    
    public static void conversion(double monto, int opc){
        System.out.println("\n\nSu monto: "+monto);
        switch(opc){
            case 1:                
                System.out.println("Monto en libras: "+ (monto*0.86));
                break;
            case 2:
                System.out.println("Monto en dolares: "+ (monto*1.28611));
                break;
            case 3:
                System.out.println("Monto en yenes: "+ (monto*129.852));
                break;
        }
    }
}
