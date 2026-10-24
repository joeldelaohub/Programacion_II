/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

import java.util.Scanner;

/**
 *
 * @author joeld
 */
public class SCADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        SensorAmbiental prueba = new SensorAmbiental("AA:BB:CC:DD", 100, 0, true);
        boolean cicloActivo = true;
        char seleccionMenu = '@';
        
        while(cicloActivo) {
            System.out.println("Menu de Control");
            System.out.println("1. Ingresar nueva lectura termica");
            System.out.println("2. Actualizar lectura del higrometro");
            System.out.println("3. solicitud de diagnostico completo");
            System.out.println("4. Inicio de Secuencia de Apagado");
            System.out.print("Seleccion: ");
            seleccionMenu = entrada.next().charAt(0);
            
            switch(seleccionMenu) {
                case '1':
                    System.out.print("Ingresa una temperatura: ");
                    double nuevaTemp = entrada.nextDouble();
                    prueba.setTemperatura(nuevaTemp);
                    break;
                case '2':
                    System.out.print("Ingresa una nueva humedad relativa: ");
                    int nuevaHumedad = entrada.nextInt();
                    prueba.setHumedad(nuevaHumedad);
                    break;
                case '3':
                    prueba.reporteEstado();
                    break;
                case '4':
                    cicloActivo = false;
                    System.out.println("Cerrando....");
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }
    
}
