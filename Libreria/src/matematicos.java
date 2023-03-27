/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class matematicos {
    
    public static int sumaDe_Y_(int a, int b){
        //suma entre a y b
        return Math.addExact(a, b);
    }
    
    public static int dividicionDe_Y_(int a, int b){
        //division entre a y b
        int resultado;
        if(b<=0){
            resultado=0;
        }else {
            resultado=Math.floorDiv(a, b);
        }
        return resultado;
    }
    
    public static int restaDe_Y_(int a, int b){
        //resta entre a y b
        return Math.subtractExact(a, b);
    }
    public static int multiplicacionDe_Y_(int a, int b){
        // multiplicacion entre a y b
        return Math.multiplyExact(a, b);
    }
}
