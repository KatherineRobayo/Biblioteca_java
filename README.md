# Biblioteca_java
GESTIÓN DE UNA BIBLIOTECA 

INTEGRANTES

JHON SEBASTIAN MURCIA ROMERO

ANGIE KATHERINE ROBAYO ANGEL 

DESCRIPCIÓN DEL PROYECTO 
Este programa permite la gestión de una biblioteca, proporcionando funcionalidades como: agregar libros, buscar libros por título y autor, y listar todos los libros disponibles de la biblioteca.Para su desarrollo se utilizaron conceptos de programación orientada a objetos como clases, objetos, encapsulamiento y control de flujo.

FUNCIONALIDADES 

CLASE LIBRO 

CLASE BIBLIOTECA 
Esta clase permite al usuarfio gestionar una colección de libros, proporcionando métodos para agregarlos, buscarlos por título o autor y listarlos. Actúa como un contenedor que organiza los libros y permite interactuar con ellos de manera eficiente.

Pasos del funcionamiento 

1. Se crea la biblioteca, instanciando un objeto de Biblioteca con una lista vacía de libros.

2.  Agrega libros usando agregarLibro()para agregar libros a la biblioteca.

3. Busca libros por título con buscarPorTitulo()revisa la lista y devuelve los libros que coinciden con el título ingresado.

4. Buscar libros por autor con buscarPorAutor()filtra los libros según el autor ingresado.

5.  finalmente lista todos los libros con listarLibros() y muestra la información de los libros disponibles en la biblioteca.
   
CLASE PRINCIPAL 

Permite gestionar la interacción con el usuario mediante un menú de opciones. Su flujo de ejecución se basa en un bucle infinito que permite al usuario realizar diferentes acciones relacionadas con la biblioteca.

Pasos del funcionamiento 

1.  Se crean los objetos Bibliotecay Scanner.
   
2.  Se muestra un menú  interactivo con opciones para agregar, buscar y listar libros.
  
3.  Se  captura  la entrada en donde el usuario elige una opción, y el programa ejecuta la acción correspondiente mediante un switch.
  
4.  Se ejecutan las funcionalidades  dependiendo de la opción elegida, se agregan libros, se buscan por título o autor, o se listan todos los libros disponibles.
  
5. Salida del programa donde el usuario puede salir seleccionando la opción de finalizar, lo que termina la ejecución.

