/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabibliotecas;

import java.util.Scanner;

/**
 *
 * @author vicente
 */
public class SistemaBibliotecas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // creacion de variables
        Biblioteca biblioteca = new Biblioteca("Biblioteca Testing");
        Menu menu = new Menu();
        cargaDatosPrueba(biblioteca);
        
        // funcionamiento de la app
        System.out.println("---Bienvenidos a la app de la " + biblioteca.getNombreBiblioteca() + ".");        
        menu.iniciar(biblioteca);
        
    }
    
    public static void cargaDatosPrueba(Biblioteca biblioteca) {
        Categoria categoria1 = new Categoria (1, "Fantasía", "Libros como 'El señor de los anillos'");
        Categoria categoria2 = new Categoria (2, "Ciencia Ficción", "Libros como 'Fundación'");
        Categoria categoria3 = new Categoria (3, "Clásicos", "Libros como 'Moby Dick'");
        biblioteca.ingresarCategoria(categoria1);
        biblioteca.ingresarCategoria(categoria2);
        biblioteca.ingresarCategoria(categoria3);
    }
    
}
