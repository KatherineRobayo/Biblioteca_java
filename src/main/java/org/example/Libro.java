package org.example;

public class Libro {

    //Se agregan los atributos que va a tener la clase libro
    private String titulo; //Este atributo almacena el nombre del libro
    private String autor; //Almacena el nombre del autor del libro
    private String isbn; //Almacena el isbn del libro
    private boolean disponible; //Este atributo indica si el libro esta disponible (True) y si no esta disponible (False)

    //Este constructor de la clase libro recibe los parametros para almacenar los atributos
    public Libro (String titulo, String autor, String isbn, boolean disponible) {
        this.titulo = titulo; //Asigna el valor que va a tener el parametro "titulo" al atributo de la clase
        this.autor = autor; //Asigna el valor que va a tener el parametro "autor" al atributo de la clase
        this.isbn = isbn; //Asigna el valor que va a tener el parametro "isbn" al atributo de la clase
        this.disponible = disponible; //Asigna el valor que va a tener el parametro "disponible" al atributo de la clase
    }
        //Se utilizan los siguientes metodos getters para obtener los valores de los atributos
    public String getTitulo(){
        return titulo; //Retorna el titulo del libro
        }

    public void setTitulo(String titulo){
        this.titulo=titulo; //Asigna un nuevo valor al titulo del libro
        }

    public String getAutor(){
        return autor; //Retorna el nombre del autor del libro
    }

    public void setAutor(String autor){
        this.autor=autor; //Asigna un nuevo valor al autor del libro
    }

    public String getIsbn(){
        return isbn; //Retorna el isbn del libro
    }

    public void setIsbn(String isbn){
        this.isbn=isbn; //Asigna un nuevo valor al isbn del libro
    }

    public boolean isDisponible(){
        return disponible; //Retorna si el libro esta disponible o no
    }

    public void setDisponible(boolean disponible){
        this.disponible=disponible; //Asigna un nuevo valor a la disponibilidad del libro
    }
    //Se asigna este metodo para mostrar en la consola toda la informacion del libro
    public void mostrarInfo(){
        System.out.println("Titulo: "+titulo+",Autor"+autor+", ISBN"+isbn+", Disponible: "+(disponible ? "Si" : "No"));
        //Imprime los valores de los atributos del libro
    }
}
