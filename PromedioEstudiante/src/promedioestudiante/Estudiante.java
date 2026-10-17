/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedioestudiante;

import java.util.Scanner;

/**
 *
 * @author joeld
 */
public class Estudiante {
    
    // Variables - Instancias
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    double promedio = 0.0;
    String nombre = "John Doe";
    
    public Estudiante() {
        
    }
    
    public int IngresoNota(Scanner entrada, String numNota) {
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
}
