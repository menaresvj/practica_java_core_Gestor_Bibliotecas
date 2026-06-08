/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliotecas;

import java.time.LocalDate;

/**
 *
 * @author vicente
 */
public class Libro {
    
    private int idLibro;
    private String titulo;
    private Autor autor;
    private Categoria categoria;
    private LocalDate fechaPublicacion;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, Autor autor, Categoria categoria, LocalDate fechaPublicacion) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.fechaPublicacion = fechaPublicacion;
    }

    
    
    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "ID: " + idLibro + " | Titulo: " + titulo + " 1 Autor: " + autor.getNombre() + " " + autor.getApellido() + " | Categoria: " + categoria.getNombreCategoria() + " | Fecha de publicacion: " + fechaPublicacion;
    }
    
    
    
}
