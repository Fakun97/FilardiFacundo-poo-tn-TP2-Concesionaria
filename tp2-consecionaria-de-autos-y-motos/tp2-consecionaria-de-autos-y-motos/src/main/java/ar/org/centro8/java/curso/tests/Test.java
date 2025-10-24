package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.listaVehiculos.ListaVehiculo;
import ar.org.centro8.java.curso.vehiculos.Vehiculo;

public class Test {
    public static void main(String[] args) {
        ListaVehiculo lista = new ListaVehiculo();
        lista.cargarVehiculos();

        //se muestra cada vehículo con su formato correspondiente
        //el metodo listar() recorrer los elementos de una lista existente
        for (Vehiculo v : lista.listar()) {
            System.out.println(v);
        }

        System.out.println("=============================");

        //se muestra el vehículo mas caro y el mas barato
        System.out.println("Vehículo más caro: " + lista.obtenerMasCaro().getMarca() + " " + lista.obtenerMasCaro().getModelo());
        System.out.println("Vehículo más barato: " + lista.obtenerMasBarato().getMarca() + " " + lista.obtenerMasBarato().getModelo());

        //se busca el primer vehículo el cual modelo contenga la letra 'Y'
        Vehiculo contieneY = lista.buscarPorModelo("Y");
        if (contieneY != null) {
            System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "
                    + contieneY.getMarca() + " " + contieneY.getModelo() + " $" + String.format("%,.2f", contieneY.getPrecio()));
        }

        System.out.println("=============================");

        //se ordenan los vehículos de mayor a menor precio
        lista.ordenarPorPrecioDescendente();
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (Vehiculo v : lista.listar()) {
            System.out.println(v.getMarca() + " " + v.getModelo());
        }

        System.out.println("=============================");

        //se ordenan los vehículos por orden natural (marca, modelo, precio)
        lista.ordenarPorOrdenNatural();
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
        for (Vehiculo v : lista.listar()) {
            System.out.println(v);
        }
    }
}