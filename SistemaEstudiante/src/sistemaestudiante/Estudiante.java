/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author joeld
 */
public class Estudiante {
    
    /*
        Modificadores de acceso
        private
        public 
        protected
    */
    // atributos
    private int edad;
    private double estatura;
    String nombre;
    String apellido;
    private char genero;
    private double descuento;
    
    // Constructor
    public Estudiante() {
        this.edad = 0;
        this.estatura = 0;
        this.nombre = "John";
        this.apellido = "Doe";
        
    } // fin del Constructor
    
    public Estudiante(int edad, double estatura) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = "John";
        this.apellido = "Doe";
    }
    
    // metodo
    public void mostrarDatos() {
        System.out.printf("Nombre: %s%nApellido: %s%nEdad: %d%nEstatura: %.2f%n%n",
                            this.nombre, this.apellido, this.edad, this.estatura);
    } // fin de mostrarDatos
    
    // Getter y Setter
    // modificar edad
    public void setEdad(int edad) {
       if(edad > 0 && edad < 100) {
            this.edad = edad;
       } else {
           System.out.println("Edad Invalida");
       }
    }
    
    // obtener edad
    public int getEdad() {
        return this.edad;
    }
    
    public char getGenero() {
        return this.genero;
    }
    
    public void setGenero(char genero) {
        if(genero == 'm' || genero == 'f') {
            this.genero = genero;
        } else {
            System.out.println("No es valido.");
        }
    }
    
    public void setDescuento(double descuento) {
        if(this.edad > 80) {
            this.descuento = 0.40;
        } else if(this.edad > 60) {
            this.descuento = 0.25;
        } else if(this.edad < 21) {
            this.descuento = 0.10;
        } else {
            this.descuento = 0;
        }
    }
    
    public double getDescuento() {
        return this.descuento;
    }
    
} // fin clase Estudiante
