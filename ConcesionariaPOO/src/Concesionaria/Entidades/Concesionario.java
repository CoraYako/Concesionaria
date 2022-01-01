package Concesionaria.Entidades;

import java.util.*;

public final class Concesionario {

    private List<Vehiculo> listaDeVehiculos;

    public Concesionario(List<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public Concesionario() {
        listaDeVehiculos = new ArrayList<>();
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(List<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "listaDeVehiculos=" + listaDeVehiculos + '}';
    }

}
