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
        
        // funcionamiento de la app
        System.out.println("---Bienvenidos a la app de la " + biblioteca.getNombreBiblioteca() + ".");        
        menu.iniciar(biblioteca);
        
    }
    
}
