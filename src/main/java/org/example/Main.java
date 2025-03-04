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
            }
        }
    }
}