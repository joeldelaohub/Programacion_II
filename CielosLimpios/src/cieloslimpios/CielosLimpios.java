/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cieloslimpios;

import java.util.Random;


/**
 *
 * @author joeld
 */
public class CielosLimpios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        DronReconocimientoTactico[] escuadronTactico = new DronReconocimientoTactico[3];
        DronCarga[] escuadronPesado = new DronCarga[2];
        
        escuadronTactico[0] = new DronReconocimientoTactico("TAC-001", 100);
        escuadronTactico[1] = new DronReconocimientoTactico("TAC-002", 85);
        escuadronTactico[2] = new DronReconocimientoTactico("TAC-003", 70);
        
        escuadronPesado[0] = new DronCarga("PES-001", 90, 100.0);
        escuadronPesado[1] = new DronCarga("PES-002", 60, 150.0);
        
        // conectandolos a la red
        for(DronReconocimientoTactico d: escuadronTactico) {
            d.setConectadoRed(true);
        }
        
        for(DronCarga d: escuadronPesado) {
            d.setConectadoRed(true);
        }
        
        // ciclo de reconocimiento
        System.out.println("Escuadron tactico");
        for(DronReconocimientoTactico d: escuadronTactico) {
            d.generarMapeoEstocastico();
            d.analizarAmenazas();
            System.out.println();
        }
        
        System.out.println("Escuadron Pesado");
        for(DronCarga d: escuadronPesado) {
            double pesoDesecho = rnd.nextInt(200) + 1; // 1 a 200
            d.engancharDesecho(pesoDesecho);
            d.descargarContenedorBase();
            System.out.println();
        }
        
        System.out.println("Desgaste Post Mision");
        int[] desgasteTactico = {30, 150, -50};
        for (int i = 0; i < escuadronTactico.length; i++) {
            DronReconocimientoTactico d = escuadronTactico[i];
            d.setPorcentajeEnergia(d.getPorcentajeEnergia() - desgasteTactico[i]);
        }
        System.out.println();
        
        System.out.println("Telemetria Final");
        for ( DronReconocimientoTactico d: escuadronTactico) {
            d.transmitirEstadoRed();
            System.out.println();
        }
        
        for (DronCarga d: escuadronPesado) {
            d.transmitirEstadoRed();
            System.out.println();
        }
    }
    
}
