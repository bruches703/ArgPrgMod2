
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
        String[][] sopa= new String[20][20];
        
    }
    
    public static String[] crearVector(int tam){
            //Inicializar los elementos de un vector
        Scanner leer = new Scanner(System.in);
        String[] vector = new String[tam];
        for (int i = 0; i < tam; i++) {
            vector[i]=ingresoDeTexto("Ingrese palabra", leer);
        }
        return vector;
    }
    public static String ingresoDeTexto(String texto, Scanner leer){
        //Texto es de tipo String, es la leyenda que se mostrara por pantalla
        // retorna una cadena de texto ingresada por el usuario
        System.out.println(texto);
        
        return leer.nextLine();
    }
}
