package Concesionaria.Service;

import Concesionaria.Entidades.Concesionario;
import Concesionaria.Entidades.Vehiculo;
import Concesionaria.Utilidades.Comparadores;
import java.util.Collections;
import java.util.Comparator;

public class ConcesionarioServicio {

    private AutoServicio autoServicio;
    private MotoServicio motoServicio;

    public ConcesionarioServicio() {
        autoServicio = new AutoServicio();
        motoServicio = new MotoServicio();
    }

    public Concesionario crearConcesionario() {
        return new Concesionario();
    }

    public void setServicios(AutoServicio autoServicio, MotoServicio motoServicio) {
        this.autoServicio = autoServicio;
        this.motoServicio = motoServicio;
    }

    public void llenarConcesionario(Concesionario c) {
        c.getListaDeVehiculos().add(autoServicio.crearAuto(4, "Peugeot", "206", 200000));
        c.getListaDeVehiculos().add(motoServicio.crearMoto("125cc", "Honda", "Titan", 60000));
        c.getListaDeVehiculos().add(autoServicio.crearAuto(5, "Peugeot", "208", 250000));
        c.getListaDeVehiculos().add(motoServicio.crearMoto("160cc", "Yamaha", "YBR", 80500.50));
    }

    public void mostrarListaVehiculos(Concesionario c) {
        c.getListaDeVehiculos().forEach(System.out::println);
     
    }
    
    public void buscarVehiculoPorLetra(Concesionario c) {
        c.getListaDeVehiculos().stream().filter((vehiculo) -> (vehiculo.getModelo().contains("Y"))).forEachOrdered((vehiculo) -> {
            System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + vehiculo.getMarca() + ' ' +
                    vehiculo.getModelo() + ' '+ vehiculo.getPrecio());
        });
    }
    
    public void vehiculoMasCaro(Concesionario c) {
        Vehiculo masCaro = Collections.max(c.getListaDeVehiculos(), Comparadores.comparacionPreciosMaxMin);
        
        System.out.println("Vehículo más caro: " + masCaro.getMarca() + ' ' + masCaro.getModelo());
    }
    
    public void vehiculoMasBarato(Concesionario c) {
        Vehiculo masBarato = Collections.min(c.getListaDeVehiculos(), Comparadores.comparacionPreciosMaxMin);

        System.out.println("Vehículo más barato: " + masBarato.getMarca() + ' ' + masBarato.getModelo());
    }

    public void mostrarVehiculosOrdenadoPrecioDec(Concesionario c) {
        Collections.sort(c.getListaDeVehiculos(), Comparadores.ordenarPrecioDesc);
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        c.getListaDeVehiculos().forEach((vehiculo) -> { System.out.println(vehiculo.getMarca() + 
                ' ' + vehiculo.getModelo()); });
    }

}
