/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliotecas;

import java.util.ArrayList;

/**
 *
 * @author vicente
 */
public class Biblioteca {
    
    private String nombreBiblioteca;
    private ArrayList<Libro> catalogoLibros = new ArrayList<>();
    private ArrayList<Autor> catalogoAutores = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Prestamo> listaPrestamo = new ArrayList<>();
    private ArrayList<Categoria> listaCategoria = new ArrayList<>();

    public Biblioteca() {
    }

    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public ArrayList<Libro> getCatalogoLibros() {
        return catalogoLibros;
    }

    public void setCatalogoLibros(ArrayList<Libro> catalogoLibros) {
        this.catalogoLibros = catalogoLibros;
    }

    public ArrayList<Autor> getCatalogoAutores() {
        return catalogoAutores;
    }

    public void setCatalogoAutores(ArrayList<Autor> catalogoAutores) {
        this.catalogoAutores = catalogoAutores;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Prestamo> getListaPrestamo() {
        return listaPrestamo;
    }

    public void setListaPrestamo(ArrayList<Prestamo> listaPrestamo) {
        this.listaPrestamo = listaPrestamo;
    }

    public ArrayList<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }
    
    
}
