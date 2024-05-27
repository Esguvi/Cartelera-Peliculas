package cartelerapeliculasgui;

import java.util.*;

/**
 * @see <a href="https://github.com/Esguvi/CarteleraPeliculasGUI">GitHub</a> 
 * @author Esguvi - esguvioficial@gmail.com
*/

public class ComparaPelisPorDirector implements Comparator<Pelicula> {
    
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        if(!p1.getDirector().equals(p2.getDirector())) {
            return p1.getDirector().compareToIgnoreCase(p2.getDirector());
        } else {
            return p1.getPremios().compareToIgnoreCase(p2.getPremios());
        }
    }
}
