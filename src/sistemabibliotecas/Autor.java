/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliotecas;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author vicente
 */
public class Autor {

    private int idAutor;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private Genero genero;

    private ArrayList<Libro> librosEscritos = new ArrayList<>();

    public Autor() {
    }

    public Autor(int idAutor, String nombre, String apellido, String nacionalidad, LocalDate fechaNacimiento, Genero genero) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Libro> getLibrosEscritos() {
        return librosEscritos;
    }

    public void setLibrosEscritos(ArrayList<Libro> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }

    @Override
    public String toString() {
        return "ID: " + idAutor + " | Nombre: " + nombre + " | Apellido: " + apellido + " | Nacionalidad: " + nacionalidad + " | Fecha de nacimiento: " + fechaNacimiento + " | Genero: " + genero + " | Libros en la biblioteca: " + librosEscritos.size();
    }
    
    

}
