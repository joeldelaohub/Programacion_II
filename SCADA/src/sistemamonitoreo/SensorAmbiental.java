/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamonitoreo;

/**
 *
 * @author joeld
 */
public class SensorAmbiental {
    
    private String codigoMAC;
    private double temperaturaCelsius;
    private int humedadRelativa;
    private boolean estado;
    
    public SensorAmbiental(String codigoMAC, double temperaturaCelsius, int humedadRelativa, boolean estado) {
        this.codigoMAC = codigoMAC;
        this.temperaturaCelsius = temperaturaCelsius;
        this.humedadRelativa = humedadRelativa;
        this.estado = estado;
    }

    public String getCodigoMAC() {
        return this.codigoMAC;
    }

    public double getTemperaturaCelsius() {
        return this.temperaturaCelsius;
    }

    public int getHumedadRelativa() {
        return this.humedadRelativa;
    }

    public boolean isEstado() {
        return this.estado;
    }
    
    public void setTemperatura(double tempCelsius) {
        if(tempCelsius >= -40.0 && tempCelsius <= 125.0) {
            this.temperaturaCelsius = tempCelsius;
            System.out.println("Temperatura actualizada!");
        } else {
            System.out.println("Alerta de Seguridad!!!!!!");
            System.out.println("Lectura de temperatura descartada");
            System.out.println("Fuera de rango");
        }
    }
    
    public void setHumedad(int hr) {
        if(hr < 0 ||  hr > 100) {
            System.out.println("Advertencia. Lectura erronea!");
            this.humedadRelativa = 0;
        } else {
            this.humedadRelativa = hr;
            System.out.println("Humedad actualizada");
        }
    }
    
    public void setCodigoMAC(String codigo) {
        this.codigoMAC = codigo;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void reporteEstado() {
        System.out.printf("Temperatura: %.2f%n", this.temperaturaCelsius);
        System.out.printf("Humedad relativa: %d%n", this.humedadRelativa);
        System.out.printf("Codigo MAC: %s%n", this.codigoMAC);
        System.out.printf("Estado: %b%n",this.estado);
    }
}
