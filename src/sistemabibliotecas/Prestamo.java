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
public class Prestamo {
    private int idPrestamo, idLibro, idCliente;
    private LocalDate inicioPrestamo, terminoPrestamo;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, int idLibro, int idCliente, LocalDate inicioPrestamo, LocalDate terminoPrestamo) {
        this.idPrestamo = idPrestamo;
        this.idLibro = idLibro;
        this.idCliente = idCliente;
        this.inicioPrestamo = inicioPrestamo;
        this.terminoPrestamo = terminoPrestamo;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getInicioPrestamo() {
        return inicioPrestamo;
    }

    public void setInicioPrestamo(LocalDate inicioPrestamo) {
        this.inicioPrestamo = inicioPrestamo;
    }

    public LocalDate getTerminoPrestamo() {
        return terminoPrestamo;
    }

    public void setTerminoPrestamo(LocalDate terminoPrestamo) {
        this.terminoPrestamo = terminoPrestamo;
    }
    
    
    
}
