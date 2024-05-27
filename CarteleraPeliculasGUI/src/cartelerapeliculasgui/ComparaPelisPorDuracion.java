package cartelerapeliculasgui;

import java.util.*;

/**
 * @see <a href="https://github.com/Esguvi/CarteleraPeliculasGUI">GitHub</a> 
 * @author Esguvi - esguvioficial@gmail.com
*/

public class ComparaPelisPorDuracion implements Comparator<Pelicula> {
    
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        if (p1.getDuracion() != p2.getDuracion()) {            
            return p1.getDuracion() - p2.getDuracion();
        } else { 
            return p1.getTitulo().compareToIgnoreCase(p2.getTitulo()); 
        }
    }
}
