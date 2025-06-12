/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1progra2_anibalcaeiro;

import java.util.Objects;

/**
 *
 * @author lili
 */
public abstract class Nave implements Comparable<Nave> {
    private String nombre;
    private int capacidadTripulacion;
    private int anoLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anoLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anoLanzamiento = anoLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }
    
    public abstract String getTipo();


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Nave){
            Nave otra = (Nave) obj;
            return this.nombre.equalsIgnoreCase(otra.nombre)
                    && this.anoLanzamiento == otra.anoLanzamiento;
        }
        return false;
    }
    
    

    @Override
    public int compareTo(Nave otra){
        return Integer.compare(otra.anoLanzamiento, this.anoLanzamiento);
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", capacidadTripulacion=" + capacidadTripulacion + ", anoLanzamiento=" + anoLanzamiento + '}';
    }
    
    
    
}
