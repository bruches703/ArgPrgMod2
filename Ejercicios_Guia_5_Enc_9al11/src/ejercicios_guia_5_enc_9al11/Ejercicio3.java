/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_5_enc_9al11;

import java.util.Random;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 
 * 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author bruch
 */
public class Ejercicio3 {
    public static void main(String[] args){
        int n=100;
        int[] vector = new int[n];
        int[] digitos = new int[5];
        
        digitos=inicializarVectorEnCero(digitos);
        vector=inicializarVectorRandoms(vector);
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>0){
               digitos[digitosDelElemento(vector[i])]++;
            } else {
                digitos[0]++;
            }
        }
        
        //Ver el arreglo
        /* 
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        System.out.println("");*/
        
        for (int i = 0; i < digitos.length; i++) {
            System.out.println("Hay "+digitos[i]+" de "+(i+1)+" digitos");
        }
        
    }
    public static int[] inicializarVectorEnCero(int[] vector){
        //Inicializar todos los elementos del vector "vector", que es de 
        //Números enteros, en 0
        for (int i = 0; i < vector.length; i++) {
           vector[i]=0;
        }
        return vector;
    }
    public static int[] inicializarVectorRandoms(int[] vector){
        //Inicializa todos los elementos del vector con la multipliacaion de dos
        //números randoms        
        Random R = new Random();
        for (int i = 0; i < vector.length; i++) {
            //Carga de datos en el vector
           
            vector[i]= R.nextInt(99999);
        }
        return vector;
    }
    public static int digitosDelElemento(int elemento){
        //Evalua cuantos dígitos tiene el elemento, de tipo entero
        int digitos, aux;
        digitos=0;
            if(elemento==0){
                digitos++;
            }else{
                aux=elemento;
                while(aux>0){
                        aux=aux/10;
                        digitos++;
                    }
                }
        return digitos-1;
    }
}
