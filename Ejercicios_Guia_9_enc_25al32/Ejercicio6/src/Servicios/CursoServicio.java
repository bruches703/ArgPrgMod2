/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String[] cargarAlumnos(){
        String[] alumnos = new String[5];
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese nombre del alumno");
            alumnos[i] = leer.next();
        }
        
        return alumnos;
    }
    
    /**
     * nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
     * precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco)
     *
     * @return 
     */
    public Curso crearCurso(){
            
            System.out.println("Ingrese nombre del curso");
            String nombreCurso = leer.next();
            
            System.out.println("Ingrese cantidad de horas por dia");
            int horasPorDia = leer.nextInt();
            
            System.out.println("Ingrese cantidad de horas por semana");
            int horasPorSemana = leer.nextInt();
            
            System.out.println("Ingrese turno, m(mañana) o t(tarde)");
            String turno = leer.next();
            
            System.out.println("Ingrese precio por hora");
            double precio = leer.nextDouble();
        
        return new Curso(nombreCurso, horasPorDia, horasPorSemana, turno, precio, cargarAlumnos());
    }
    
}
