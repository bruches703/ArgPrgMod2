/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author bruch
 */
public class ArregloServicios {

    public double[] inicializarA(double[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=Math.random()*10;
        }
        return vector;
    }
    
    public void mostrar(double[] vector){
        DecimalFormat df = new DecimalFormat("#.####");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(df.format(vector[i])+"//");
        }
        System.out.println("");
    }
    
    public void ordenar(double[] vector){
       //Arrays.sort(vector, 0, vector.length);
       Arrays.sort(vector);
    }
    
    public void inicializarB(double[] vectorA, double[] vectorB){
        System.arraycopy(vectorA, 0, vectorB, 0, 10);
        for (int i = 10; i < 20; i++) {
            vectorB[i]=0.5;
        }

    }
}