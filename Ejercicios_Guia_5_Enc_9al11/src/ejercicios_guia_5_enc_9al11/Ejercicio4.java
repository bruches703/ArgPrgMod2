/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_5_enc_9al11;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
 * A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author bruch
 */
public class Ejercicio4 {
    public static void main(String[]args){
    int[][] matrinzA = new int[4][4];
    matrinzA=RellenarMatriz(matrinzA);
    
    MostrarMatriz(matrinzA);
        System.out.println("");
    MostrarMatriz(matrizTranspuesta(matrinzA));
    }
    
    public static int[][] RellenarMatriz (int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int)Math.floor(Math.random()*10);
            }
        }
        return matriz;
    }
    
    public static int[][] matrizTranspuesta(int[][] matriz){
        int[][] matrizAux = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizAux[j][i]=matriz[i][j];
            }
        }
        return matrizAux;
    }
    public static void MostrarMatriz(int[][] matriz){
        for (int[] fila:matriz) {
            for (int elemento:fila) {
                System.out.print(elemento+" ");
            }
            System.out.println("");
        }
    }
}
