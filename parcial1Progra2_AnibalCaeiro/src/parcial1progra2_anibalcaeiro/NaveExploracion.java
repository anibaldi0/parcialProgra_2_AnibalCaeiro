/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1progra2_anibalcaeiro;

/**
 *
 * @author lili
 */
public class NaveExploracion extends Nave{
    private String tipoMision;

    public NaveExploracion(String tipoMision, String nombre, int capacidadTripulacion, int anoLanzamiento) {
        super(nombre, capacidadTripulacion, anoLanzamiento);
        this.tipoMision = tipoMision;
    }
    
    public String getTipoMision(){
        return tipoMision;
    }

    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }    

    @Override
    public int compareTo(Nave otra) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "NaveExploracion{" + "tipoMision=" + tipoMision + '}';
    }
    
    
    
}
