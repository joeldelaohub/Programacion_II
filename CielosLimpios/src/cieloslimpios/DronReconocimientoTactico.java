/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;
import java.util.Random;
/**
 *
 * @author joeld
 */
public class DronReconocimientoTactico extends Dron {
    private int[] cuadrantesForestales;
    
    public DronReconocimientoTactico(String codigoSerie, int porcentajeEnergia) {
        super(codigoSerie, porcentajeEnergia);
        this.cuadrantesForestales = new int[7];
    }
    
    public void generarMapeoEstocastico() {
        Random rnd = new Random();
        for (int i = 0; i < cuadrantesForestales.length; i++) {
            cuadrantesForestales[i] = rnd.nextInt(51);
        }
        System.out.printf("Mapeo generado en %s", getCodigoSerie());
    }
    
    public void analizarAmenazas() {
        for (int i = 0; i < cuadrantesForestales.length; i++) {
            if(cuadrantesForestales[i] > 35) {
                System.out.printf("Amenaza en el cuadrante %d%n", i + 1);
                emitirAlertaIncendio();
                return;
            }
        }
        System.out.printf("Sin Amenazas en %s", getCodigoSerie());
    }
    
    private void emitirAlertaIncendio() {
        System.out.println("ALERTA ROJA! Posible incendio en el sector");
    }
}
