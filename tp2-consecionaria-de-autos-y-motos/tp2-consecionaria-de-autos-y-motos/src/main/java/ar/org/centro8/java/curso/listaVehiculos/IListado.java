package ar.org.centro8.java.curso.listaVehiculos;

import java.util.List;

import ar.org.centro8.java.curso.vehiculos.Vehiculo;

public interface IListado {
    List<Vehiculo> listar(); //devuelve toda la lista
    Vehiculo obtenerMasCaro();
    Vehiculo obtenerMasBarato();
    Vehiculo buscarPorModelo(String letra); //busca por letra o palabra dentro del modelo
    void ordenarPorPrecioDescendente();  //ordena de mayor a menor precio
    void ordenarPorOrdenNatural();
    void cargarVehiculos(); //carga los vehículos
}

