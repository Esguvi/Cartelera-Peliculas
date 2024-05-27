package cartelerapeliculasgui;

import java.io.*;
import java.util.*;

/**
 * @see <a href="https://github.com/Esguvi/CarteleraPeliculasGUI">GitHub</a> 
 * @author Esguvi - esguvioficial@gmail.com
*/

public class CarteleraMain {
    
    private static final String archivoPeliculas = "PeliculasDeEsguvi.txt";
    
    /*
    Método estático de ArrayList para cargar el archivo de texto.
    */
    private static ArrayList<Pelicula> inicializarArchivo() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        File file = new File(archivoPeliculas);
        
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                Object obj = ois.readObject();
                if (obj instanceof ArrayList) {
                    peliculas = (ArrayList<Pelicula>) obj;
                } else {
                    System.err.println("El archivo no contiene una lista de películas válida.");
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al leer el archivo de películas.");
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo de películas no existe. Se creará uno nuevo.");
        }
        return peliculas;
    }
    
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = inicializarArchivo();
        
            GUICartelera cartelera = new GUICartelera();
            cartelera.setVisible(true);
    }
}