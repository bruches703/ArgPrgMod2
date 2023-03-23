
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * EJERCICIOS EXTRAS DE LOS ENCUENTROS 4 AL 6
 * @author bruch
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int horas=0, dias=0;
        
        System.out.println("Ingrese los minutos: ");
        int minutos = leer.nextInt();
        
        while(minutos>=60){
            minutos=minutos-60;
            horas++;
        }
        while(horas>=24){
            horas=horas-24;
            dias++;
        }
        System.out.println("Equivalente es: " + dias + " dias, " + horas + "horas, " + minutos + "minutos");

    }
    
}
