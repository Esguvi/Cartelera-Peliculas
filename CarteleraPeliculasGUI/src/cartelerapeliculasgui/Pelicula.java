package cartelerapeliculasgui;

import java.io.Serializable;
import java.util.*;

/**
 * @see <a href="https://github.com/Esguvi/CarteleraPeliculasGUI">GitHub</a> 
 * @author Esguvi - esguvioficial@gmail.com
*/

public class Pelicula implements Comparable<Pelicula>, Serializable {
    private String titulo;
    private int añoProduccion;
    private int duracion;
    private String director;
    private String premios;

    public Pelicula(String titulo, int añoProduccion, int duracion, String director, String premios) {
        this.titulo = titulo;
        this.añoProduccion = añoProduccion;
        this.duracion = duracion;
        this.director = director;
        this.premios = premios;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoProduccion() {
        return añoProduccion;
    }

    public void setAñoProduccion(int añoProduccion) {
        this.añoProduccion = añoProduccion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    @Override
    public String toString() {
        return "EsguviPelicula{" + "titulo=" + titulo + ", a\u00f1oProduccion=" + añoProduccion + ", duracion=" + duracion + ", director=" + director + ", premios=" + premios + '}';
    }
    
    
    /**
     * Criterio de comparación por defecto.<br/>
     * Las personas se van a ordenar por defecto lexicográficamente por apellido
     * Y si el apellido coincide, por nombre.
     * <br/> el método compareTo devuelve:
     * <ul>
     * <li>Un negativo si en nuestro orden, this va ANTES que persona</li>
     * <li>Un positivo si en nuestro orden, this va DESPUÉS que persona (o dicho de otra manera, p debería ir ANTES que this)</li>
     * <li>Un 0 si en nuestro orden, no nos importa cuál vaya delante o detrás... consideramos que ambas pueden ocupar la misma posición o son iguales </li>
     * </ul>
     * @param p
    */

    @Override
    public int compareTo(Pelicula p) {
        if (this.añoProduccion - p.añoProduccion == 0) {            
            return this.titulo.compareToIgnoreCase(p.titulo);
        } else { 
            return this.añoProduccion - p.añoProduccion; 
        }
    }
    
    public static void pintaLista(List lista) { 
        for(int i=0;i<lista.size();i++) { 
            System.out.println(lista.get(i)); 
        } 
    } 
}
