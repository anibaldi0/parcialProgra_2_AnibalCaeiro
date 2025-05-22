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

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, int anoLanzamiento) {
        super(nombre, capacidadTripulacion, anoLanzamiento);
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
        return "Carguero{" + "capacidadCarga= " + capacidadCarga + " toneladas";
    }

    
}
