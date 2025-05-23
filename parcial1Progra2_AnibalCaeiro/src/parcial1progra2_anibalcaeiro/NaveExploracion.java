/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1progra2_anibalcaeiro;

/**
 *
 * @author lili
 */
public class NaveExploracion extends Nave {
    private String tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anoLanzamiento, String tipoMision) {
        super(nombre, capacidadTripulacion, anoLanzamiento);
        this.tipoMision = tipoMision;
    }

    public String getTipoMision() {
        return tipoMision;
    }

    @Override
    public String getTipo() {
        return "Nave de Exploracion";
    }

    @Override
    public String toString() {
        return super.toString() + ", Mision: " + tipoMision;
    }
}
