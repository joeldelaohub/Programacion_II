
package cieloslimpios;

/**
 *
 * @author joeld
 */
public class Dron {
    private String codigoSerie;
    private int porcentajeEnergia;
    private boolean conectadoRed;

    public Dron(String codigoSerie, int porcentajeEnergia) {
        this.codigoSerie = codigoSerie;
        this.conectadoRed = false;
        setPorcentajeEnergia(porcentajeEnergia);
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public int getPorcentajeEnergia() {
        return porcentajeEnergia;
    }

    public void setPorcentajeEnergia(int porcentajeEnergia) {
        if(porcentajeEnergia < 0) {
            System.out.println("Valor invalido. se asignara 0");
            this.porcentajeEnergia = 0;
        } else if(porcentajeEnergia > 100) {
            System.out.println("Valor invalido. se asignara 100");
            this.porcentajeEnergia = 100;
        } else {
            this.porcentajeEnergia = porcentajeEnergia;
        }
        calibrarGiroscopioInterno();
    }

    public boolean isConectadoRed() {
        return conectadoRed;
    }

    public void setConectadoRed(boolean conectadoRed) {
        this.conectadoRed = conectadoRed;
    }
    
    private void calibrarGiroscopioInterno() {
        System.out.printf("Calibrando giroscopio interno de %s%n", codigoSerie);
    }
    
    public void transmitirEstadoRed() {
        System.out.printf("Numero de serie: %s%n", codigoSerie);
        System.out.printf("Bateria actual: %d%%%n", porcentajeEnergia);
        System.out.printf("Lista para el desarrollo: %s%n", conectadoRed ? "SI": "NO");
    }
}
