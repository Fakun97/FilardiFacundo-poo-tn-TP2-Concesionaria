package ar.org.centro8.java.curso.vehiculos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Auto extends Vehiculo {
    
    private int puertas;

    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio); 
        this.puertas = puertas;       
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() +
                " // Puertas: " + puertas +
                " // Precio: $" + String.format("%,.2f", getPrecio());
    }
}