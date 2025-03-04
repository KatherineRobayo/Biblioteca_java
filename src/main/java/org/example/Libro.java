package org.example;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro (String Titulo, String Autor, String Isbn, boolean Disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitulo(){
        return titulo;
        }

    public void setTitulo(String titulo){
        this.titulo=titulo;
        }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: "+titulo+",Autor"+autor+", ISBN"+isbn+", Disponible: "+(disponible ? "Si" : "No"));
    }
}
