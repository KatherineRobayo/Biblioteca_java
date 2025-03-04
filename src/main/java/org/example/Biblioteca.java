package org.example;// Define el paquete donde se encuentra la clase Biblioteca

import java.util.ArrayList;// Importa la clase ArrayList para manejar listas  de libros
import java.util.List; // Importa la interfaz List para trabajar con listas de libros

public class Biblioteca { // se define la clase Biblioteca
        private List<Libro> libros; //Lista privada que almacena los libros en la biblioteca

        // Metodo Constructor de la clase biblioteca
        public Biblioteca() {
            this.libros = new ArrayList<>(); //Inicializa la lista de libros como un ArrayList vacío
        }

        //  metodo para agregar un libro
        public void agregarLibro(Libro libro) {
            libros.add(libro); // Agrega el libro recibido como parámetro a la lista de libros
        }

        // metodo para buscar libros por título
        public List<Libro> buscarPorTitulo(String titulo) {
            List<Libro> resultado = new ArrayList<>();// Crea una lista para almacenar los libros que coincidan con el título
            for (Libro libro : libros) {// Recorre la lista de libros
                if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) { // Compara el título ingresado con los títulos de los libros (ignorando mayúsculas/minúsculas)
                    resultado.add(libro); // Si hay coincidencia, se agrega el libro a la lista de resultados
                }
            }
            return resultado;// Muestra la lista de libros que coinciden con el título
        }


        //  Metodo para buscar libros por autor
        public List<Libro> buscarPorAutor(String autor) {
            List<Libro> resultado = new ArrayList<>();// Crea una lista para almacenar los libros que coincidan con el autor
            for (Libro libro : libros) { // Recorre la lista de libros
                if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {// Compara el autor ingresado con los autores de los libros (ignorando mayúsculas/minúsculas)
                    resultado.add(libro);
                }
            }
            return resultado;// Muestra la lista de libros que coinciden con el título
        }

        // Metodo para listar todos los libros
        public void listarLibros() {
            if (libros.isEmpty()) { // Verifica si la lista de libros está vacía
                System.out.println("No hay libros disponibles en este momento.");// muestra ensaje al usuario de si no hay libros
            } else {// Si hay libros en la biblioteca
                for (Libro libro : libros) { // Recorre la lista de libros
                    libro.mostrarInfo(); //muestra la información de cada libro
                }
            }
        }

    }


