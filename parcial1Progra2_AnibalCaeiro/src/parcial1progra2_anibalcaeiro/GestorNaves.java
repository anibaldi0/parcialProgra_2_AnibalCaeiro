/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1progra2_anibalcaeiro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author lili
 */
public class GestorNaves {
    private List<Nave> naves;

    public GestorNaves() {
        naves = new ArrayList<>();
    }
    
    public void agregarNave(Nave nave){
        if(naves.contains(nave)){
            System.out.println("Ya existe una nave con ese nombre");
        } else {
            naves.add(nave);
            System.out.println("Nave agregada correctamente");
        }
    }
    
    public void mostrarNaves(){
        if(naves.isEmpty()){
            System.out.println("Nohay naves registradas");
        } else {
            for(Nave nave : naves){
                System.out.println(nave);
            }
        }
    }
    
    public void iniciarExploracion(){
        for(Nave nave : naves){
            if(nave instanceof NaveExploracion || nave instanceof Carguero){
                System.out.println("Explorando con: " + nave.getNombre());
            } else {
                System.out.println(nave.getNombre() + " es un crucero Estelar. No participa de exploraciones");
            }
        }
    }
    
    public void ordenarPorNombre(){
        naves.sort(Comparator.comparing(Nave::getNombre, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Naves ordenadas por nombre: ");
        mostrarNaves();
    }
    
    public void ordenarPorAno(){
        Collections.sort(naves);
        System.out.println("Naves ordenadas por ano: ");
        mostrarNaves();
    }
    
    public void ordenarPorCapacidadTripulacion(){
        naves.sort((a, b) -> Integer.compare(b.getCapacidadTripulacion(), a.getCapacidadTripulacion()));
        System.out.println("Naves ordenadas por capacidad de tripulacion: ");
        mostrarNaves();
    }
    
}
