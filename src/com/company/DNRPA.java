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

    public static void main(String[] args) {
        // write your code here
        // metodo main, pruebas
        List<Persona> autorizados = new ArrayList<>();
        List<Persona> autorizados1 = new ArrayList<>();
        List<Vehiculo> vehiculos = new ArrayList<>();

        autorizados.add(new Persona("Nick Gonzalez Sequeira", "150 metros sur del cementerio", "603840256"));
        autorizados.add(new Persona("Isabel Duran Calderon", "150 metros sur del cementerio", "603840256"));
        autorizados.add(new Persona("Marcos Cespedes Espinoza", "150 metros sur del cementerio", "603840256"));

        autorizados1.add(new Persona("Agustina", "150 metros sur del cementerio", "603840256"));
        autorizados1.add(new Persona("Fernanda", "150 metros sur del cementerio", "603840256"));
        autorizados1.add(new Persona("Nick GS", "150 metros sur del cementerio", "603840256"));

        Persona propietario = new Persona("Tatiana Cespedes Duran", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Persona propietario1 = new Persona("zTatiana C D", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Persona propietario2 = new Persona("Marcos Cespedes Espinoza", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Persona propietario3 = new Persona("NCK GS", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Persona propietario4 = new Persona("Isa DC", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");

        Vehiculo vehiculo = new Vehiculo("particular", "parrita", "electrico", autorizados1, propietario, LocalDate.of(2020, 02, 2));
        Vehiculo vehiculo1 = new Vehiculo("particular", "parrita", "camion", autorizados, propietario1, LocalDate.of(2021, 01, 9));
        Vehiculo vehiculo2 = new Vehiculo("particular", "parrita", "camion", autorizados1, propietario2, LocalDate.of(2019, 02, 02));
        Vehiculo vehiculo3 = new Vehiculo("particular", "parrita", "camion", autorizados, propietario3, LocalDate.of(2020, 12, 21));
        Vehiculo vehiculo4 = new Vehiculo("particular", "parrita", "camion", autorizados1, propietario4, LocalDate.now());

        vehiculo.setPropietario(new Persona("dayana", "125 los angeles", "123456789"));
        //vehiculo.setFechaDeRegistro(LocalDate.now());

        vehiculos.add(vehiculo);
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);

        DNRPA dnrpa = new DNRPA(vehiculos);

        dnrpa.listarVehiculos();
        dnrpa.listarPropietariosCamiones();
        dnrpa.propietariosDeCamionesOrdenados();

        for (Vehiculo vehiculo5 : vehiculos) {
            System.out.println(vehiculo5);
        }


        dnrpa.siPasoUnAño();
    }
}
