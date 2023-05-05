
import Servicios.ArregloServicios;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class Ejercicio3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArregloServicios as = new ArregloServicios();
        
        double[] a = new double[50];
        double[] b = new double[20];
        
        as.inicializarA(a);
        as.inicializarB(a, b);
        
        as.ordenar(a);
        as.ordenar(b);
        
        
        as.mostrar(a);
        System.out.println("-------------------------");
        as.mostrar(b);
        
    }
    
}
