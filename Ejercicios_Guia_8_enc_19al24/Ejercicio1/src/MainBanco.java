
import CeuntaBancaria.CuentaBancaria;
import CeuntaBancaria.Servicios.CuentaBancariaService;
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
public class MainBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancariaService cs = new CuentaBancariaService();
        CuentaBancaria cuenta = cs.CrearCuenta(); 
        menuOpciones(cuenta, cs);
    }
    
    public static void menuOpciones(CuentaBancaria cuenta,CuentaBancariaService cs){
        Scanner leer = new Scanner(System.in);
        int opc;
        double saldo;
        do{
        System.out.println("1- Inresar saldo");
        System.out.println("2- Retirar saldo");
        System.out.println("3- Extraccion Rapida");
        System.out.println("4- Consutlar saldo");
        System.out.println("5- Consultar datos");
        System.out.println("0- Salir");
        opc= leer.nextInt();
        
            switch(opc){
                case 1:
                    System.out.println("Ingrese monto");
                    saldo=leer.nextDouble();
                    cs.IngresarDinero(saldo, cuenta);
                    break;
                case 2: 
                    System.out.println("Ingrese monto");
                    saldo=leer.nextDouble();
                    cs.Retirar(saldo, cuenta);
                    break;
                case 3:
                    System.out.println("Ingrese monto");
                    saldo=leer.nextDouble();
                    cs.ExtraccionRapida(saldo, cuenta);
                    break;
                case 4:
                    cs.ConsultarSaldo(cuenta);
                    break;
                case 5:
                    cs.ConsultarDatos(cuenta);
                    break;
                case 0: 
                    System.out.println("Salio del programa");
                    break;
                default:
                    System.out.println("Error, opcion incorrecta");
                    break;
            }
        }while(opc!=0);
    }
     
}
