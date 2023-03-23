
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
public class Ejercicio08 {
        public static void main (String[] args){
    
            Scanner leer = new Scanner(System.in);

            int pares=0, impares=0, total=0, num;
            boolean salir=false;

            do{
                System.out.println("Ingrese número: ");
                num= leer.nextInt();
                
                if(num>0){
                    if(num%5==0){
                        salir=true;
                    } else {
                        if(num%2==0){
                            pares++;
                        } else {
                            impares++;
                        }
                        total++;
                    }
                }
                
            }while(!salir);
            
            System.out.println("\n---------------------------------------");
            System.out.println("Total de números leidos: "+total);
            System.out.println("Números impares: "+ impares);
            System.out.println("Números pares "+ pares);
        }
}
