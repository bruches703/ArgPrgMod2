
import java.util.Random;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("La suma es: "+sumaDeMatriz(matrizPrecargada()));
    }
        public static int[][] matrizPrecargada(){
            int n=5, m=8;
            int[][] matriz=new int[n][m];
            for (int i = 0; i < n; i++) {
                matriz[i]=vectorPrecargado(matriz[i].length);
            }
            return matriz;
        }
        
        public static int[] vectorPrecargado(int tam){
        //Envia un vector cargado,solo requiere que llegue el tamaño del vector
            int[] vector = new int[tam];
            Random r=new Random();
            for (int i = 0; i < tam; i++) {
                vector[i]=r.nextInt(10);
            }
        return vector;
        }
        
        public static int sumaDeMatriz(int[][] matriz){
            //Suma los elementos de una matriz
            int suma=0;
            for (int[] vector: matriz) {
                suma=suma+sumaDeVectores(vector); //Suma todos los elementos del vector
            }
            return suma;
        }
        
        public static int sumaDeVectores(int[] vector){
            //Suma los elementos de un vector
            
            int suma=0;
            for (int elemento:vector) {
                System.out.println(elemento);
                suma=suma+elemento;
            }
            return suma;
            
        }
        
        
    
}
    
        
