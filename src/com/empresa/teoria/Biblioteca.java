package com.empresa.teoria;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;//relación uno a varios entre tablas
    private List<Usuario> usuarios;
    private static final String  MENSAJE="El libro";

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //método para añadir libros a la biblioteca
    //SOLID el principio OCP implica que NO puedo modificar una funcionalidad, pero puedo añadir otras nuevas
    // *cuidado incumplir el principio SRP responsabilidad unica
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    //método para prestar libros
    public void prestarLibro(Libro libro,Usuario usuario){
        if(!libro.isPrestado()){
            libro.setPrestado(true);
            System.out.println(MENSAJE+libro.getTitulo()+"ha sido prestado a "+usuario.getNombre());
        }
        else{
            System.out.println(MENSAJE+libro.getTitulo()+"ya está prestado");
        }

    }//cierra prestarLibro

    public void devolverLibro(Libro libro){
        libro.setPrestado(false);
        System.out.println(MENSAJE+libro.getTitulo()+"ha sido devuelto");
    }

}
