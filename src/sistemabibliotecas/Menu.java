/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliotecas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vicente
 */
public class Menu {

    Scanner sc = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Menu() {
    }
    
    // métodos custom
    
    public void iniciar(Biblioteca biblioteca) {
        
        boolean ejecutando = true;
        
        while (ejecutando) {
            mostrarMenuPrincipal();
            int opcion = escogerIntSimple("Escoja una opcion: ");
            
            switch (opcion) {
                case 1: // Menu Clientes
                    System.out.println("Opción 1"); 
                    break;
                    
                case 2: // Menu Biblioteca
                    menuBiblioteca(biblioteca);
                    break;
                    
                case 3: // Menu Préstamos
                    System.out.println("Opción 3"); 
                    break;
                    
                case 4: // Salir
                    System.out.println("Gracias por utilizar nuestra app."); 
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
    
    public void menuBiblioteca(Biblioteca biblioteca) {
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
            
            case 1: // ingresar Libro
                String tituloLibro = escogerStringSimple("Ingrese el título del libro: ");
                int idAutorLibro = escogerIntSimple("Ingrese el ID del autor del libro: ");
                Autor autorLibro = null;
                for (Autor autor : biblioteca.getCatalogoAutores()) {
                    if (autor.getIdAutor() == idAutorLibro) {
                        autorLibro = autor; break;
                    }
                }
                if (autorLibro == null) {
                    System.out.println("No se ha encontrado un autor con ese ID. Operación cancelada."); break;
                }
                int idCategoriaLibro = escogerIntSimple("Ingrese el ID de la categoría del libro: ");
                Categoria categoriaLibro = null;
                for (Categoria categoria : biblioteca.getListaCategorias()) {
                    if (categoria.getIdCategoria() == idCategoriaLibro) {
                        categoriaLibro = categoria; break;
                    }
                }
                if (categoriaLibro == null) {
                    System.out.println("No se ha encontrado una categoría con ese ID. Operación cancelada."); break;
                }                
                String textoFechaPublicacion = escogerStringSimple("Ingrese la fecha de publicación del libro, en formato dd/mm/yyyy: ");
                LocalDate fechaParseada = parsearFechaString(textoFechaPublicacion);
                if (fechaParseada == null) {
                    System.out.println("Error en el ingreso de la fecha. Operación cancelada."); break;
                }
                String confirmacion = escogerStringSimple("\nConfirme que desea ingresar el siguiente libro:\nTítulo: " + tituloLibro + "\nAutor: " + autorLibro + "\nCategoría: " + categoriaLibro.getNombreCategoria() + "\nFecha de publicación: " + fechaParseada + "\nIngrese S/N: ");
                if (!confirmacion.equalsIgnoreCase("S") && !confirmacion.equalsIgnoreCase("SI") && !confirmacion.equalsIgnoreCase("SÍ")) {
                    System.out.println("Operación cancelada."); break;
                }       
                Libro libroNuevo = new Libro(biblioteca.getContadorLibros()+1, tituloLibro, autorLibro, categoriaLibro, fechaParseada);
                biblioteca.setContadorLibros(biblioteca.getContadorLibros()+1);
                biblioteca.ingresarLibro(libroNuevo);
                System.out.println("El libro se ha ingresado exitosamente.");
                break;
                
            case 3: // listar libros
                if (biblioteca.getCatalogoLibros().isEmpty()) {
                    System.out.println("No se han ingresado libros.");
                }
                System.out.println("Libros en el catálogo: ");
                for (Libro libro : biblioteca.getCatalogoLibros()) {
                    System.out.println(libro.toString());
                }
                break;
                
            
            case 5: // ingresar categoría
                String nombreCategoria = escogerStringSimple("Ingrese el nombre de la categoría: ");
                String descripcionCategoria = escogerStringSimple("Ingrese la descripción de la categoría: ");
                biblioteca.setContadorCategorias(biblioteca.getContadorCategorias() + 1);
                int idCategoriaNueva = biblioteca.getContadorCategorias();
                Categoria categoriaNueva = new Categoria(idCategoriaNueva, nombreCategoria, descripcionCategoria);
                biblioteca.ingresarCategoria(categoriaNueva);
                System.out.println("Categoría ingresada exitosamente."); break;
                
            case 6: // eliminar categoría
                if (biblioteca.getListaCategorias().isEmpty()) {
                    System.out.println("No se han ingresado categorías."); break;
                }
                int idSeleccionada = escogerIntSimple("Ingrese el ID de la categoría que desea eliminar: ");
                Categoria categoriaEliminar = null;
                for (Categoria categoria : biblioteca.getListaCategorias()) {
                    if (categoria.getIdCategoria() == idSeleccionada) {
                        categoriaEliminar = categoria; break;
                    }
                }
                if (categoriaEliminar == null) {
                    System.out.println("No se ha encontrado una categoría con ese ID. Operación cancelada."); break;
                }
                confirmacion = escogerStringSimple("¿Confirma que desea eliminar la categoría " + categoriaEliminar.getNombreCategoria() + "? Ingrese: S/N: ");
                if (!confirmacion.equalsIgnoreCase("S") && !confirmacion.equalsIgnoreCase("SI") && !confirmacion.equalsIgnoreCase("SÍ")) {
                    System.out.println("Operación cancelada."); break;
                }
                biblioteca.eliminarCategoria(categoriaEliminar);
                System.out.println("Categoría eliminada exitosamente."); break;
                
            case 7: // listar categorías
                biblioteca.listarCategorias();
                break;
                
            case 9: // ingresar autor
                String nombreAutor = escogerStringSimple("Ingrese el nombre del autor que desea ingresar: ");
                String apellidoAutor = escogerStringSimple("Ingrese el apellido del autor que desea ingresar: ");
                String nacionalidadAutor = escogerStringSimple("Ingrese la nacionalidad del autor que desea ingresar: ");
                String textoFechaNac = escogerStringSimple("Ingrese la fecha de nacimiento del autor que desea ingresar en formato dd/mm/yyyy: ");                
                LocalDate parsedFecha = parsearFechaString(textoFechaNac);
                if (parsedFecha == null) {
                    System.out.println("Error en el ingreso de la fecha. Operación cancelada."); break;
                }
                Genero genero = null;           
                while (genero == null) {
                    for (int i = 0; i < Genero.values().length; i++) {
                        System.out.println((i+1) + ". " + Genero.values()[i]);
                    }
                    opcion = escogerIntSimple("Escoja una opción de género: ");
                    switch (opcion) {
                        case 1:
                            genero = Genero.MASCULINO; break;
                        case 2:
                            genero = Genero.FEMENINO; break;
                        case 3:
                            genero = Genero.OTRO; break;
                        default:
                            System.out.println("Opción inválida.");               
                    }
                }
                biblioteca.setContadorAutores(biblioteca.getContadorAutores()+1);
                Autor autorNuevo = new Autor(biblioteca.getContadorAutores(), nombreAutor, apellidoAutor, nacionalidadAutor, parsedFecha, genero);
                biblioteca.ingresarAutor(autorNuevo);
                System.out.println("Autor ingresado exitosamente."); break;
                
            case 10: // eliminar autor
                if (biblioteca.getCatalogoAutores().isEmpty()) {
                    System.out.println("No se han ingresado autores."); break;
                }
                int idAutorEliminar = escogerIntSimple("Ingrese el ID del autor que desea eliminar: ");
                Autor autorEliminar = null;
                for (Autor autor : biblioteca.getCatalogoAutores()) {
                    if (autor.getIdAutor() == idAutorEliminar) {
                        autorEliminar = autor; break;
                    }
                }
                if (autorEliminar == null) {
                    System.out.println("No se ha encontrado un autor con ese ID. Operación cancelada."); break;
                }
                confirmacion = escogerStringSimple("¿Confirma que desea eliminar el autor " + autorEliminar.getNombre() + " " + autorEliminar.getApellido() + "? Ingrese: S/N: ");
                if (!confirmacion.equalsIgnoreCase("S") && !confirmacion.equalsIgnoreCase("SI") && !confirmacion.equalsIgnoreCase("SÍ")) {
                    System.out.println("Operación cancelada."); break;
                }
                biblioteca.eliminarAutor(autorEliminar);
                System.out.println("Autor eliminado exitosamente."); break;

            case 11: // buscar autor
                if (biblioteca.getCatalogoAutores().isEmpty()) {
                    System.out.println("No se han ingresado autores."); break;
                }
                opcion = escogerIntSimple("Ingrese:\n1.- Buscar por ID\n2.- Buscar por nombre\n3.- Buscar por apellido\n4.- Buscar por nacionalidad\nEscoja una opción: ");
                Autor autorBuscado = null;
                boolean busquedaExitosa = false;
                boolean imprimirMensajeExito = false;
                
                switch (opcion) {
                    case 1: // buscar autor por id
                        int idBuscado = escogerIntSimple("Ingrese el ID del autor que desea buscar: ");
                        for (Autor autor : biblioteca.getCatalogoAutores()) {
                            if (autor.getIdAutor() == idBuscado) {
                                autorBuscado = autor; break;
                            }
                        }
                    if (autorBuscado == null) {
                        System.out.println("No se ha encontrado ningún autor."); break;
                    }
                    System.out.println("Autor encontrado: ");
                    System.out.println(autorBuscado.toString()); break;
                    
                    case 2: // buscar autor por nombre 
                        String nombreBuscar = escogerStringSimple("Ingrese el nombre del autor que desea buscar: ");
                        for (Autor autor : biblioteca.getCatalogoAutores()) {
                            if (autor.getNombre().toLowerCase().contains(nombreBuscar)) {
                                busquedaExitosa = true;
                                if (busquedaExitosa == true && imprimirMensajeExito == false) {
                                    System.out.println("Autores encontrados: ");
                                    imprimirMensajeExito = true;
                                }
                                System.out.println(autor.toString());
                            }
                        }
                        if (busquedaExitosa == false) {
                            System.out.println("No se ha encontrado ningún autor.");
                        }
                        break;
                        
                    case 3: // buscar autor por apellido
                        String apellidoBuscar = escogerStringSimple("Ingrese el apellido del autor que desea buscar: ");
                        for (Autor autor : biblioteca.getCatalogoAutores()) {
                            if (autor.getApellido().toLowerCase().contains(apellidoBuscar)) {
                                busquedaExitosa = true;
                                if (busquedaExitosa == true && imprimirMensajeExito == false) {
                                    System.out.println("Autores encontrados: ");
                                    imprimirMensajeExito = true;
                                }
                                System.out.println(autor.toString());
                            }
                        }
                        if (busquedaExitosa == false) {
                            System.out.println("No se ha encontrado ningún autor.");
                        }
                        break;
                        
                    case 4: // buscar autor por nacionalidad
                        String nacionalidadBuscar = escogerStringSimple("Ingrese la nacionalidad del autor que desea buscar: ");
                        for (Autor autor : biblioteca.getCatalogoAutores()) {
                            if (autor.getNacionalidad().toLowerCase().contains(nacionalidadBuscar)) {
                                busquedaExitosa = true;
                                if (busquedaExitosa == true && imprimirMensajeExito == false) {
                                    System.out.println("Autores encontrados: ");
                                    imprimirMensajeExito = true;
                                }
                                System.out.println(autor.toString());
                            }
                        }
                        if (busquedaExitosa == false) {
                            System.out.println("No se ha encontrado ningún autor.");
                        }
                        break;
                    
                    default:
                        System.out.println("Opción inválida."); break;               
                }           
                break;
                
            case 12: // listar autores
                if (biblioteca.getCatalogoAutores().isEmpty()) {
                    System.out.println("No se han ingresado autores."); break;
                }
                for (Autor autor : biblioteca.getCatalogoAutores()) {
                    System.out.println(autor.toString());
                } break;
                
            case 13: // volver al menú principal
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
    
    public String escogerStringSimple(String mensaje) {
        System.out.print(mensaje);
        String texto = sc.nextLine();
        return texto;
    }
    
    public LocalDate parsearFechaString(String textoFecha) { 
        try {
            LocalDate parsedFecha = LocalDate.parse(textoFecha, formatter); 
            return parsedFecha;
        } catch (Exception e) {
            return null;
        }
    }
    
}
