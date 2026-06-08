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
    private ArrayList<Prestamo> listaPrestamos = new ArrayList<>();
    private ArrayList<Categoria> listaCategorias = new ArrayList<>();
    private int contadorCategorias = 0;
    private int contadorLibros = 0;
    private int contadorAutores = 0;
    private int contadorPrestamos = 0;
    private int contadorClientes = 0;
    
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

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamo) {
        this.listaPrestamos = listaPrestamo;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listaCategoria) {
        this.listaCategorias = listaCategoria;
    }

    public int getContadorCategorias() {
        return contadorCategorias;
    }

    public void setContadorCategorias(int contadorCategorias) {
        this.contadorCategorias = contadorCategorias;
    }

    public int getContadorLibros() {
        return contadorLibros;
    }

    public void setContadorLibros(int contadorLibros) {
        this.contadorLibros = contadorLibros;
    }

    public int getContadorAutores() {
        return contadorAutores;
    }

    public void setContadorAutores(int contadorAutores) {
        this.contadorAutores = contadorAutores;
    }

    public int getContadorPrestamos() {
        return contadorPrestamos;
    }

    public void setContadorPrestamos(int contadorPrestamos) {
        this.contadorPrestamos = contadorPrestamos;
    }

    public int getContadorClientes() {
        return contadorClientes;
    }

    public void setContadorClientes(int contadorClientes) {
        this.contadorClientes = contadorClientes;
    }
    
    // métodos custom
    
    // categorías
    
    public void ingresarCategoria(Categoria categoria) {
        listaCategorias.add(categoria);
    }
    
    public void eliminarCategoria(Categoria categoria) {
        listaCategorias.remove(categoria);
    }
    
    public void listarCategorias() {
        if (getListaCategorias().isEmpty()) {
            System.out.println("No se han ingresado categorías.");
        }
        for (Categoria categoria : getListaCategorias()) {
            System.out.println(categoria.toString());
        }
    }
    
    // autores
    
    public void ingresarAutor(Autor autor) {
        catalogoAutores.add(autor);
    }
    
    public void eliminarAutor(Autor autor) {
        catalogoAutores.remove(autor);
    }
    
    // libros
    
    public void ingresarLibro(Libro libro) {
        catalogoLibros.add(libro);
    }
}
