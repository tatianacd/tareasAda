package com.company;

import java.util.ArrayList;
import java.util.List;

public class DNRPA {

    private List<Vehiculo> vehiculos;

    public DNRPA() {
        vehiculos = new ArrayList<>();
    }

    public DNRPA(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Vehiculo> getRegistros() {
        return this.vehiculos;
    }

    public void listarVehiculos() {
        String autorizados;
        for (Vehiculo vehiculo : this.getRegistros()) {
            System.out.println("Numero de patente: " + vehiculo.getNumeroPatente() +
                    " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Tipo de vehiculo: " + vehiculo.getTipoDeVehiculo());

            autorizados = " Autorizados: ";

            for (Persona persona : vehiculo.getAutorizados()) {
                autorizados += persona.getNombre() + ", ";
            }

            System.out.println(autorizados);
        }
    }


    public static void main(String[] args) {
        // write your code here

        List<Persona> autorizados = new ArrayList<>();
        List<Vehiculo> vehiculos = new ArrayList<>();

        autorizados.add(new Persona("Nick Gonzalez Sequeira", "150 metros sur del cementerio", "603840256"));
        autorizados.add(new Persona("Isabel Duran Calderon", "150 metros sur del cementerio", "603840256"));
        autorizados.add(new Persona("Marcos Cespedes Espinoza", "150 metros sur del cementerio", "603840256"));

        Persona propietario = new Persona("Tatiana Cespedes Duran", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");

        Vehiculo vehiculo = new Vehiculo("patTCD992", "particular", "parrita", "electrico", autorizados, propietario);

        vehiculos.add(vehiculo);

        DNRPA dnrpa = new DNRPA(vehiculos);

        dnrpa.listarVehiculos();


    }
}
