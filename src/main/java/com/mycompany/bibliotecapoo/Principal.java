package com.mycompany.bibliotecapoo;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { //ON
         Scanner lect = new Scanner(System.in);
        Biblioteca llamadaBiblio = new Biblioteca();
        boolean continuar = true;
        while (continuar) {
            System.out.println(" 1) Ingresar Libro.\n 2) Mostrar todos los libros.\n 3) Buscar libro.\n 4) Marcar libro como leído.\n 5) Mostrar libros como no leídos.\n 6) Finalizar programa.");
            String linea = lect.nextLine();
            int valor;
            try {
                valor = Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
                continue;
            }
        
        switch (valor) { //O1
            case 1 :
                System.out.print("Ingrese Titulo: ");
                String titulo = lect.nextLine();
                System.out.print("Ingrese Autor: ");
                String autor = lect.nextLine();
                System.out.print("Ingrese Género: ");
                String genero = lect.nextLine();
                System.out.print("Ingrese Año de Publicación: ");
                int anioPublicacion = lect.nextInt();   
                lect.nextLine();
                LocalDateTime now = LocalDateTime.now();
                int anio = now.getYear();
                if (anioPublicacion > anio){
                    System.out.println("Ingrese un libro que exista");
                }
                Libro llamadaLibro = new Libro(titulo, autor, genero, anioPublicacion);
                llamadaBiblio.registrarLibro(llamadaLibro);
                
                
                break;
            case 2 : 
                
                llamadaBiblio.mostrarLibros();
                
                break;
            case 3 : 
                System.out.print("Ingrese la palabra de búsqueda: ");
                String palabraBusqueda = lect.nextLine();
                System.out.print("Resultados de la búsqueda: ");
                Libro libroEncontrado = llamadaBiblio.buscarLibro(palabraBusqueda);
                if (libroEncontrado != null) {
                 System.out.println("Libro encontrado");
                    System.out.println(libroEncontrado.mostrarInformacion());
                } else {
                    System.out.println("No se encontraron libros que coincidan con la búsqueda.");
            }
                break;
            case 4 :
                System.out.print("Ingrese el título del libro que desea marcar como leído: ");
                    String tituloLibro = lect.nextLine();
                    Libro libroMarcar = llamadaBiblio.buscarLibro(tituloLibro);
                if (libroMarcar != null) {
                    libroMarcar.marcarLeido();
                } else {
                     System.out.println("El libro no se encontró en la biblioteca.");
                }
                
                break;
            case 5 : 
                System.out.println("Libros no leídos:");
                llamadaBiblio.mostrarLibrosNoLeidos();
                
            break;
            case 6:
                
                 System.out.println("Finalizando programa...");
                 continuar = false;
                 
                break;
            default:
        }
    }
}
}
