
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
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado");
        int lados = leer.nextInt();
        
        for (int i = 0; i < lados; i++) {
            
            for (int j = 0; j < lados; j++) {  
                if(i==0 || i==lados-1){
                    System.out.print("*");   
                } else if (j==0 || j==lados-1){     
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
             System.out.print("\n");
        }
    }
            
}
