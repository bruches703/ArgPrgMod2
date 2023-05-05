/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Entidades.Estudiante;
import Servicios.EstudianteServicios;

/**
 *
 * @author bruch
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteServicios es = new EstudianteServicios();
        Estudiante[] estudiantes = crearEstudiantes(es);
        
        es.MostrarPromedioTotal(estudiantes);
        es.MostrarAlumnos(estudiantes);
    }
    
    public static Estudiante[] crearEstudiantes(EstudianteServicios es){
        Estudiante[] estudiantes = new Estudiante[3];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i]= es.CrearEstudiante();
        }
        return estudiantes;
    }
    
}
