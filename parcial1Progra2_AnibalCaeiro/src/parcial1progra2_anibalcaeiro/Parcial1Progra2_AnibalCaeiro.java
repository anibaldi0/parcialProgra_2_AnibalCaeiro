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
        
        do {
            System.out.println("\n--- MENU DE GESTION DE NAVES ---");
            System.out.println("1. Agregar nave");
            System.out.println("2. Mostrar todas las naves");
            System.out.println("3. Iniciar mision de exploracion");
            System.out.println("4. Ordenar por nombre");
            System.out.println("5. Ordenar por ano de lanzamiento");
            System.out.println("6. Ordenar por capacidad de tripulacion");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un numero valido: ");
                sc.next();
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione tipo de nave:");
                    System.out.println("1. Nave de exploracion");
                    System.out.println("2. Carguero");
                    System.out.println("3. Crucero Estelar");
                    System.out.print("Opcion: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Capacidad de tripulacion: ");
                    int tripulacion = sc.nextInt();

                    System.out.print("Ano de lanzamiento: ");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    if (tripulacion <= 0 || ano <= 0 || nombre.isBlank()) {
                        System.out.println("Los datos son invalidos. Intente nuevamente.");
                        break;
                    }

                    switch (tipo) {
                        case 1:
                            System.out.print("Tipo de mision (CARTOGRAFIA / INVESTIGACION / CONTACTO): ");
                            String mision = sc.nextLine().toUpperCase();
                            if (mision.equals("CARTOGRAFIA") || mision.equals("INVESTIGACION") || mision.equals("CONTACTO")) {
                                gestor.agregarNave(new NaveExploracion(nombre, tripulacion, ano, mision));
                            } else {
                                System.out.println("Tipo de mision invalida.");
                            }
                            break;

                        case 2:
                            System.out.print("Capacidad de carga (100 a 500 toneladas): ");
                            int carga = sc.nextInt();
                            sc.nextLine();
                            gestor.agregarNave(new Carguero(nombre, tripulacion, ano, carga));
                            break;

                        case 3:
                            System.out.print("Cantidad de pasajeros: ");
                            int pasajeros = sc.nextInt();
                            sc.nextLine();
                            gestor.agregarNave(new CruceroEstelar(nombre, tripulacion, ano, pasajeros));
                            break;

                        default:
                            System.out.println("Tipo invalido.");
                    }
                    break;

                case 2:
                    gestor.mostrarNaves();
                    break;

                case 3:
                    gestor.iniciarExploracion();
                    break;

                case 4:
                    gestor.ordenarPorNombre();
                    break;

                case 5:
                    gestor.ordenarPorAno();
                    break;

                case 6:
                    gestor.ordenarPorCapacidadTripulacion();
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 7);

        sc.close();
    }
}
