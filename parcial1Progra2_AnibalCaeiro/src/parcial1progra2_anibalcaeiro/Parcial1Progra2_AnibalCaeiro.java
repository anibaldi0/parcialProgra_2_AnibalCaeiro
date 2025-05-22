/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1progra2_anibalcaeiro;

import java.util.Scanner;

/**
 *
 * @author lili
 */
public class Parcial1Progra2_AnibalCaeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        GestorNaves gestor = new GestorNaves();
        
        int opcion;
        
        do{
            System.out.println("MENU DE GESTOIN DE NAVES");
            System.out.println("1. Agregar nave");
            System.out.println("2. Mostrar todas las naves");
            System.out.println("3. Iniciar mision de exploracion");
            System.out.println("4. Ordenar por nombre");
            System.out.println("5. Ordenar por ano de lanzamiento");
            System.out.println("6. Ordenar por capacidad de tripulacion");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opcion: ");
            
            while (!sc.hasNext()){
                System.out.println("Ingrese un numero valido");
                sc.next();
            }
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion){
                case 1:
                    System.out.println("Seleccione tipo de nave: ");
            }
            
        }
        
    }
    
}
