/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFService;

import NIF.NIF;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class NIFServicios {
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNif(){
        System.out.println("Ingrese el dni: ");
        int dni = leer.nextInt();
        return new NIF(dni,calcularLetra(dni%23));
    }
    
    public void mostrar(NIF nif){
        System.out.println("DNI: "+nif.getDni());
        System.out.println("NIF: "+nif.getDni()+"-"+nif.getLetra());
    }
    
    public String calcularLetra(int nif){
        String[] vector=vectorVerificador();

        return vector[nif];
    }
    
    
    public String[] vectorVerificador(){
        String[] vector = new String[23];
        
        vector[0]="T";
        vector[1]="R";
        vector[2]="W";
        vector[3]="A";
        vector[4]="G";
        vector[5]="M";
        vector[6]="Y";
        vector[7]="F";
        vector[8]="P";
        vector[9]="D";
        vector[10]="X";
        vector[11]="B";
        vector[12]="N";
        vector[13]="J";
        vector[14]="Z";
        vector[15]="S";
        vector[16]="Q";
        vector[17]="V";
        vector[18]="H";
        vector[19]="L";
        vector[20]="C";
        vector[21]="K";
        vector[22]="E"; 
        
        return vector;
    }
}
