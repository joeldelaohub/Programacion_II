/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioestudiante;

import java.util.Scanner;

/**
 *
 * @author joeld
 */
public class PromedioEstudiante {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita ingresar
     * las tres notas de un estudiante para poder calcular
     * el promedio y determinar con ello si aprueba (>70) o
     * no la asignatura
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
//        
//        int nota1 = 0;
//        int nota2 = 0;
//        int nota3 = 0;
//        double promedio = 0.0;
//        String nombre = "John Doe";
        
//        System.out.print("Ingresa la primera nota: ");
//        nota1 = entrada.nextInt();
//        
//        System.out.print("Ingresa la segunda nota: ");
//        nota2 = entrada.nextInt();
//        
//        System.out.print("Ingresa la tercera nota: ");
//        nota3 = entrada.nextInt();

//          nota1 = IngresoNota(entrada, "primera");
//          nota2 = IngresoNota(entrada, "segunda");
//          nota3 = IngresoNota(entrada, "tercera");  
//          
//          promedio = calculoPromedio(nota1, nota2, nota3);
//          
//          if(promedio >= 70) {
//              System.out.println("Aprobado!");
//          }else  {
//              System.out.println("Reprobado!");
//          }
            
            Estudiante joel = new Estudiante();
            
            joel.nota1 = joel.IngresoNota(entrada, "primera");
            joel.nota2 = joel.IngresoNota(entrada, "segunda");
            joel.nota3 = joel.IngresoNota(entrada, "tercera");
            
            joel.promedio = joel.calculoPromedio(joel.nota1, joel.nota2, joel.nota3);
        
    } // fin del main
    
    /*
    public static int IngresoNota(Scanner entrada, String numNota) {
        int notaTemporal = 0;
        
        System.out.printf("Ingresa la %s nota: ", numNota);
        notaTemporal = entrada.nextInt();
        
        notaTemporal = ValidarNota(entrada, notaTemporal, 0, 100);
        return notaTemporal;
    }
    
    public int ValidarNota(Scanner entrada, int nota, int limiteInferior, int limiteSuperior) {
        do {
            if(nota < limiteInferior || nota > limiteSuperior) {
                System.out.println("Nota fuera de rango");
                System.out.printf("Limites son %d - %d  \n", limiteInferior, limiteSuperior);
                System.out.println("Ingrese nuevamente la nota");
                System.out.println("Nota: ");
                nota = entrada.nextInt();
            }
        }while(nota < limiteInferior || nota > limiteSuperior);
        
        return nota;
    }
    
    public double calculoPromedio(int n1, int n2, int n3) {
        double valorTemporal = 0;
        
        valorTemporal = (n1 + n2+ n3) / 3;
        return valorTemporal;
    }
    */
    
} // fin de PromedioEstudiante
