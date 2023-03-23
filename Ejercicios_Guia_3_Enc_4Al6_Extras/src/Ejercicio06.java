
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
public class Ejercicio06 {
    public static void main (String[] args){
    
        Scanner leer = new Scanner(System.in);
            
        int promedioBajo=0, promedioGeneral=0, n;
        
        n=6;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la estatura: ");
            double estatura = leer.nextDouble();
            
            if(estatura<1.60){
                promedioBajo++;
            } else {
                promedioGeneral++;
            }
            
        }
        System.out.println("El promedio de personas que superan el 1,60 es: " + (promedioGeneral*100/n));
        System.out.println("El promedio de personas que no superan el 1,60 es: " + (promedioBajo*100/n));
    }
}
