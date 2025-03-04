package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
        private List<Libro> libros;

        // Metodo Constructor
        public Biblioteca() {
            this.libros = new ArrayList<>();
        }

        // Agregar un libro
        public void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        // Buscar libros por título
        public List<Libro> buscarPorTitulo(String titulo) {
            List<Libro> resultado = new ArrayList<>();
            for (Libro libro : libros) {
                if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                    resultado.add(libro);
                }
            }
            return resultado;
        }

        //  Buscar libros por autor
        public List<Libro> buscarPorAutor(String autor) {
            List<Libro> resultado = new ArrayList<>();
            for (Libro libro : libros) {
                if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                    resultado.add(libro);
                }
            }
            return resultado;
        }

        // listar todos los libros
        public void listarLibros() {
            if (libros.isEmpty()) {
                System.out.println("No hay libros disponibles en este momento.");
            } else {
                for (Libro libro : libros) {
                    libro.mostrarInfo();
                }
            }
        }

    }


