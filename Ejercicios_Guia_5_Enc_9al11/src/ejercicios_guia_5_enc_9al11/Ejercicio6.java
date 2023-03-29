/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_5_enc_9al11;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
 * Crear un programa que permita introducir un cuadrado por teclado y determine 
 * si este cuadrado es mágico o no. El programa deberá comprobar que los 
 * números introducidos son correctos, es decir, están entre el 1 y el 9.
 * @author bruch
 */
public class Ejercicio6 {
    public static void main(String[] args){
        //Scanner leer = new Scanner(System.in);
        int tamano=3, sumaAEvaluar;
        boolean columnaMagica, filaMagica;
        //System.out.println("Ingrese dimension de la matriz: ");
        //int tamano = leer.nextInt();
        int[][] matriz= new int[tamano][tamano];
        
        matriz=ini1(matriz); //inicializa la matriz
        sumaAEvaluar=sumaDiagonalPrincipal(matriz); //la suma de la diagonal principal        
        
        if(filasSonMagicas(matriz, sumaAEvaluar) && columnasSonMagicas(matriz, sumaAEvaluar) ){
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
    }
    
    
    
    public static int[][] ini1(int[][] matriz){
        // Se inicializa la matriz con valores pre escogidos
        matriz[0][0]=2; matriz[0][1]=7; matriz[0][2]=6;
                        
        matriz[1][0]=9; matriz[1][1]=5; matriz[1][2]=1;
                
        matriz[2][0]=4; matriz[2][1]=3; matriz[2][2]=8;
                
    return matriz;
    }
    
    public static int sumaDiagonalPrincipal(int[][] matriz){
        /*
        * Suma cada elemento de la matriz principal
        * 
        * "matriz" es una matriz de enteros
        *
        * Retorna la suma de la diagonal principal en un valor entero
        */
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            suma=matriz[i][i]+suma;
        }
        return suma;
    }
    
    public static boolean filasSonMagicas(int[][] matriz, int sumaAEvaluar){
        /*
        * Representa -true- si la suma de las filas son todas iguales a la de la
        * diagonal principall
        * 
        * retorna -true- si las sumas son TODAS iguales
        */
        boolean sonIguales=true;
        int sumaFilas;
        for (int[] matriz1 : matriz) {
            sumaFilas=0;
            for (int elemento: matriz1) {
                sumaFilas=sumaFilas+elemento;
            }
            sonIguales= sumaAEvaluar==sumaFilas;
            if(!sonIguales){
                break;
            }
        }
        return sonIguales;
    }
    public static boolean columnasSonMagicas(int[][] matriz, int sumaAEvaluar){
        /*
        * Representa -true- si la suma de las columnas son todas iguales a la 
        * de la diagonal principall
        * 
        * retorna -true- si las sumas son TODAS iguales
        */
        boolean sonIguales=true;
        int sumaColumna;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna=0;
                for (int j = 0; j < matriz[i].length; j++) {
                sumaColumna=sumaColumna+matriz[j][i];
            }
            sonIguales= sumaAEvaluar==sumaColumna;
            if(!sonIguales){
                break;
            }
        }
        return sonIguales;
    }
}
