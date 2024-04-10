package com.empresa.teoria;

/*
por principio de responsabilidad única NO añado métodos de prestar libros
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
