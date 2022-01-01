package Concesionaria.Service;

import Concesionaria.Entidades.Auto;
import java.util.InputMismatchException;

public class AutoServicio {

    public Auto crearAuto(Integer puertas, String marca, String modelo, double precio) {
        Auto auto = new Auto();
        
        try {
            auto.setPuertas(puertas);
            auto.setMarca(marca);
            auto.setModelo(modelo);
            auto.setPrecio(precio);
            return auto;
        } catch (NullPointerException | InputMismatchException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
