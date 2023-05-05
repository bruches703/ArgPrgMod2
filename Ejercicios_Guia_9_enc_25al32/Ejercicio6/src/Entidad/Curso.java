/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
 * precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco)
 * 
 * @author bruch
 */
public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    //Getters
    public String getNombreCurso() {
        return nombreCurso;
    }
    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }
    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }
    public String getTurno() {
        return turno;
    }
    public double getPrecioPorHora() {
        return precioPorHora;
    }
    public String[] getAlumnos() {
        return alumnos;
    }

    //Setters
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }
    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
