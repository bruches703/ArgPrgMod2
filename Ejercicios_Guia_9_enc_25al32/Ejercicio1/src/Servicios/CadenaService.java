/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class CadenaService {
    Scanner leer = new Scanner(System.in);
    
    public int mostrarVocales(Cadena cad){
        int cont = 0;
        

        for (int i = 0; i < cad.getLongitud(); i++) {
            if('a'== cad.getFrase().toLowerCase().charAt(i) ||
                'e'== cad.getFrase().toLowerCase().charAt(i) ||
                'i'== cad.getFrase().toLowerCase().charAt(i) ||
                'o'== cad.getFrase().toLowerCase().charAt(i) ||
                'u'== cad.getFrase().toLowerCase().charAt(i)){
                cont++;
            }
        }
        return cont;
    }
    
    public void invertirFrase(Cadena cad){
        for (int i = cad.getLongitud(); i >= 0; i++) {
            System.out.print(cad.getFrase().charAt(i));
        }
        System.out.println("");
    }
    
    public void vecesRepetido(Cadena cad, String letra){
        int cont=0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getFrase().toUpperCase().charAt(i) == letra.toUpperCase().charAt(0)){
                cont++;
            }
        }
        System.out.println("La letra '"+letra.charAt(0)+"' se repite "+cont+" veces");
    }
    
    public void compararLongitud(Cadena cad, String frase){
        if(cad.getLongitud()==frase.length()){
            System.out.println("Las cadenas tienen la misma cantidad de caracteres");
        }else{
            System.out.println("Las cadenas no tienen la misma cantidad de caracteres");
        }
    }
    
}
