package org.example;

public class Libro {

    private String Titulo;
    private String Autor;
    private String Isbn;
    private boolean Disponible;

    public Libro (String Titulo, String Autor, String Isbn, boolean Disponible) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Isbn = Isbn;
        this.Disponible = Disponible;
    }

    public String getTitulo(){
        return Titulo;
        }

    public void setTitulo(String Titulo){
        this.Titulo=Titulo;
        }

    public String getAutor(){
        return Autor;
    }

    public void setAutor(){
        this.Autor=Autor;
    }

    public String getIsbn(String Isbn){
        return Isbn;
    }

    public void setIsbn(String Isbn){
        this.Isbn=Isbn;
    }

    public boolean isDisponible(){
        return Disponible;
    }

    public void setDisponible(boolean Disponible){
        this.Disponible=Disponible;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: "+Titulo+",Autor"+Autor+", ISBN"+Isbn+", Disponible: "+(Disponible ? "Si" : "No"));
    }
}
