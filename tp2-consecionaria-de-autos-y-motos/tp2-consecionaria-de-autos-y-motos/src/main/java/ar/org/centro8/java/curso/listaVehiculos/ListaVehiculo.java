package ar.org.centro8.java.curso.listaVehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ar.org.centro8.java.curso.vehiculos.Auto;
import ar.org.centro8.java.curso.vehiculos.Moto;
import ar.org.centro8.java.curso.vehiculos.Vehiculo;

public class ListaVehiculo implements IListado {

    //lista que contiene todos los vehículos cargados
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void agregar(Vehiculo v) {
        vehiculos.add(v);
    }

    //devuelve toda la lista de vehículos
    @Override
    public List<Vehiculo> listar() {
        return vehiculos;
    }

    /**
     * Collections.max = en java collections.max es un metodo estático de la clase java.util.Collections.
     * Se usa para encontrar el elemento maximo en una colección.
     */

    @Override
    public Vehiculo obtenerMasCaro() {
        return Collections.max(vehiculos, Comparator.comparingDouble(Vehiculo::getPrecio));
    }

    /**
     * Collections.min = es similar a Collections.max, pero en este caso encuentra y devuelve el
     * elemento mínimo en una colección.
     */

    @Override
    public Vehiculo obtenerMasBarato() {
        return Collections.min(vehiculos, Comparator.comparingDouble(Vehiculo::getPrecio));
    }

    //busca un vehículo cuyo modelo contenga la letra insertada
    @Override
    public Vehiculo buscarPorModelo(String letra) {
        for (Vehiculo v : vehiculos) {
            if (v.getModelo().toUpperCase().contains(letra.toUpperCase())) {
                return v; //se recorre la lista y se devuelve el primer vehículo que cumpla la condición
            }
        }
        // Si no se encuentra ninguno, devuelve null
        return null;
    }

    @Override
    public void ordenarPorPrecioDescendente() {
        vehiculos.sort(Comparator.comparingDouble(Vehiculo::getPrecio).reversed());
    }

    //ordena por orden natural (usa el método compareTo() de la clase Vehiculo)
    @Override
    public void ordenarPorOrdenNatural() {
        Collections.sort(vehiculos);
    }

    //carga los vehículos (no se ingresan por teclado)
    @Override
    public void cargarVehiculos() {
        vehiculos.add(new Auto("Peugeot", "206", 200000, 4));
        vehiculos.add(new Moto("Honda", "Titan", 60000, 125));
        vehiculos.add(new Auto("Peugeot", "208", 250000, 5));
        vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));
    }
}


