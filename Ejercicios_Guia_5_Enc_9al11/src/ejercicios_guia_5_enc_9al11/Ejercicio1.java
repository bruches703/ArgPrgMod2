/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_5_enc_9al11;


/**
 * Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 * 
 * @author bruch
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
        }
        for (int i = vector.length-1; i >-1 ; i--) {
            System.out.println(vector[i]);
        }
    }
}
