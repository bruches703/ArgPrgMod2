
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class Ejercicio6 {
    public static void main(String[] args){
        mostrarMatriz(cargarMatrizLasPalabras());
    }
    public static void mostrarMatriz(String[][] matriz){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static String[][] rellenarMatrizConNumeros(String[][] matriz){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(!"".equals(matriz[i][j])){
                    matriz[i][j]=String.valueOf((int)Math.floor(Math.random()*10));
                }
            }
        }
        return matriz;
    }
    public static String[][] cargarMatrizLasPalabras(){
        String[][] matriz = new String [20][20];
        Random r=new Random();
        int indice;
        matriz=matrizVacia();
        for (int i = 0; i < 5; i++) {
            indice=r.nextInt(19);
            matriz[indice]=insertarLetras(matriz[indice], palabraValidada()); 
        }
        return rellenarMatrizConNumeros(matriz);
    }
    
    public static String[][] matrizVacia(){
        String[][] matriz = new String[20][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j]="";
            }
        }
        return matriz;
    }
    public static String[] insertarLetras(String[] vector, String palabra){
        int indice=indiceValidado(vector, palabra);
        for (int i = 0; i < palabra.length(); i++) {
            vector[indice+i]=palabra.substring(i,i+1);
        }
        return vector;
    }
    public static String palabraValidada(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese palabra: ");
        String palabra= leer.nextLine();
        while(palabra.length()<3 || palabra.length()>5){
            System.out.println("Error, reingrese palabra: ");
            palabra= leer.nextLine();
        }
        return palabra;
    }
    
    public static int indiceValidado(String[] vector, String palabra){
        Random r=new Random();
        int indice=r.nextInt(19);
        indice=largoDeIndice(palabra.length(), indice);
        while(!validacionDeIndice(vector, palabra.length(),indice)){
            indice=largoDeIndice(palabra.length(), r.nextInt(19));
        }
        return indice;
    }
    public static int largoDeIndice(int largoPalabra, int indice){
        if(largoPalabra+indice>119){
            indice=19-largoPalabra;
        }
        return indice;
    }
    public static boolean validacionDeIndice(String[] vector, int largoPalabra, int indice){
        
        int i=0;
        boolean esVacio=true;
        while(i<largoPalabra && esVacio){
            esVacio="".equals(vector[indice+i]);
            i++;
        }
        return esVacio;
    }

}
