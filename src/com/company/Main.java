package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
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
