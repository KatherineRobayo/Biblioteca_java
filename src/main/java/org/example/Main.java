package org.example; // define el paquete de donde se  encuentra la clase main

import java.util.List; // Importa la interfaz List para trabajar con listas de libros
import java.util.Scanner; // importamos la clase Scanner para recibir la entrada del usuario

public class Main { // se define la clase main
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

                case 2: // Opción 2 buscar libros por titulos
                    System.out.println("Ingrese el titulo que desa buscar");// se pide al usuario ingresar el titulo del libro que desea buscar
                    String tituloBuscar = entrada.nextLine(); // recibe el titulo que ingreso el usuario
                    List <Libro> librosPorTitulo = biblioteca.buscarPorTitulo(tituloBuscar); //Busca  en la lista los libros con ese  título
                    if (librosPorTitulo.isEmpty()) { // Verifica si no se encontraron libros
                        System.out.println("No se encontraron libros con ese titulo"); //muestra un mensaje al usuario confirmando que no hay coincidencias
                    } else { //si se encuentran libros con ese nombre, se muestran
                        for (Libro libro: librosPorTitulo) { //recorre la lista de todos los libros que se encontraron
                            libro.mostrarInfo(); //muestra la información de cada libro
                        }
                    }
                    break; // cierra  la ejecución del caso 2 y vuelve al menú

                case 3: //Opción 3 buscar libros por autor
                    System.out.println("Ingrese el  nombre del autor que desea buscar"); // se pide al usuario ingresar el nombre del autor
                    String autorBuscar = entrada.nextLine();// recibe el nombre que ingreso el usuario
                    List<Libro> librosPorAutor = biblioteca.buscarPorAutor(autorBuscar); // Busca en la lista los libros con ese autor
                    if (librosPorAutor.isEmpty()) { // verifica si  no hay alguna coincidencia
                        System.out.println("No se encontraron libros de ese autor");

                    } else {
                        for (Libro libro: librosPorAutor){
                            libro.mostrarInfo();
                        }
                    }
                    break; //cierra la ejecución del caso 3 y vuelve al menú

                case 4: // opción 4 enlistar libros
                    biblioteca.listarLibros();// crea la lista de los libros agregados en la biblioteca
                    break;

                case 5 : //Opción 5 salir
                    System.out.println("¡Gracias por usar nuestra biblioteca!"); //Muestra al usuario un mensaje de despedida
                    return; //termina la ejecución del programa

                default: //Opción inválida (cuando el usuario ingresa un número diferente entre 1 y 5)
                    System.out.println("Opción invalida, por favor intentelo nuevamente"); //Muestra un mensaje al usuario de error

                    break;// Se rompe la ejecucion del caso default  y vuelve al menú


            }
        }
    }
}