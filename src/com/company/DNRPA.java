package com.company;

import java.time.LocalDate;
import java.time.Period;
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

    // lista los camiones de forma general
    public void listarCamiones() {
        String autorizados;
        System.out.println("----------------------------------------------------------------------------Camiones-------------------------------------------------------------------");
        for (Vehiculo vehiculo : this.getRegistros()) {
            if (vehiculo.getClass().getSimpleName().equals("Camion")) {
                System.out.println("Numero de patente: " + vehiculo.getNumeroPatente() +
                        " Tipo de vehiculo: " + vehiculo.getClass().getSimpleName() + " Nombre de propietario: " + vehiculo.getPropietario().getNombre() + " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Fecha de registro: " + vehiculo.getFechaDeRegistro() + "Cantidad de ejes:" + ((Camion) vehiculo).getCantidadDeEjes() + " Tipo de camion:" + ((Camion) vehiculo).getTipoDeCamion() + " Tipo de enfriamiento: " + ((Camion) vehiculo).getTipoDeEnfriamiento() + " Tipo de combustible: " + ((Camion) vehiculo).getTipoDeCombustible());

                autorizados = " Autorizados: ";

                for (Persona persona : vehiculo.getAutorizados()) {
                    autorizados += persona.getNombre() + ", ";
                }

                System.out.println(autorizados.substring(0, autorizados.length() - 2) + ".");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void listarColectivos() {
        String autorizados;
        System.out.println("----------------------------------------------------------------------------Colectivos-------------------------------------------------------------------");
        for (Vehiculo vehiculo : this.getRegistros()) {
            if (vehiculo.getClass().getSimpleName().equals("Colectivo")) {
                System.out.println("Numero de patente: " + vehiculo.getNumeroPatente() +
                        " Tipo de vehiculo: " + vehiculo.getClass().getSimpleName() + " Nombre de propietario: " + vehiculo.getPropietario().getNombre() + " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Fecha de registro: " + vehiculo.getFechaDeRegistro() + "Cantidad de pasajeros:" + ((Colectivo) vehiculo).getCantidadDePasajeros() + " Tipo de enfriamiento: " + ((Colectivo) vehiculo).getTipoDeEnfriamiento() + " Tipo de combustible: " + ((Colectivo) vehiculo).getTipoDeCombustible());

                autorizados = " Autorizados: ";

                for (Persona persona : vehiculo.getAutorizados()) {
                    autorizados += persona.getNombre() + ", ";
                }

                System.out.println(autorizados.substring(0, autorizados.length() - 2) + ".");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void listarMotos() {
        String autorizados;
        System.out.println("----------------------------------------------------------------------------Motocicletas a Combustion-------------------------------------------------------------------");
        for (Vehiculo vehiculo : this.getRegistros()) {
            if (vehiculo.getClass().getSimpleName().equals("Moto")) {
                System.out.println("Numero de patente: " + vehiculo.getNumeroPatente() +
                        " Tipo de vehiculo: " + vehiculo.getClass().getSimpleName() + " Nombre de propietario: " + vehiculo.getPropietario().getNombre() + " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Fecha de registro: " + vehiculo.getFechaDeRegistro() + " Tipo de enfriamiento: " + ((Moto) vehiculo).getTipoDeEnfriamiento() + " Tipo de combustible: " + ((Moto) vehiculo).getTipoDeCombustible() + " Posicion del conductor: " + ((Moto) vehiculo).getPosicionDeConduccion());

                autorizados = " Autorizados: ";

                for (Persona persona : vehiculo.getAutorizados()) {
                    autorizados += persona.getNombre() + ", ";
                }

                System.out.println(autorizados.substring(0, autorizados.length() - 2) + ".");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void listarMotosElectricas() {
        String autorizados;
        System.out.println("----------------------------------------------------------------------------Motocicletas Electricas-------------------------------------------------------------------");
        for (Vehiculo vehiculo : this.getRegistros()) {
            if (vehiculo.getClass().getSimpleName().equals("MotoElectrica")) {
                System.out.println("Numero de patente: " + vehiculo.getNumeroPatente() +
                        " Tipo de vehiculo: " + "Moto Electrica" + " Nombre de propietario: " + vehiculo.getPropietario().getNombre() + " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Fecha de registro: " + vehiculo.getFechaDeRegistro() + " Amperage: " + ((MotoElectrica) vehiculo).getAmperage() + " Autonomia " + ((MotoElectrica) vehiculo).getAutonomia() + " Posicion del conductor: " + ((MotoElectrica) vehiculo).getPosicionDeConduccion());

                autorizados = " Autorizados: ";

                for (Persona persona : vehiculo.getAutorizados()) {
                    autorizados += persona.getNombre() + ", ";
                }

                System.out.println(autorizados.substring(0, autorizados.length() - 2) + ".");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void listarUtilitarios() {
        String autorizados;
        System.out.println("----------------------------------------------------------------------------Utilitarios-------------------------------------------------------------------");
        for (Vehiculo vehiculo : this.getRegistros()) {
            if (vehiculo.getClass().getSimpleName().equals("Utilitario")) {
                System.out.println("Numero de patente: " + vehiculo.getNumeroPatente() +
                        " Tipo de vehiculo: " + vehiculo.getClass().getSimpleName() + " Nombre de propietario: " + vehiculo.getPropietario().getNombre() + " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Fecha de registro: " + vehiculo.getFechaDeRegistro() + " Tipo de combustible : " + ((Utilitario) vehiculo).getTipoDeCombustible() + " Tipo de enfriamiento: " + ((Utilitario) vehiculo).getTipoDeEnfriamiento() + " Tipo de carga: " + ((Utilitario) vehiculo).getTipoDeCarga());

                autorizados = " Autorizados: ";

                for (Persona persona : vehiculo.getAutorizados()) {
                    autorizados += persona.getNombre() + ", ";
                }

                System.out.println(autorizados.substring(0, autorizados.length() - 2) + ".");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void listarAutosACombustion() {
        String autorizados;
        System.out.println("----------------------------------------------------------------------------Autos a Combustion-------------------------------------------------------------------");
        for (Vehiculo vehiculo : this.getRegistros()) {
            if (vehiculo.getClass().getSimpleName().equals("AutoACombustion")) {
                System.out.println(" Numero de patente: " + vehiculo.getNumeroPatente() +
                        " Tipo de vehiculo: " + vehiculo.getClass().getSimpleName() + " Nombre de propietario: " + vehiculo.getPropietario().getNombre() + " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Fecha de registro: " + vehiculo.getFechaDeRegistro() + " Tipo de combustible : " + ((AutoACombustion) vehiculo).getTipoDeCombustible() + " Tipo de enfriamiento: " + ((AutoACombustion) vehiculo).getTipoDeEnfriamiento());

                autorizados = " Autorizados: ";

                for (Persona persona : vehiculo.getAutorizados()) {
                    autorizados += persona.getNombre() + ", ";
                }

                System.out.println(autorizados.substring(0, autorizados.length() - 2) + ".");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void listarAutosElectricos() {
        String autorizados;
        System.out.println("----------------------------------------------------------------------------Autos Electricos-------------------------------------------------------------------");
        for (Vehiculo vehiculo : this.getRegistros()) {
            if (vehiculo.getClass().getSimpleName().equals("AutoElectrico")) {
                System.out.println("Numero de patente: " + vehiculo.getNumeroPatente() +
                        " Tipo de vehiculo: " + " Auto Electrico " + " Nombre de propietario: " + vehiculo.getPropietario().getNombre() + " Tipo de uso: " + vehiculo.getTipoDeUso() + " Sucursal: " + vehiculo.getSucursal() + " Fecha de registro: " + vehiculo.getFechaDeRegistro() + " Amperage : " + ((AutoElectrico) vehiculo).getAmperage() + " Autonomia " + ((AutoElectrico) vehiculo).getAutonomia());

                autorizados = " Autorizados: ";

                for (Persona persona : vehiculo.getAutorizados()) {
                    autorizados += persona.getNombre() + ", ";
                }

                System.out.println(autorizados.substring(0, autorizados.length() - 2) + ".");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void listadoGeneralVehiculos() {
        System.out.println("----------------------------------------------------------------------------Listado general de vehiculos-------------------------------------------------------------------");
        this.listarCamiones();
        this.listarUtilitarios();
        this.listarMotos();
        this.listarMotosElectricas();
        this.listarAutosACombustion();
        this.listarAutosElectricos();
    }

    // devuelve un arreglo de tipo String de los propietarios de camiones
    public ArrayList<String> listarPropietariosCamiones() {
        ArrayList<String> propietariosDeCamiones = new ArrayList<>();

        for (Vehiculo vehiculo : this.getRegistros()) {
            if (vehiculo.getClass().getSimpleName().equals("Camion")) {
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

    public void siPasoUnAnho() {
        System.out.println("Ingrese el numero de patente: ");
        String numeroPatente = scanner.next();
        for (Vehiculo vehiculo : getRegistros()) {
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

    public void cambiarDePropietario() {
        boolean isPatente = false;
        System.out.println("Digite el numero de patente:");
        String numeroPatente = scanner.next();

        for (Vehiculo vehiculo : getRegistros()) {

            if (vehiculo.getNumeroPatente().equals(numeroPatente)) {
                isPatente = true;

                System.out.println("Digite el nuevo nombre del propietario");
                String nuevoNombre = scanner.next();

                System.out.println("Digite la nueva direccion");
                String nuevaDireccion = scanner.next();

                System.out.println("Digite el nuevo id");
                String nuevoId = scanner.next();



                if (haPasadoUnAnho(vehiculo.getFechaDeRegistro())) {
                    vehiculo.getPropietario().setNombre(nuevoNombre);
                    vehiculo.getPropietario().setDireccion(nuevaDireccion);
                    vehiculo.getPropietario().setId(nuevoId);
                    vehiculo.setFechaDeRegistro(LocalDate.now());
                    System.out.println("se ha cambiado el propietario correctamente.");
                } else {
                    System.out.println("no se puede realizar el cambio porque ho ha pasado un año.");
                }
            }
        }

        if(!isPatente){
            System.out.println("patente no encontrada");
        }

    }

    private boolean haPasadoUnAnho(LocalDate fecha) {
        Period intervalPeriod = Period.between(fecha, LocalDate.now());

        if (intervalPeriod.getYears() > 0) {
            return true;
        }

        return false;


    }
}
