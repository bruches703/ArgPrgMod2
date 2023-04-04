
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
public class Operaciones {
    private int numero1;
    private int numero2;
    
    Operaciones(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }   
    Operaciones(){
    }
    public int getNumero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void crearOperaciones(){
        Scanner leer=new Scanner(System.in);        
        System.out.println("Ingrese primero número: ");
        numero1=leer.nextInt();
        System.out.println("Ingrese segundo número: ");
        numero2=leer.nextInt();
    }
    public int sumar(){
        return numero1+numero2;
    }
    public int resta(){
        return numero1-numero2;
    }
    public int multiplicar(){
        int num;
        if(numero2==0 || numero1==0){
            System.out.println("No se puede multiplicar por cero");
            num=0;
        } else {
            num=numero1/numero2;
        }
        return num;
    }
    public int dividir(){
        int num;
        if(numero2==0 || numero1==0){
            System.out.println("No se puede dividir por cero");
            num=0;
        } else {
            num=numero1/numero2;
        }
        return num;
    }
}
