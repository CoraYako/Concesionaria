package Concesionaria.Entidades;

public final class Moto extends Vehiculo {

    private String cilindrada;

    public Moto(String cilindrada, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public Moto() {
        
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + " // Cilindrada: " + cilindrada + " // Precio: $" + precio;
    }
    
}
