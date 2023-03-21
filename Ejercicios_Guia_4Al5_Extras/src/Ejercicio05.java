
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
public class Ejercicio05 {
        public static void main (String[] args){
    
            Scanner leer = new Scanner(System.in);
            double total;
            
            System.out.println("Ingrese el tipo de plan:");  
            String tipo = leer.nextLine();
            System.out.println("Ingrese el costo del tratamiento:");
            double costo = leer.nextDouble();
           
            if(tipo.equalsIgnoreCase("a")){
                total=costo-(costo*0.5);
            } else if(tipo.equalsIgnoreCase("b")){
                total=costo-(costo*0.35);
            } else if(tipo.equalsIgnoreCase("c")){
                total=costo;
            } else {
                total= -1;
            }
            
            if(total>0){
                System.out.println("El costo del tratamiento es de: $" + costo);
                System.out.println("El total a abonar sera de: $" + total);
            } else {
                System.out.println("El plan ingresado no es válido");
            }
        }
}
