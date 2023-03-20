
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
public class Ejercicio7 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int correctas=0, incorrectas=0;
        String cadena;
        boolean salir=false;
        do{
            System.out.println("Ingrese cadena: ");
            cadena = leer.nextLine();
            if ("&&&&&".equals(cadena)){
              salir = true;  
            } else {

                if(cadena.length()<=5){
                    System.out.println(cadena.length());
                    if("X".equalsIgnoreCase(cadena.substring(0,1)) && "O".equalsIgnoreCase(cadena.substring(3,4))){
                       correctas++; 
                    }
                } else {
                    incorrectas++;
                }
            }
            System.out.println(cadena.substring(0,1));
            System.out.println(cadena.substring(4));
        }while(!salir);
        
        System.out.println("Ingresos correctos: " + correctas);
        System.out.println("Ingresos incorrectos: " + incorrectas);
    }
}
