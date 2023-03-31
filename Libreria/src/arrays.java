

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class arrays {
        public static int[][] inicializarConPrefijados(int[][] matriz){
        // Se inicializa la matriz con valores pre escogidos
                matriz[0][0]=0; matriz[0][1]=-2; matriz[0][2]=4;
                        
                matriz[1][0]=2; matriz[1][1]=0; matriz[1][2]=2;
                
                matriz[2][0]=-4; matriz[2][1]=-2; matriz[2][2]=0;
                
        return matriz;
        }
        
        public static int[] inicializarVector(int tam){
            //Inicializar los elementos de un vector
            
            int[] vector = new int[tam];
            for (int i = 0; i < tam; i++) {
                //vector[i]=ingresoValor("Ingrese valor",leer); //Funcion en libreria deLecturaYEscritura
            }
            return vector;
        }
        
        public static void mostrarMatriz(int[][] matriz){
            //Mostrar los elementos de la matriz
            for (int[] vector: matriz) { //Separo la matriz en vectores
                mostrarVector(vector); //Envio el vector a una funcion para mostrar el vector
                System.out.println("");                
            }
            
        }
        public static void mostrarVector(int[] vector){
            for(int elemento: vector){
                System.out.print(elemento+" ");
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
