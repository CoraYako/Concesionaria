package Concesionaria.Entidades;

public final class Auto extends Vehiculo {

    private Integer puertas;

    public Auto(Integer puertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public Auto() {

    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString() + " // Puertas: " + puertas + " // Precio: $" + precio;
    }

}
