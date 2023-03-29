

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
        
        public static int[] cargaDeVector(int tam){
            int[] vector = new int[tam];
            for (int i = 0; i < tam; i++) {
                //vector[i]=ingresoValor("Ingrese valor",leer); //Funcion en libreria deLecturaYEscritura
            }
            return vector;
        }
        
        public static void mostrarMatriz(int[][] matriz){
            for (int[] vector: matriz) {
                mostrarVector(vector);
                System.out.println("");                
            }
            
        }
        public static void mostrarVector(int[] vector){
            for(int elemento: vector){
                System.out.print(elemento+" ");
            }
        }
}
