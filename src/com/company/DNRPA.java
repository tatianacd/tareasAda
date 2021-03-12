package com.company;

import java.time.LocalDate;
import java.util.*;

public class DNRPA {

    private List<Vehiculo> vehiculos;

    public DNRPA() {
        vehiculos = new ArrayList<>();
    }

    public DNRPA(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    Scanner scanner = new Scanner(System.in);

    public List<Vehiculo> getRegistros() {
        return this.vehiculos;
    }

    // lista los vehiculos de forma general
    public void listarVehiculos() {
        String autorizados;
        System.out.println("----------------------------------------------------------------------------Listado general de vehiculos-------------------------------------------------------------------");
        for (Vehiculo vehiculo : this.getRegistros()) {

            System.out.println("Numero de patente: " + vehiculo.getNumeroPatente() +
                    "Nnombre de propietario: " + vehiculo.getPropietario().getNombre() + " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Tipo de vehiculo: " + vehiculo.getTipoDeVehiculo() + " Fecha de registro: " + vehiculo.getFechaDeRegistro());

            autorizados = " Autorizados: ";

            for (Persona persona : vehiculo.getAutorizados()) {
                autorizados += persona.getNombre() + ", ";
            }

            System.out.println(autorizados);
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    // devuelve un arreglo de tipo String de los propietarios de camiones
    public ArrayList<String> listarPropietariosCamiones() {
        ArrayList<String> propietariosDeCamiones = new ArrayList<>();

        for (Vehiculo vehiculo : this.getRegistros()) {
            if (vehiculo.getTipoDeVehiculo().equals("camion")) {
                propietariosDeCamiones.add(vehiculo.getPropietario().getNombre());
            }
        }
        return propietariosDeCamiones;
    }

    // ordena por nombre de forma alfabetica los propietarios de camiones
    public void propietariosDeCamionesOrdenados() {
        ArrayList<String> nombres = this.listarPropietariosCamiones();
        Collections.sort(nombres);
        System.out.println("lista de propietarios de camiones ordenados alfabeticamente: ");
        System.out.println("------------------------------------------------------");

        for (String nombre : nombres) {
            System.out.println(nombre);
            System.out.println("-----------------------------------------------------");
        }
    }

    public void siPasoUnAño() {
        System.out.println("Ingrese el numero de patente: ");
        String numeroPatente = scanner.next();
        for (Vehiculo vehiculo : vehiculos) {
            if (numeroPatente.equalsIgnoreCase(vehiculo.getNumeroPatente())) {
                LocalDate fechaNueva = vehiculo.getFechaDeRegistro().plusYears(1);
                if (LocalDate.now().isEqual(fechaNueva) || LocalDate.now().isAfter(fechaNueva)) {
                    System.out.println("Ya paso un año");
                } else {
                    System.out.println("no ha pasado un año");
                }
            }
        }

    }


}
