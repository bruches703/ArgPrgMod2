
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
public class Ejercicio13 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese número: ");
        int num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((j+1));
            }         
            System.out.println(" ");
        }
        
    }
}
