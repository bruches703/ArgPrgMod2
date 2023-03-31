
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Crear una función rellene un vector con números aleatorios, 
 * pasándole un arreglo por parámetro. Después haremos otra función o 
 * procedimiento que imprima el vector.
 * 
 * @author bruch
 */
public class Ejercicio3 {
    public static void main(String[] args){
        mostrarVector(crearVector(5));
    }
    public static int[] crearVector(int tam){
        //Envia un vector cargado,solo requiere que llegue el tamaño del vector
        Random R = new Random();
        int[] vector = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i]=R.nextInt(10);
            //vector[i]=ingresoValor("Ingrese valor",leer); //Funcion en libreria deLecturaYEscritura
            }
        return vector;
    }
    public static void mostrarVector(int[] vector){
        for(int elemento: vector){
            System.out.print(elemento+" ");
        }
        System.out.println("");
    }
}
