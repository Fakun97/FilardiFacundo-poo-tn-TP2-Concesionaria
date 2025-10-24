package ar.org.centro8.java.curso.vehiculos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Moto extends Vehiculo {   
    private int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada; 
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() +
                " // Cilindrada: " + cilindrada + "c" +
                " // Precio: $" + String.format("%,.2f", getPrecio());
    }
}
