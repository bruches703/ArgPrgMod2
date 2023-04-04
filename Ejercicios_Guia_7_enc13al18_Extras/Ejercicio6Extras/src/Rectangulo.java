/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class Rectangulo {
    private int lado1;
    private int lado2;

    Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public void mostrarArea(){
        System.out.println("El area es: "+lado1*lado2);
    } 
}
