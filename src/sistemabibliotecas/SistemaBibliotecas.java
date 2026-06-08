/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabibliotecas;

import java.time.LocalDate;
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
        
        // cargar categorías
        Categoria categoria1 = new Categoria (1, "Fantasía", "Libros como 'El señor de los anillos'");
        Categoria categoria2 = new Categoria (2, "Ciencia Ficción", "Libros como 'Fundación'");
        Categoria categoria3 = new Categoria (3, "Clásicos", "Libros como 'Moby Dick'");
        biblioteca.ingresarCategoria(categoria1);
        biblioteca.ingresarCategoria(categoria2);
        biblioteca.ingresarCategoria(categoria3);
        biblioteca.setContadorCategorias(biblioteca.getListaCategorias().size());
        
        // cargar autores                
        Autor autor1 = new Autor(1, "J.R.R.", "Tolkien", "Británica", LocalDate.of(1892, 1, 3), Genero.MASCULINO);
        Autor autor2 = new Autor(2, "Isaac", "Asimov", "Estadounidense", LocalDate.of(1920, 1, 2), Genero.MASCULINO);
        Autor autor3 = new Autor(3, "Jane", "Austen", "Británica", LocalDate.of(1775, 12, 16), Genero.FEMENINO);
        biblioteca.ingresarAutor(autor1);
        biblioteca.ingresarAutor(autor2);
        biblioteca.ingresarAutor(autor3);
        biblioteca.setContadorAutores(biblioteca.getCatalogoAutores().size());

    }
    
}
