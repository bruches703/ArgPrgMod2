/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class EstudianteServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante CrearEstudiante(){
        double[] notas= new double[3];
        System.out.println("Ingrese nombre: ");
        String nombre= leer.next();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota "+(i+1));
            notas[i]= leer.nextDouble();
        }
        System.out.println("\n\n\n");
        return new Estudiante(nombre, notas);
    }
     
    public double CalcularPromedioTotal(Estudiante[] estudiantes){
        double suma=0;
        for (int i = 0; i < estudiantes.length; i++) {
            suma=suma+CalcularPromedioDeUnAlumno(estudiantes[i]);
        }
        return suma/estudiantes.length;
    }
    
    public double CalcularPromedioDeUnAlumno(Estudiante estudiante){
        double suma=0;
        double[] notas = estudiante.getNotas();
        for (int i = 0; i < notas.length ; i++) {
            suma=suma+notas[i];
        }
        return suma/notas.length;
    }
    
    public void MostrarPromedioTotal(Estudiante[] estudiantes){
        System.out.println("El promedio total es: "+ CalcularPromedioTotal(estudiantes));
    }
    
    public String[] AlumnosConBuenaNota(Estudiante[] estudiantes){
        String[] alumnos = new String[estudiantes.length];
        Arrays.fill(alumnos, "$$//");
        int j=0;
        double promedioTotal=CalcularPromedioTotal(estudiantes);
        
        for (int i = 0; i < estudiantes.length; i++) {
            
            if (tieneNotaAprobatoria(promedioTotal, estudiantes[i])) {
                alumnos[j]=estudiantes[i].getNombre();
                j++;
            }
            
        }
        return alumnos;
    }
    
    public void MostrarAlumnos(Estudiante[] estudiantes){
        String[] alumnos = AlumnosConBuenaNota(estudiantes);
        System.out.println("Los estudiantes con una nota mayor al promedio son: ");
        
        for (int i = 0; i < alumnos.length; i++) {
            if (!"$$//".equals(alumnos[i])) {
                System.out.println(alumnos[i]);
            }
        }
    }
    
    private boolean tieneNotaAprobatoria(double promedioTotal, Estudiante estudiante){
        boolean esAprobado;
        double[] notas= estudiante.getNotas();
        int i=0; 
        do{
            esAprobado=notas[i]>promedioTotal;// false
            i++; 
        }while(!esAprobado && i<notas.length);

        return esAprobado;
    }
}
