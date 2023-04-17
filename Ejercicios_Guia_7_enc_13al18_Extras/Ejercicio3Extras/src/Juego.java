
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita 
 * dos jugadores jugar un juego de adivinanza de números. El primer jugador 
 * elige un número y el segundo jugador intenta adivinarlo. El segundo jugador 
 * tiene un número limitado de intentos y recibe una pista de "más alto" o 
 * "más bajo" después de cada intento. El juego termina cuando el segundo 
 * jugador adivina el número o se queda sin intentos. Registra el número de 
 * intentos necesarios para adivinar el número y el número de veces que cada 
 * jugador ha ganado.
 * 
 * @author bruch
 * 
 * 
 */
public class Juego {
    private int numero;
    
    Juego(){
    }
    Juego(int numero){
        this.numero=numero;
    }
    public void crearJugador(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese número");
        numero=leer.nextInt();
    }
    public boolean adivinanza(){
        Scanner leer=new Scanner(System.in);
        int i=0, num;
        boolean loEncontro=false;
        do{
            System.out.println("Intento N°"+(i+1));
            System.out.println("Ingrese numero: ");
            num=leer.nextInt();
            loEncontro=this.numero==num;
            if(!loEncontro){
                mensajeCercano(num);
            }
            i++;
        }while(!loEncontro && i<3);
        
        return loEncontro;
    }
    
    public void mensajeCercano(int numero){
        if(numero<this.numero){
            System.out.println("Muy bajo, reintente\n-------------------------");
        } else {
            System.out.println("Muy alto, reintente\n-------------------------");
        }
    }
}
