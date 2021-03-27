package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DatosIncorrectosException {
        List<Autorizado> autorizados = new ArrayList<>();
        List<Autorizado> autorizados1 = new ArrayList<>();
        List<Vehiculo> vehiculos = new ArrayList<>();

        autorizados.add(new Autorizado("Nick Gonzalez Sequeira", "150 metros sur del cementerio", "603840256"));
        autorizados.add(new Autorizado("Isabel Duran Calderon", "150 metros sur del cementerio", "603840256"));
        autorizados.add(new Autorizado("Marcos Cespedes Espinoza", "150 metros sur del cementerio", "603840256"));

        autorizados1.add(new Autorizado("Agustina", "150 metros sur del cementerio", "603840256"));
        autorizados1.add(new Autorizado("Fernanda", "150 metros sur del cementerio", "603840256"));
        autorizados1.add(new Autorizado("Nick GS", "150 metros sur del cementerio", "603840256"));

        Propietario propietario = new Propietario("Tatiana Cespedes Duran", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Propietario propietario1 = new Propietario("zTatiana C D", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Propietario propietario2 = new Propietario("Marcos Cespedes Espinoza", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Propietario propietario3 = new Propietario("NCK GS", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Propietario propietario4 = new Propietario("Isa DC", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Propietario propietario5 = new Propietario("Mariana Nuñez", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Propietario propietario6 = new Propietario("Felipe Gonzalez", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Propietario propietario7 = new Propietario("Juan Fernandez", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");
        Propietario propietario8 = new Propietario("Maria Ramirez", "150 metros sur del cementerio municipal,Mojon, Esparza, Puntarenas", "114890090");

        //vehiculo.setFechaDeRegistro(LocalDate.now());

        Camion camion = new Camion(Sucursal.Hogwarts, TipoDeUso.PARTICULAR, autorizados, propietario1, LocalDate.now(), 3, TipoDeCamion.ARTICULADO, TipoDeEnfriamiento.POR_ACEITE, TipoDeCombustible.Petroleo);
        Camion camion1 = new Camion(Sucursal.San_Diego, TipoDeUso.PARTICULAR, autorizados, propietario3, LocalDate.of(2021,8,17), 3, TipoDeCamion.ARTICULADO, TipoDeEnfriamiento.POR_ACEITE, TipoDeCombustible.Petroleo);
        Camion camion2 = new Camion(Sucursal.Amazonas, TipoDeUso.PARTICULAR, autorizados, propietario2, LocalDate.now(), 3, TipoDeCamion.ARTICULADO, TipoDeEnfriamiento.POR_ACEITE, TipoDeCombustible.Petroleo);
        Camion camion3 = new Camion(Sucursal.Paradise, TipoDeUso.PARTICULAR, autorizados, propietario7, LocalDate.of(2020,11,21), 3, TipoDeCamion.ARTICULADO, TipoDeEnfriamiento.POR_ACEITE, TipoDeCombustible.Petroleo);
        Camion camion4 = new Camion(Sucursal.Paradise, TipoDeUso.PARTICULAR, autorizados, propietario8, LocalDate.now(), 3, TipoDeCamion.ARTICULADO, TipoDeEnfriamiento.POR_ACEITE, TipoDeCombustible.Petroleo);
        Camion camion5 = new Camion(Sucursal.Paradise, TipoDeUso.PARTICULAR, autorizados, propietario6, LocalDate.of(2021,03,1), 3, TipoDeCamion.ARTICULADO, TipoDeEnfriamiento.POR_ACEITE, TipoDeCombustible.Petroleo);
        Camion camion6 = new Camion(Sucursal.Paradise, TipoDeUso.PARTICULAR, autorizados, propietario5, LocalDate.now(), 3, TipoDeCamion.ARTICULADO, TipoDeEnfriamiento.POR_ACEITE, TipoDeCombustible.Petroleo);

        AutoElectrico autoElectrico = new AutoElectrico(Sucursal.Paradise, TipoDeUso.PROFESIONAL, autorizados1, propietario8, LocalDate.of(2020,12,21), "200v", "300km");
        AutoElectrico autoElectrico1 = new AutoElectrico(Sucursal.Paradise, TipoDeUso.PROFESIONAL, autorizados1, propietario8, LocalDate.now(), "200v", "300km");

        Moto moto = new Moto(Sucursal.Paradise, TipoDeUso.PARTICULAR, autorizados1, propietario7, LocalDate.now(), TipoDeCombustible.Carbon, TipoDeEnfriamiento.POR_ACEITE, PosicionDelConductor.POSICION_ESTANDAR);
       //Moto moto1 = new Moto(Sucursal.Paradise, TipoDeUso.PROFESIONAL, autorizados1, propietario6, LocalDate.of(2021,02,11), TipoDeCombustible.Carbon, TipoDeEnfriamiento.POR_ACEITE);
       // MotoElectrica motoElectrica = new MotoElectrica(Sucursal.Paradise, TipoDeUso.PARTICULAR, autorizados, propietario5, LocalDate.of(2015,9,12), "500 wats", "300km", PosicionDelConductor.POSTURA_DE_CRUCERO);
        MotoElectrica motoElectrica1 = new MotoElectrica(Sucursal.Paradise, TipoDeUso.PROFESIONAL, autorizados, propietario5, LocalDate.now(), "500 wats", "300km", PosicionDelConductor.POSTURA_DE_CRUCERO);

        Colectivo colectivo = new Colectivo(Sucursal.Paradise, TipoDeUso.PROFESIONAL, autorizados, propietario5, LocalDate.of(2021,03,1), TipoDeCombustible.Petroleo, TipoDeEnfriamiento.POR_ACEITE, 22);
        Colectivo colectivo1 = new Colectivo(Sucursal.Paradise, TipoDeUso.PROFESIONAL, autorizados, propietario5, LocalDate.now(), TipoDeCombustible.Petroleo, TipoDeEnfriamiento.POR_ACEITE, 55);

        Utilitario utilitario = new Utilitario(Sucursal.Paradise, TipoDeUso.PROFESIONAL, autorizados1, propietario3, LocalDate.of(2018,03,19), TipoDeCombustible.Petroleo, TipoDeEnfriamiento.POR_ACEITE, "limitada");
        Utilitario utilitario1 = new Utilitario(Sucursal.Paradise, TipoDeUso.PARTICULAR, autorizados, propietario6, LocalDate.now(), TipoDeCombustible.Petroleo, TipoDeEnfriamiento.POR_ACEITE, "liviana");

        vehiculos.add(camion);
        vehiculos.add(camion1);
        vehiculos.add(camion2);
        vehiculos.add(camion3);
        vehiculos.add(camion4);
        vehiculos.add(camion5);
        vehiculos.add(camion6);

        vehiculos.add(autoElectrico);
        vehiculos.add(autoElectrico1);

        vehiculos.add(moto);

        vehiculos.add(motoElectrica1);

        vehiculos.add(colectivo);
        vehiculos.add(colectivo1);

        vehiculos.add(utilitario);
        vehiculos.add(utilitario1);

        DNRPA dnrpa = new DNRPA(vehiculos);

        dnrpa.listadoGeneralVehiculos();
        dnrpa.listarPropietariosCamiones();
        dnrpa.propietariosDeCamionesOrdenados();

        dnrpa.menu();


    }

}
