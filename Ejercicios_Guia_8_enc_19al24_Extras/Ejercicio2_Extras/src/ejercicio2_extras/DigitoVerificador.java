/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_extras;

import NIF.NIF;
import NIFService.NIFServicios;

/**
 *
 * @author bruch
 */
public class DigitoVerificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFServicios nifServ = new NIFServicios();
        NIF nif = nifServ.crearNif();
        nifServ.mostrar(nif);
    }
    

    
}
