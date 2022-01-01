package Concesionaria.Principal;

import Concesionaria.Entidades.Concesionario;
import Concesionaria.Service.ConcesionarioServicio;

public class EjercicioTraineeOnready {

    public static void main(String[] args) {

        ConcesionarioServicio cs = new ConcesionarioServicio();

        Concesionario c = cs.crearConcesionario();
        
        cs.llenarConcesionario(c);
        cs.mostrarListaVehiculos(c);
        System.out.println("=====================================");
        cs.vehiculoMasCaro(c);
        cs.vehiculoMasBarato(c);
        cs.buscarVehiculoPorLetra(c);
        System.out.println("=====================================");
        cs.mostrarVehiculosOrdenadoPrecioDec(c);
        
    }

}
