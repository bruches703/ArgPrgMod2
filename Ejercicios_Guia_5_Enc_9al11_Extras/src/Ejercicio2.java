/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son 
 * iguales (la comparación deberá detenerse en cuanto se detecte alguna 
 * diferencia entre los elementos).
 * 
 * @author bruch
 */
public class Ejercicio2 {
    public static void main(String[] args){
        
        int n=5;
        int[] vector1 = new int[n]; 
        int[] vector2 = new int[n];
        
        boolean sonIguales=false; //Inicializo como "false", de tener distintas dimensiones no se evalua si los elementos son iguales
        
        //inicializamos los vectores, en este caso, con los mismos valores
        vector1=inicializarVector(vector1.length);
        vector2=inicializarVector(vector2.length);
   
        if(vector1.length==vector2.length){ //Si son del mismo tamaño pueden ser iguales
            sonIguales=CompararVectores(vector1,vector2); //Se comparan los dos vectores
        }
        if(sonIguales){
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    }
    
    public static boolean CompararVectores(int[] vector1,int[] vector2 ){
        /*
        *   Compara los valores de "vector1" y de "vector2"
        *   
        *   vector1 y vector2 son de tipo vector de enteros
        *   
        *   retorna un booleano, representa el valor si vector1 y vector2 
        *   son iguales o no
        *
        */
        boolean sonIguales=true;
        int i=0;
        while(sonIguales && i<vector1.length){
            sonIguales=vector1[i]==vector2[i];
            i++;
        }
        return sonIguales;
    }
    
    public static int[] inicializarVector(int tam){
        //Envia un vector cargado,solo requiere que llegue el tamaño del vector
        int[] vector = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i]=i;
            //vector[i]=ingresoValor("Ingrese valor",leer); //Funcion en libreria deLecturaYEscritura
            }
        return vector;
    }
}
