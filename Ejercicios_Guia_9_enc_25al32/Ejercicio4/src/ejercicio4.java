
import Servicios.FechaServicios;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FechaServicios fs = new FechaServicios();
        Date fechaNacimiento = fs.fechaNacimiento();
        Date fechaActual = fs.fechaActual();
        System.out.println(fechaNacimiento.toString());
        fs.diferencia(fechaActual, fechaNacimiento);
        System.out.println(2023-1990);
    }
    
}
