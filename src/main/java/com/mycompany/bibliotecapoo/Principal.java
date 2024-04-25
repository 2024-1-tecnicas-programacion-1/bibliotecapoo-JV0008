package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println(" 1) Ingresar Libro.\n 2) Mostrar todos los libros.\n 3) Buscar libro.\n 4) Marcar libro como leído.\n 5) Mostrar libros como no leídos.");
        int valor = Integer.parseInt(lect.nextLine());
              
        switch (valor) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;    
            default:
                throw new AssertionError();
        }
    }
}
