/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera.Servicios;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class CafeteraSerivicios {
    Scanner leer=new Scanner(System.in);
    
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
    }
    
    public void servirTaza(int taza, Cafetera cafetera){
        if(cafetera.getCapacidadActual()>=taza){
            System.out.println("La taza se lleno");
            cafetera.setCapacidadActual(cafetera.getCapacidadActual()-taza);
        } else {
            System.out.println("La taza se lleno un "+ (cafetera.getCapacidadActual()*100)/taza);
            vaciarCafetera(cafetera);
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCapacidadActual(0);
    }
    
    public void agregarCafe(int cant, Cafetera cafetera){
        while(cant+cafetera.getCapacidadActual()>cafetera.getCapacidadMaxima()){
            System.out.println("La cantidad supera la capacidad. Reingrese");
            cant=leer.nextInt();
        }
        cafetera.setCapacidadActual(cant+cafetera.getCapacidadActual());
        
    }
}
