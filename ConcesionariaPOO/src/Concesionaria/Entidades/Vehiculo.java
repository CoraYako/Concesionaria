/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concesionaria.Entidades;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public abstract class Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected Double precio;

    public Vehiculo(String marca, String modelo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Vehiculo() {
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "// Modelo: " + modelo;
    }
    
}
