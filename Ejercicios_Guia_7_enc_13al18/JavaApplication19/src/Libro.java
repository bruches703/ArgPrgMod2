
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ISBN, Título, Autor, Número de páginas
 * @author bruch
 */
public class Libro {

    private String isbn;
    private String autor;
    private String titulo;
    private int numeroPaginas;
    
    /**
     * 
     * Asignar los parametros a la clase
     * 
     * 
     * 
     * @param isbn es de tipo -string- y representa el codigo del libro
     * @param autor
     * @param titulo
     * @param numeroPaginas 
     * 
     */
    Libro (String isbn, String autor, String titulo, int numeroPaginas) {
        this.isbn=isbn;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
        this.titulo=titulo;
    }    
    
    Libro(){
        //VACIO
    }    
    
    /**
     * Asignar los datos de Libro
     * 
     */
    public void cargaDeDatos(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese ISBN");
        isbn= leer.nextLine();
        
        System.out.println("ingrese Titulo");
        titulo= leer.nextLine();
        
        System.out.println("ingrese Autor");
        autor= leer.nextLine();
        
        System.out.println("ingrese numero de paginas");
        numeroPaginas= leer.nextInt();
        
    }
    
    /**
     * Mostrar los datos de Libro
     * 
     */
    public void mostrarDatos(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Cantidad de paginas: "+numeroPaginas);
    }            
}

