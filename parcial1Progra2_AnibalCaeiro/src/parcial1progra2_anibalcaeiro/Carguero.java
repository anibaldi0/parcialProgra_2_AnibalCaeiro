/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1progra2_anibalcaeiro;

/**
 *
 * @author lili
 */
public class Carguero extends Nave {
    
    private int capacidadCarga;

    public Carguero(String nombre, int capacidadTripulacion, int anoLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulacion, anoLanzamiento);

        if (capacidadCarga < 100) {
            capacidadCarga = 100;
        } else if (capacidadCarga > 500) {
            capacidadCarga = 500;
        }

        this.capacidadCarga = capacidadCarga;
    }

    
    public int getCapacidadCarga(){
        return capacidadCarga;
    }
    
    

    @Override
    public String getTipo() {
        return "Carguero";
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga: " + capacidadCarga + " toneladas";
    }

    
}
