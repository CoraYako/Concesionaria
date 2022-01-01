package Concesionaria.Utilidades;

import Concesionaria.Entidades.Vehiculo;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Vehiculo> ordenarPrecioDesc = new Comparator<Vehiculo>() {
        @Override
        public int compare(Vehiculo o1, Vehiculo o2) {
            return o2.getPrecio().compareTo(o1.getPrecio());
        }
    };
    
    public static Comparator<Vehiculo> comparacionPreciosMaxMin = new Comparator<Vehiculo>() {
        @Override
        public int compare(Vehiculo o1, Vehiculo o2) {
            return o1.getPrecio().compareTo(o2.getPrecio());
        }
    };
    
}
