package com.mycompany.bibliotecapoo;

import java.time.LocalDateTime;

public class Libro { // O1
private String titulo;
private String autor;
private String genero;
private int anioPublicacion;
private boolean leido;

public Libro (String titulo, String autor, String genero, int anioPublicacion){ // O1
this.titulo = titulo;
this.autor = autor;
this.anioPublicacion = anioPublicacion;
this.genero = genero;
this.leido = false;
}

public String mostrarInformacion(){ // O1

return ("Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion + ", Género: " + genero);
}

public void marcarLeido (){ // O1

this.leido = true;
if (leido = true){
   System.out.println("El libro ha sido leído:" + leido);
}
}

public boolean esAntiguo(){ //O1
LocalDateTime now = LocalDateTime.now();
int anio = now.getYear();
return (anio - anioPublicacion) >= 50;

}
public String getTitulo(){ //O1
return titulo;

}
public String getAutor(){ //O1
return autor;

}
public String getGenero(){ //O1
return genero;

}

public boolean getLeido(){ //O1
return leido;

}
}

