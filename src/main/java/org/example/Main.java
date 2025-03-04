package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        Biblioteca biblioteca=new Biblioteca();

        while (true) {
            System.out.println("\n--- Menu de la Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por titulo");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Listar todos los libros");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");

            int opcion= entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el titulo del libro");
                    String titulo=entrada.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    String autor=entrada.nextLine();
                    System.out.println("Ingrese el ISBN del libro");
                    String isbn=entrada.nextLine();
                    System.out.println("¿Esta disponible? (True/False): ");
                    boolean disponible=entrada.nextBoolean();
                    entrada.nextLine();

                    Libro nuevoLibro=new Libro(titulo, autor, isbn, disponible);
                    biblioteca.agregarLibro(nuevoLibro);
                    System.out.println("Libro agregado exitosamente");
                    break;

                case 2:
                    //Buscar libros por titulos
                    System.out.println("Ingrese el titulo que desa buscar");
                    String tituloBuscar = entrada.nextLine();
                    List <Libro> librosPorTitulo = biblioteca.buscarPorTitulo(tituloBuscar);
                    if (librosPorTitulo.isEmpty()) {
                        System.out.println("No se encontraron libros con ese titulo");
                    } else {
                        for (Libro libro: librosPorTitulo) {
                            libro.mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el autor que desea buscar");
                    String autorBuscar = entrada.nextLine();
                    List<Libro> librosPorAutor = biblioteca.buscarPorAutor(autorBuscar);
                    if (librosPorAutor.isEmpty()) {
                        System.out.println("No se encontraron libros de ese autor");

                    } else {
                        for (Libro libro: librosPorAutor){
                            libro.mostrarInfo();
                        }
                    }
                    break;

                case 4:
                    biblioteca.listarLibros();
                    break;

                case 5 :
                    System.out.println("¡Gracias por usar nuestra biblioteca!");
                    return;

                default:
                    System.out.println("Opción invalida, por favor intentelo nuevamente");

                    break;


            }
        }
    }
}