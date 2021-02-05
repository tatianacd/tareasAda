package com.company;

import java.util.ArrayList;
import java.util.List;

public class DNRPA {

    private Vehiculo vehiculo;
    private Persona propietario;

    public DNRPA(Vehiculo vehiculo, Persona propietario) {
        this.vehiculo = vehiculo;
        this.propietario = propietario;
    }


    public static void main(String[] args) {
	// write your code here

        List <Persona> autorizados = new ArrayList<>();

        autorizados.add(new Persona("Nick Gonzalez Sequeira", "150 metros sur del cementerio","603840256"));
        autorizados.add(new Persona("Isabel Duran Calderon", "150 metros sur del cementerio","603840256"));
        autorizados.add(new Persona("Marcos Cespedes Espinoza","150 metros sur del cementerio","603840256"));

        Persona propietario = new Persona("Tatiana Cespedes Duran", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Vehiculo vehiculo = new Vehiculo("patTCD992", "particular", "parrita","electrico", autorizados,propietario);

        DNRPA dnrpa = new DNRPA(vehiculo, propietario);

        List <DNRPA> registros = new ArrayList<>();
        registros.add(dnrpa);






    }
}
