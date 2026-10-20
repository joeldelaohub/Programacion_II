/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author joeld
 */
public class SistemaEstudiante {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante oscar = new Estudiante();
        Estudiante daniel = new Estudiante(15, 1.90);
        
        oscar.mostrarDatos();
        daniel.mostrarDatos();
        
        oscar.setEdad(90);
        daniel.setEdad(200);
        
        oscar.mostrarDatos();
        daniel.mostrarDatos();
        
        oscar.setDescuento(0.90);
        System.out.printf("%.2f%n", oscar.getDescuento());
        
        daniel.setEdad(90);
        daniel.setDescuento(0.90);
        System.out.printf("%.2f%n", daniel.getDescuento());
        
        daniel.setEdad(50);
        daniel.setDescuento(0.90);
        System.out.printf("%.2f%n", daniel.getDescuento());
    }
    
}
