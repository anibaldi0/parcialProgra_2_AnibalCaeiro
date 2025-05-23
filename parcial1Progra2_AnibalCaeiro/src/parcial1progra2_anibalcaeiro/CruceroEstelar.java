/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1progra2_anibalcaeiro;

/**
 *
 * @author lili
 */
public class CruceroEstelar extends Nave {
    
    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int anoLanzamiento, int cantidadPasajeros) {
        super(nombre, capacidadTripulacion, anoLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    public int getCantidadPasajeros(){
        return cantidadPasajeros;
    }

    @Override
    public String getTipo() {
        return "Crucero Estelar";
    }

    @Override
    public String toString() {
        return super.toString() + ", Pasajeros: " + cantidadPasajeros;
    }
}
