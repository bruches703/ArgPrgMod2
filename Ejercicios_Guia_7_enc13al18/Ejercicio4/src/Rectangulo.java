
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
public class Rectangulo {
    private int altura;
    private int base;
    
    Rectangulo(){
    }
    Rectangulo(int altura, int base){
        this.altura=altura;
        this.base=base;
    }
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese altura: ");
        altura=leer.nextInt();
        System.out.println("Ingrese base");
        base=leer.nextInt();
    }
    
    public int calcularSuperficie(){
        return altura*base;
    }
    public int calcularPerimetro(){
        return(base+altura)*2;
    }
    
    public void dibujarCuadrado(){
    
        for (int i = 0; i < altura; i++) {
        
            for (int j = 0; j < base; j++) {
            
                if(i==0 || i==altura-1){ //si esta en la primera o la ultima columna se dibuja
                    System.out.print("*");   
                } else if (j==0 || j==base-1){     
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
