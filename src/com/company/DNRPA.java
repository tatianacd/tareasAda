package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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
//lista los vehiculos de forma general
    public void listarVehiculos() {
        String autorizados;
        System.out.println("-------------------------------------------------------Listado general de vehiculos-----------------------------------------------");
        for (Vehiculo vehiculo : this.getRegistros()) {

            System.out.println("Numero de patente: " + vehiculo.getNumeroPatente() +
                  "Nnombre de propietario: " + vehiculo.getPropietario().getNombre() + " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Tipo de vehiculo: " + vehiculo.getTipoDeVehiculo() + " Fecha de registro: " + vehiculo.getFechaDeRegistro());

            autorizados = " Autorizados: ";

            for (Persona persona : vehiculo.getAutorizados()) {
                autorizados += persona.getNombre() + ", ";
            }

            System.out.println(autorizados);
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        }
    }
//devuelve un arreglo de tipo String dde los propietarios de camiones
    public ArrayList<String> listarPropietariosCamiones(){
        ArrayList<String> propietariosDeCamiones = new ArrayList<>();

        for(Vehiculo vehiculo : this.getRegistros()) {
           if(vehiculo.getTipoDeVehiculo().equals("camion")){
               propietariosDeCamiones.add(vehiculo.getPropietario().getNombre());
           }
        }
        return propietariosDeCamiones;
    }
//ordena por nombre de forma alfabetica los propietarios de camiones
    public void propietariosDeCamionesOrdenados(){
        ArrayList<String> nombres = this.listarPropietariosCamiones();
        Collections.sort(nombres);
        System.out.println("lista de propietarios de camiones ordenados: ");
        System.out.println("------------------------------------------------------");
        for(int contador = 0; contador < nombres.size(); contador++){

            System.out.println( nombres.get(contador));
            System.out.println("-----------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        // write your code here
        //metodo main, pruebas
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

        Vehiculo vehiculo = new Vehiculo("patTCD992", "particular", "parrita", "electrico", autorizados1, propietario, LocalDate.now());
        Vehiculo vehiculo1 = new Vehiculo("patTCD999", "particular", "parrita", "camion", autorizados, propietario1, LocalDate.now());
        Vehiculo vehiculo2 = new Vehiculo("patTCD990", "particular", "parrita", "camion", autorizados1, propietario2, LocalDate.now());
        Vehiculo vehiculo3 = new Vehiculo("patTCD993", "particular", "parrita", "camion", autorizados, propietario3, LocalDate.now());
        Vehiculo vehiculo4 = new Vehiculo("patTCD997", "particular", "parrita", "camion", autorizados1, propietario4, LocalDate.now());
        vehiculo.setPropietario(new Persona("dayana", "125 los angeles", "123456789"));
        vehiculos.add(vehiculo);
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);

        DNRPA dnrpa = new DNRPA(vehiculos);

        dnrpa.listarVehiculos();
        dnrpa.listarPropietariosCamiones();
        dnrpa.propietariosDeCamionesOrdenados();



    }
}
