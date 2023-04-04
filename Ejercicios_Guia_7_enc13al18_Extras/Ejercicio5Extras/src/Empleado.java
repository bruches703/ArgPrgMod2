
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class Empleado {
    private String nombre;
    private double salario;
    private int anios;

    Empleado(String nombre, double salario, int anios) {
        this.nombre = nombre;
        this.salario = salario;
        this.anios = anios;
    }

    Empleado() {
    }
    
    public void crearEmpleado(){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese Nombre: ");
        nombre=leer.nextLine();
        
        System.out.println("Ingrese salario: ");
        salario=leer.nextDouble();
        
        System.out.println("Ingrese antiguedad, en años: ");
        anios=leer.nextInt();
    }
    public double calcularSalario(){
        double total;
        if(anios>=30){
            total=salario*1.1;
        }else{
            total=salario*1.05;
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getAnios() {
        return anios;
    }
    
}
