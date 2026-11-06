/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

/**
 *
 * @author joeld
 */
public class DronCarga extends Dron {
    private double cargaMaxima;
    private double cargaActual;

    public DronCarga(String codigoSerie, int porcentajeEnergia, double cargaMaxima) {
        super(codigoSerie, porcentajeEnergia);
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = 0;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }
    
    public boolean evaluarPesoObjeto(double pesoNuevo) {
        return (cargaActual + pesoNuevo) > cargaMaxima;
    }
    
    public void engancharDesecho(double pesoNuevo) {
        if(evaluarPesoObjeto(pesoNuevo)) {
            System.out.printf("Maniora abortada, el objeto de %.2f kg es demasiado pesado", pesoNuevo);
        } else {
            cargaActual += pesoNuevo;
            System.out.printf("%s: desecho de %.2f kg enganchado con exito. Carga Actual: %.2f Kg %n",
                    getCodigoSerie(), pesoNuevo, cargaActual);
        }
    }
    
    public void descargarContenedorBase() {
        System.out.printf("%s: compuerta abierta, descargando %.2f kg", getCodigoSerie(), cargaActual);
        this.cargaActual = 0;
    }
}
