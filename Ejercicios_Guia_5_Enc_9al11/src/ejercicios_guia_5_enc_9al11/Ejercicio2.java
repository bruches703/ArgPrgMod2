/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_5_enc_9al11;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 * 
 * 
 * @author bruch
 */
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n=20,cont=0,indice=-1;
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]= (int)Math.floor(Math.random()*10);
        }
        System.out.println("Ingrese número: ");
        int num= leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if(vector[i]==num){
                cont++;
                if(indice==-1){
                    indice=i;
                }
            }
        }
        

        if(cont==1){
            System.out.println("Se encontro "+num+" una vez");
            System.out.println("El indice es: "+indice);
        }else if(cont>1){
            System.out.println("Se encontro "+num+" unas "+cont+" veces" );
            System.out.println("Se encuentra por primera vez en: "+indice);
        }else{
            System.out.println("No se encontro el número");
        }
    }
}
