
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
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double resultado, num;
        boolean salir=false;
        resultado=(Math.random()*10)*(Math.random()*10);
        resultado=Math.floor(resultado);
        System.out.println(resultado);
        do {
            System.out.println("Ingrese número: ");
            num = leer.nextDouble();
            
            if(num==resultado){
                System.out.println("EUREKA! acertaste! el número era: "+resultado);
                break;
            } else if(num>resultado){
                System.out.println("El número ingresado es muy alto! Vuelve a intentarolo");                
            } else {
                System.out.println("El número ingresado es muy bajo! Vuelve a intentarlo");
            }
            
        } while (!salir);
                    
    }
}
