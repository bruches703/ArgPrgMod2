
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
public class deLectura {
    
    public static String ingresoDeTexto(String texto, Scanner leer){
        //Texto es de tipo String, es la leyenda que se mostrara por pantalla
        // retorna una cadena de texto ingresada por el usuario
        System.out.println(texto);
        return leer.nextLine();
    }
    
    public static int ingresoValor(String texto, Scanner leer){
        // Texto es de tipo String, es la leyenda que se mostrara por pantalla
        // 
        // retorna un número entero ingresado por el usuario
        System.out.println(texto);
        return leer.nextInt();
    }
    
    public static int validacionEntero(int num, int min, int max, String texto, Scanner leer){
        // limita a "num" entre "min" y "max". La variable "texto" contiene la leyenda
        // que se mostrara en pantalla
        //
        // retorna "num" validada        
        while(num<min || num>max){
            System.out.println(texto);
            num=leer.nextInt();
        }
        return num;
    }
            
    public static String validacionString(String texto, String cadena, String par1, String par2, Scanner leer){
        // Valida la variable "cadena", que sea igual a "par"
        //
        //"texto" es de tipo String, es la leyenda que se mostrara por pantalla
        //"cadena" es de tipo String, el la cadena a validar.
        //"par1" es la cadena parámetro, es a la que se tiene que igualar "cadena"
        //"par2" es la cadena parámetro, es a la que se tiene que igualar "cadena"
        //
        //retorna la variable "cadena" siempre que sea igual a "par"
        while(!cadena.equals(par1) && !cadena.equals(par2)){
            System.out.println(texto);
            cadena=leer.nextLine();
        }
        return cadena;
    }
            
    public static int menu(String texto, Scanner leer){
        System.out.println("MENÚ");
        System.out.println(texto);        
        return leer.nextInt();
    }
}
