package com.mycompany.bibliotecapoo;
import java.util.LinkedList;

public class Biblioteca { //O1
    private LinkedList<Libro> libros = new LinkedList<>();
    
    public Biblioteca() {
    this.libros = new LinkedList<>();
}

public void registrarLibro (Libro libro){ //O1
    libros.add(libro);

}

public Libro buscarLibro (String palabraBusqueda){ //ON
    for(int i = 0; i < libros.size(); i++){   
    Libro libritoV = libros.get(i);
    if(libritoV.getTitulo().equals(palabraBusqueda)||libritoV.getAutor().equals(palabraBusqueda)||libritoV.getGenero().equals(palabraBusqueda)){
    libritoV.mostrarInformacion();
        return libritoV;
}
}
  return null;
}

public void mostrarLibros (){ //ON
    for (Libro libro : libros) 
        System.out.println(libro.mostrarInformacion());  

}

public void mostrarLibrosNoLeidos() { //ON
    for (Libro libro : libros) {
        if (!libro.getLeido()) {
            System.out.println(libro.mostrarInformacion());
        }
    }
}
}