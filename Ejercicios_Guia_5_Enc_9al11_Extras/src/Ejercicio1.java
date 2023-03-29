
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Realizar un algoritmo que calcule la suma de todos los elementos de un 
 * vector de tamaño N, con los valores ingresados por el usuario.
 * 
 * @author bruch
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma=0, tam;
        
        tam=ingresoValor("Ingrese tamaño del array", leer);
        int[] vector = new int[tam];
        vector=cargaDeVector(tam);
        System.out.println("La suma es: "+sumaDeVector(vector));
    }
    
    public static int ingresoValor(String texto, Scanner leer){
        // Texto es de tipo String, es la leyenda que se mostrara por pantalla
        // 
        // retorna un número entero ingresado por el usuario
        System.out.println(texto);
        return leer.nextInt();
    }
    public static int sumaDeVector(int[] vector){
        int suma=0;
        for (int elemento:vector) {
            suma=Math.addExact(suma, elemento);
        }
        return suma;
    }
            
    public static int[] cargaDeVector(int tam){
        int[] vector = new int[tam];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            vector[i]=ingresoValor("Ingrese el "+(i+1)+"° número",leer); 
        }
        return vector;
    }    
}
