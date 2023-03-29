/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_5_enc_9al11;

/**
 *
 * @author bruch
 */
public class Ejercicio5 {
    public static void main(String[] args){
        int[][] matriz = new int[3][3]; 
        int[][] antisimetrica = new int[3][3];
        
        matriz=ini1(matriz);
        antisimetrica=ini2(antisimetrica);
        mensaje(evaluacion(matriz, antisimetrica));
            
    }    

    public static int[][] ini1(int[][] matriz){
        // Se inicializa la matriz con valores pre escogidos
                matriz[0][0]=0; matriz[0][1]=-2; matriz[0][2]=4;
                        
                matriz[1][0]=2; matriz[1][1]=0; matriz[1][2]=2;
                
                matriz[2][0]=-4; matriz[2][1]=-2; matriz[2][2]=0;
                
        return matriz;
    }
    public static int[][] ini2(int[][] matriz){
        // Se inicializa la matriz con valores pre escogidos
                matriz[0][0]=0; matriz[0][1]=2; matriz[0][2]=-4;
                        
                matriz[1][0]=-2; matriz[1][1]=0; matriz[1][2]=-2;
                
                matriz[2][0]=4; matriz[2][1]=2; matriz[2][2]=0;
        return matriz;
    }
    public static boolean evaluacion(int[][] matriz,int[][] antisimetrica){
        /*
        * Representa un valor booleano si "matriz" es antisimetrica a 
        * "antisimetrica"
        * 
        * "matriz" y "antisimetrica" son matrices de tipo -int- y se van a comparar
        *
        * retorna -true- si "antisimetrica" es antisimetricas de "matriz"
        */
        boolean es=true;
        for (int i = 0; i< 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                es= -matriz[i][j]==antisimetrica[i][j];
                if(!es){
                    break;                    
                }
            }
        }
        return es;
    }
    public static void mensaje(boolean es){        
        /*
        * Imprime un mensaje en pantalla si el vector es o no antisimétrico
        * 
        * "es": es "true" si la comparacion de la matriz es antisimétrica
        *
        */
        if(es){
            System.out.println("Es antisimétrica");
        } else {
            System.out.println("No es antisimpétrica");
        }
    }
}
