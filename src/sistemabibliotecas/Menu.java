/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliotecas;

import java.util.Scanner;

/**
 *
 * @author vicente
 */
public class Menu {

    Scanner sc = new Scanner(System.in);
    
    public Menu() {
    }
    
    // métodos custom
    
    public void iniciar(Biblioteca biblioteca) {
        
        boolean ejecutando = true;
        
        while (ejecutando) {
            mostrarMenuPrincipal();
            int opcion = escogerIntSimple("Escoja una opcion: ");
            
            switch (opcion) {
                case 1:
                    System.out.println("Opción 1"); // Menu Clientes
                    break;
                    
                case 2: // Menu Biblioteca
                    menuBiblioteca();
                    break;
                    
                case 3:
                    System.out.println("Opción 3"); // Menu Préstamos
                    break;
                    
                case 4:
                    System.out.println("Gracias por utilizar nuestra app."); // Salir
                    ejecutando = false;
                    break;
                    
                default:
                    System.out.println("Opción inválida.");
                
            }
        }
        
    }
    
    // menú principal
    
    public void mostrarMenuPrincipal() {
        System.out.println("");
        System.out.println("---Menu Principal---");
        System.out.println("1.- Menú Clientes");
        System.out.println("2.- Menú Biblioteca");
        System.out.println("3.- Menú Préstamos");
        System.out.println("4.- Salir");
    }
    
    // menú biblioteca
    
    public void menuBiblioteca() {
        System.out.println("");
        System.out.println("---Menu Biblioteca---");
        System.out.println("1.- Ingresar libro");
        System.out.println("2.- Eliminar libro");
        System.out.println("3.- Listar libros");
        System.out.println("4.- Buscar libro");
        System.out.println("5.- Ingresar categoría");
        System.out.println("6.- Eliminar categoría");
        System.out.println("7.- Listar categorías");
        System.out.println("8.- Listar libros por categoría"); 
        System.out.println("9.- Ingresar autor");
        System.out.println("10.- Eliminar autor");
        System.out.println("11.- Buscar autor");
        System.out.println("12.- Listar autores");
        System.out.println("13.- Volver al menú principal");
        
        int opcion = escogerIntSimple("Escoja una opción: ");
        
        switch (opcion) {
            case 13:
                return;
            
            default:
                System.out.println("Opción inválida.");
        }
    }
    
    // funciones de utilidad
    
    public int escogerIntSimple(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int opcionSimple = sc.nextInt();
                sc.nextLine();
                return opcionSimple;
            } catch (Exception e) {
                System.out.println("Ingrese un número.");
                sc.nextLine();
            }
        }
    }
    
}
