package Concesionaria.Service;

import Concesionaria.Entidades.Moto;
import java.util.InputMismatchException;

public class MotoServicio {

    public Moto crearMoto(String cilindrada, String marca, String modelo, double precio) {
        Moto moto = new Moto();

        try {
            moto.setCilindrada(cilindrada);
            moto.setMarca(marca);
            moto.setModelo(modelo);
            moto.setPrecio(precio);

            return moto;
        } catch (NullPointerException | InputMismatchException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

}
