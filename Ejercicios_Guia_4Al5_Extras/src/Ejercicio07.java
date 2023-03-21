
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

//VERSION 1...
/*
public class Ejercicio07 {
    public static void main (String[] args){
    
        int i, num, min, max;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de veces que ingresara números:");
        int cant = leer.nextInt();
        
        i=0;
        min=0;
        max=0;
        while(i<cant){
            System.out.println("Ingrese el "+ (i+1)+ "° número:");
            num = leer.nextInt();
            
            if(i==0 || num<min){
                min=num;
            }
            
            if (i==0 || max<num){
                max=num;
            }

            i++;
        }
        
        System.out.println("El numero de valor máximo es: "+ max);
        System.out.println("El número de valor mínimo es: "+ min);
    }
}
*/
//VERSION 2....

public class Ejercicio07 {
    public static void main (String[] args){
    
        int i, num, min, max;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de veces que ingresara números:");
        int cant = leer.nextInt();
        
        i=0;
        min=0;
        max=0;
        if(cant>=1){
            do{
                System.out.println("Ingrese el "+ (i+1)+ "° número:");
                num = leer.nextInt();

                if(i==0 || num<min){
                    min=num;
                }

                if (i==0 || max<num){
                    max=num;
                }

                i++;
            }while(i<cant);
        }
        System.out.println("El numero de valor máximo es: "+ max);
        System.out.println("El número de valor mínimo es: "+ min);
    }
}