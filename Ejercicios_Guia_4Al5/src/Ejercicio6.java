
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
public class Ejercicio6 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int opc;
        boolean salir=false;
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segfundo número");
        int num2 = leer.nextInt();
        do {
            System.out.println("MENU");
            System.out.println("1-Sumar");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("Ingrese opcion:");
            opc = leer.nextInt();
            
                switch (opc){
                    case 1:
                        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                        System.out.println("\n\n\n");
                        break;
                    case 2:
                        System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                        System.out.println("\n\n\n");
                        break;
                    case 3:
                        System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
                        System.out.println("\n\n\n");
                        break;
                    case 4:
                        if (num2==0){
                            System.out.println("El divisor no puede 0 (cero)");
                        } else {
                            System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
                        }
                        System.out.println("\n\n\n");
                        break;
                    case 5:
                        salir=true;
                        System.out.println("Se salio del programa correctamente");
                        break;
                }
        } while (!salir);
        
    }
}

