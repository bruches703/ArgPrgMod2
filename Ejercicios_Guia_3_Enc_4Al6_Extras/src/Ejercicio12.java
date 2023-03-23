
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
public class Ejercicio12 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int a=0,b=0,c=0;
        String salida,aS,bS,cS;
        
        while (a<=9 && b<=9 && c<=9){
            aS= asignar(a);
            bS= asignar(b);
            cS= asignar(c);
            
            salida= aS+"-"+bS+"-"+cS;
            
            System.out.println(salida);
            c++;
            if(c==10){
                c=0;
                b++;
            }
            
            if(b==10){
                b=0;
                a++;
            }
        }
    }
    
    public static String asignar(int num){
        String cadena;
        if(num==3){
            cadena="E";
        }else{
            cadena=num+"";
        }
        return cadena;
    }
    
}
