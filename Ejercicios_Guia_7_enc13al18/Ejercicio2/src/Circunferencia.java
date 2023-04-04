
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
public class Circunferencia {
    
    private double radio;
    
    Circunferencia(){   
    }
    Circunferencia(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese");
        radio= leer.nextDouble();
    }
    
    public double area(){
        return Math.pow(3.14*radio, 2);
    }
    public double perimetro(){
        return 2*3.14*radio;
    }
    
    
}
