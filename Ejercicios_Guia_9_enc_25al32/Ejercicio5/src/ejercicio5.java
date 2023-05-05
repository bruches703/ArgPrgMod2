
import Entidades.Persona;
import Servicios.PersonaServicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicios ps=new PersonaServicios();
        Persona per=ps.crearPersona();
        
        if(ps.esMenorQue(per, 23)){
            System.out.println("Es menor de 23 años");
        } else {
            System.out.println("Es mayor de 23 años");
        }
        
        ps.mostrarPersona(per);
        
    }
    
}
