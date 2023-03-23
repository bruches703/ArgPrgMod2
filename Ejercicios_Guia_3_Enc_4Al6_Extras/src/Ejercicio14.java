
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
public class Ejercicio14 {
        public static void main (String[] args){
            Scanner leer = new Scanner(System.in);
        
            System.out.println("Ingrese la cantidad de familias:");
            int n = leer.nextInt();
            int m,sumaEdad=0, cantHijos=0;
            
            for (int i = 0; i < n; i++) {
                System.out.println("");
                System.out.println("Cuantos hijos tiene la "+(i+1)+"° familia? Ingrese:");
                m=leer.nextInt();
                cantHijos=cantHijos+m;
                for (int j = 0; j < m; j++) {
                    System.out.println("Ingrese la edad del "+(j+1)+"° hijo/a");
                    sumaEdad = sumaEdad+leer.nextInt();
                }
            }
            
            System.out.println("La media de edad es: "+(sumaEdad/cantHijos));
        }
}
