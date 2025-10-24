package ar.org.centro8.java.curso.vehiculos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Vehiculo implements Comparable<Vehiculo> {
    
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //metodo para comparar vehículos por marca, modelo y precio orden natural
    //creo una variable entera (comparacion) para comparar.
    @Override
    public int compareTo(Vehiculo v) {
        int comparacion = this.marca.compareTo(v.marca);
        if (comparacion == 0) comparacion = this.modelo.compareTo(v.modelo);
        if (comparacion == 0) comparacion = Double.compare(this.precio, v.precio);
        return comparacion;
    }

    //metodo para mostrar la informacion del vehículo formateada en texto
    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo +
                " // Precio: $" + String.format("%,.2f", precio);
    }
}