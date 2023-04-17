
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
public class Puntos {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Puntos() {
    }
    
    public void crearPunto(){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese X1: ");
        x1=leer.nextInt();
        System.out.println("Ingrese Y1: ");
        y1=leer.nextInt();
        
        System.out.println("Ingrese X2: ");
        x2=leer.nextInt();
        System.out.println("Ingrese Y1: ");
        y2=leer.nextInt();
    }
    
    public double calcularDistancia(){
        return (double) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)) ;
    }
    
}


