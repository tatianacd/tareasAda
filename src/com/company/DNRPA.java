package com.company;

import com.sun.source.tree.UsesTree;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class DNRPA {

    private List<Vehiculo> vehiculos;
    private List<Autorizado>autorizados;

    public DNRPA() {
        vehiculos = new ArrayList<>();
        autorizados = new ArrayList<>();
    }

    public DNRPA(List<Vehiculo> vehiculos) {

        this.vehiculos = vehiculos;
        autorizados = new ArrayList<>();

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

    private void mensajeBienvenida(){
        System.out.println("***********************************************");
        System.out.println("* Bienvenido al Sistema de Registro Automotor *");
        System.out.println("***********************************************");
        
    }

    public void registrarVehiculo(){

        System.out.println("Que desea agregar:");
        System.out.println("1) Auto a combustion");
        System.out.println("2) Auto Electrico");
        System.out.println("3) Camion");
        System.out.println("4) Colectivo");
        System.out.println("5) Moto a Combustion");
        System.out.println("6) Moto electrica");
        System.out.println("6) Utilitario");
        System.out.println("Opcion: ");

        String opcion = scanner.next();
        switch (Integer.parseInt(opcion)){
        case 1:
            AutoACombustion autoACombustion = new AutoACombustion();

            for(int contador1 = 0; contador1 <= Sucursal.values().length - 1; contador1++){
                System.out.println((contador1 +1)+ ") "+Sucursal.values()[contador1]);
            }
            System.out.println("Seleccione la sucursal");
            String opcionSucursal = scanner.next();
            int opcionDefinitivaSuc = Integer.parseInt(opcionSucursal);
            autoACombustion.setSucursal(Sucursal.values()[opcionDefinitivaSuc - 1]);


            for(int contador = 0; contador <= TipoDeUso.values().length - 1; contador++){
                System.out.println((contador +1)+ ") "+TipoDeUso.values()[contador]);
            }
            System.out.println("Seleccione el tipo de uso");
             int opcionTipoDeUso = scanner.nextInt();


            autoACombustion.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso - 1]);
            String opcionAutorizados;
            do{

                Autorizado autorizado = new Autorizado();
                System.out.println("Ingrese el nombre del autorizado:");
                String nombre = scanner.next();
                autorizado.setNombre(nombre);

                System.out.println("Ingrese la direccion del autorizado:");
                String direccion = scanner.next();
                autorizado.setDireccion(direccion);

                System.out.println("Ingrese el id del autorizado:");
                String id = scanner.next();
                autorizado.setId(id);

                autorizados.add(autorizado);
                System.out.println("Desea agregar mas autorizados? s= si n= no");
                opcionAutorizados = scanner.next();
            }while (opcionAutorizados.equals("s"));


            System.out.println("Ingrese el nombre del propietario");
            String nombrePropietario = scanner.next();

            System.out.println("Ingrese el la direccion del propietario");
            String direccionPropietario = scanner.next();

             System.out.println("Ingrese el id del propietario");
             String idPropietario = scanner.next();

            Propietario propietario = new Propietario(nombrePropietario, direccionPropietario, idPropietario);
            autoACombustion.setPropietario(propietario);

            autoACombustion.setFechaDeRegistro(LocalDate.now());
            for(int contador2 = 0; contador2 <= TipoDeCombustible.values().length - 1; contador2++){
                System.out.println((contador2 +1)+ ") "+TipoDeCombustible.values()[contador2]);
            }
            System.out.println("Seleccione el tipo de combustible");
            int opcionTipoDeCombustible = scanner.nextInt();


            autoACombustion.setTipoDeCombustible(TipoDeCombustible.values()[opcionTipoDeCombustible - 1]);

            for(int contador3 = 0; contador3 <= TipoDeEnfriamiento.values().length - 1; contador3++){
                System.out.println((contador3 +1)+ ") "+TipoDeEnfriamiento.values()[contador3]);
            }
            System.out.println("Seleccione el tipo de enfriamiento");
            int opcionTipoDeEnfriamiento = scanner.nextInt();

            autoACombustion.setTipoDeEnfriamiento(TipoDeEnfriamiento.values()[opcionTipoDeEnfriamiento - 1]);

            break;

            case 2:
                AutoElectrico autoElectrico = new AutoElectrico();

                for(int contador1 = 0; contador1 <= Sucursal.values().length - 1; contador1++){
                    System.out.println((contador1 +1)+ ") "+Sucursal.values()[contador1]);
                }
                System.out.println("Seleccione la sucursal");
                String opcionSucursal1 = scanner.next();
                int opcionDefinitivaSuc1 = Integer.parseInt(opcionSucursal1);
                autoElectrico.setSucursal(Sucursal.values()[opcionDefinitivaSuc1 - 1]);


                for(int contador = 0; contador <= TipoDeUso.values().length - 1; contador++){
                    System.out.println((contador +1)+ ") "+TipoDeUso.values()[contador]);
                }
                System.out.println("Seleccione el tipo de uso");
                int opcionTipoDeUso1 = scanner.nextInt();


                autoElectrico.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso1 - 1]);
                String opcionAutorizados1;
                do{

                    Autorizado autorizado = new Autorizado();
                    System.out.println("Ingrese el nombre del autorizado:");
                    String nombre = scanner.next();
                    autorizado.setNombre(nombre);

                    System.out.println("Ingrese la direccion del autorizado:");
                    String direccion = scanner.next();
                    autorizado.setDireccion(direccion);

                    System.out.println("Ingrese el id del autorizado:");
                    String id = scanner.next();
                    autorizado.setId(id);
                    autorizados.add(autorizado);
                    System.out.println(autorizados.toString());
                    System.out.println("Desea agregar mas autorizados? s= si n= no");
                    opcionAutorizados1 = scanner.next();
                }while (opcionAutorizados1.equalsIgnoreCase("s"));


                System.out.println("Ingrese el nombre del propietario");
                String nombrePropietario1 = scanner.next();

                System.out.println("Ingrese el la direccion del propietario");
                String direccionPropietario1 = scanner.next();

                System.out.println("Ingrese el id del propietario");
                String idPropietario1 = scanner.next();

                Propietario propietario1 = new Propietario(nombrePropietario1, direccionPropietario1, idPropietario1);
                autoElectrico.setPropietario(propietario1);

                System.out.println("Digite  el amperage");
                String amperage = scanner.next();


                autoElectrico.setAmperage(amperage);


                System.out.println("Digite la autonomia");
                String autonomia = scanner.next();

                autoElectrico.setAutonomia(autonomia);

                break;

            case 3:
                Camion camion = new Camion();

                for(int contador1 = 0; contador1 <= Sucursal.values().length - 1; contador1++){
                    System.out.println((contador1 +1)+ ") "+Sucursal.values()[contador1]);
                }
                System.out.println("Seleccione la sucursal");
                String opcionSucursal3 = scanner.next();
                int opcionDefinitivaSuc3 = Integer.parseInt(opcionSucursal3);
                camion.setSucursal(Sucursal.values()[opcionDefinitivaSuc3 - 1]);


                for(int contador4 = 0; contador4 <= TipoDeUso.values().length - 1; contador4++){
                    System.out.println((contador4 +1)+ ") "+TipoDeUso.values()[contador4]);
                }
                System.out.println("Seleccione el tipo de uso");
                int opcionTipoDeUso3 = scanner.nextInt();


                camion.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso3 - 1]);
                String opcionAutorizados3;
                do{

                    Autorizado autorizado = new Autorizado();
                    System.out.println("Ingrese el nombre del autorizado:");
                    String nombre = scanner.next();
                    autorizado.setNombre(nombre);

                    System.out.println("Ingrese la direccion del autorizado:");
                    String direccion = scanner.next();
                    autorizado.setDireccion(direccion);

                    System.out.println("Ingrese el id del autorizado:");
                    String id = scanner.next();
                    autorizado.setId(id);

                    autorizados.add(autorizado);
                    System.out.println("Desea agregar mas autorizados? s= si n= no");
                    opcionAutorizados3 = scanner.next();
                }while (opcionAutorizados3.equalsIgnoreCase("s"));


                System.out.println("Ingrese el nombre del propietario");
                String nombrePropietario3 = scanner.next();

                System.out.println("Ingrese el la direccion del propietario");
                String direccionPropietario3 = scanner.next();

                System.out.println("Ingrese el id del propietario");
                String idPropietario3 = scanner.next();

                Propietario propietario3 = new Propietario(nombrePropietario3, direccionPropietario3, idPropietario3);
                camion.setPropietario(propietario3);

                camion.setFechaDeRegistro(LocalDate.now());
                for(int contador6 = 0; contador6 <= TipoDeCombustible.values().length - 1; contador6++){
                    System.out.println((contador6 +1)+ ") "+TipoDeCombustible.values()[contador6]);
                }
                System.out.println("Seleccione el tipo de combustible");
                int opcionTipoDeCombustible3 = scanner.nextInt();


                camion.setTipoDeCombustible(TipoDeCombustible.values()[opcionTipoDeCombustible3 - 1]);

                for(int contador = 0; contador <= TipoDeEnfriamiento.values().length - 1; contador++){
                    System.out.println((contador +1)+ ") "+TipoDeEnfriamiento.values()[contador]);
                }
                System.out.println("Seleccione el tipo de enfriamiento");
                int opcionTipoDeEnfriamiento3 = scanner.nextInt();

                for (int contador = 0; contador <= TipoDeCamion.values().length - 1; contador++) {
                    System.out.println((contador + 1) + ") " + TipoDeCamion.values()[contador]);
                }
                System.out.println("Seleccione el tipo de camion");
                int tipoDeCamion = scanner.nextInt();

                camion.setTipoDeCamion(TipoDeCamion.values()[tipoDeCamion - 1]);


                System.out.println("Digite la cantidad de ejes");
                int cantidadDeEjes = scanner.nextInt();

                camion.setCantidadDeEjes(cantidadDeEjes);

                break;
        }
    }
}
