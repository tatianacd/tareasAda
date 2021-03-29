package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class DNRPA {

    private List<Vehiculo> vehiculos;
    private List<Autorizado> autorizados;

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
        boolean isPatente = false;
        System.out.println("Ingrese el numero de patente: ");
        String numeroPatente = scanner.next();
        for (Vehiculo vehiculo : getRegistros()) {
            if (numeroPatente.equalsIgnoreCase(vehiculo.getNumeroPatente())) {
                isPatente = true;
                LocalDate fechaNueva = vehiculo.getFechaDeRegistro().plusYears(1);
                if (LocalDate.now().isEqual(fechaNueva) || LocalDate.now().isAfter(fechaNueva)) {
                    System.out.println("Ya paso un año");
                } else {
                    System.out.println("no ha pasado un año");
                }
            }

        }
        if (!isPatente) {
            System.out.println("patente no encontrada");
        }


    }

    public void cambiarDePropietario() throws DatosIncorrectosException {
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

        if (!isPatente) {
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

    private void mensajeBienvenida() {
        System.out.println("***********************************************");
        System.out.println("* Bienvenido al Sistema de Registro Automotor *");
        System.out.println("***********************************************");

    }

    public void menu() throws DatosIncorrectosException {
        this.mensajeBienvenida();
        int opcion;

        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1) Registrar un vehiculo");
            System.out.println("2) Listar vehiculos.");
            System.out.println("3) Cambiar de propietario");
            System.out.println("4) Listar propietarios en orden alfabetico de camiones");
            System.out.println("5) Ver si paso un año desde que se registro un vehiculo");
            System.out.println("6) salir");
            System.out.println("Opcion:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    this.registrarVehiculo();
                    break;
                case 2:
                    this.listadoGeneralVehiculos();
                    break;
                case 3:
                    this.cambiarDePropietario();
                    break;
                case 4:
                    this.propietariosDeCamionesOrdenados();
                    break;
                case 5:
                    this.siPasoUnAnho();
                    break;
                case 6:
                    break;
            }
        } while (opcion != 6);

        System.exit(0);
    }

    public void registrarVehiculo() throws DatosIncorrectosException {
        int opcion;
        do {
            System.out.println("Que desea agregar:");
            System.out.println("1) Auto a Combustion");
            System.out.println("2) Auto Electrico");
            System.out.println("3) Camion");
            System.out.println("4) Colectivo");
            System.out.println("5) Moto electrica");
            System.out.println("6) Moto a Combustion");
            System.out.println("7) Utilitario");
            System.out.println("8) Salir");
            System.out.println("Opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        this.registrarAutoACombustion();
                    } catch (DatosIncorrectosException e) {
                        System.out.println("No se pudo registrar el auto debido a que el id debe tener 8 caracteres.");
                    }
                    break;
                case 2:
                    try {
                        this.registrarAutoElectrico();
                    } catch (DatosIncorrectosException e) {
                        System.out.println("No se pudo registrar el auto debido a que el id debe tener 8 caracteres.");
                    }
                    break;
                case 3:
                    try {
                        this.registrarCamion();
                    } catch (DatosIncorrectosException e) {
                        System.out.println("No se pudo registrar el camion debido a que el id debe tener 8 caracteres.");
                    }
                    break;
                case 4:
                    try {
                        this.registrarColectivo();
                    } catch (DatosIncorrectosException e) {
                        System.out.println("No se pudo registrar el colectivo debido a que el id debe tener 8 caracteres.");
                    }
                    break;
                case 5:
                    try {
                        this.registrarMotoElectrica();
                    } catch (DatosIncorrectosException e) {
                        System.out.println("No se pudo registrar la moto debido a que el id debe tener 8 caracteres.");
                    }
                    break;
                case 6:
                    try {
                        this.registrarMoto();
                    } catch (DatosIncorrectosException e) {
                        System.out.println("No se pudo registrar la moto debido a que el id debe tener 8 caracteres.");
                    }
                    break;
                case 7:
                    try{
                    this.registrarUtilitario();
                    } catch (DatosIncorrectosException e) {
                        System.out.println("No se pudo registrar el utilitario debido a que el id debe tener 8 caracteres.");
                    }

                    break;
                case 8:
                    break;
            }
        } while (opcion != 8);
    }

    public void registrarAutoACombustion() throws DatosIncorrectosException {
        String opSeguir;

        do {
            AutoACombustion autoACombustion = new AutoACombustion();

            for (int contador1 = 0; contador1 <= Sucursal.values().length - 1; contador1++) {
                System.out.println((contador1 + 1) + ") " + Sucursal.values()[contador1]);
            }

            System.out.println("Seleccione la sucursal");
            int opcionSucursal = scanner.nextInt();
            //int opcionDefinitivaSuc = Integer.parseInt(opcionSucursal);
            autoACombustion.setSucursal(Sucursal.values()[opcionSucursal - 1]);

            for (int contador = 0; contador <= TipoDeUso.values().length - 1; contador++) {
                System.out.println((contador + 1) + ") " + TipoDeUso.values()[contador]);
            }

            System.out.println("Seleccione el tipo de uso");
            int opcionTipoDeUso = scanner.nextInt();

            autoACombustion.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso - 1]);
            String opcionAutorizados;

            do {
                Autorizado autorizado = new Autorizado();
                System.out.println("Ingrese el nombre del autorizado: (si no tiene autorizados, unicamente digite null en cada campo y en el id coloque 00000000 y siga con la aplicacion)");
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

            } while (opcionAutorizados.equals("s"));

            System.out.println("Ingrese el nombre del propietario");
            String nombrePropietario = scanner.next();

            System.out.println("Ingrese el la direccion del propietario");
            String direccionPropietario = scanner.next();

            System.out.println("Ingrese el id del propietario");
            String idPropietario = scanner.next();

            Propietario propietario = new Propietario(nombrePropietario, direccionPropietario, idPropietario);
            autoACombustion.setPropietario(propietario);

            autoACombustion.setFechaDeRegistro(LocalDate.now());
            for (int contador2 = 0; contador2 <= TipoDeCombustible.values().length - 1; contador2++) {
                System.out.println((contador2 + 1) + ") " + TipoDeCombustible.values()[contador2]);
            }

            System.out.println("Seleccione el tipo de combustible");
            int opcionTipoDeCombustible = scanner.nextInt();

            autoACombustion.setTipoDeCombustible(TipoDeCombustible.values()[opcionTipoDeCombustible - 1]);

            for (int contador3 = 0; contador3 <= TipoDeEnfriamiento.values().length - 1; contador3++) {
                System.out.println((contador3 + 1) + ") " + TipoDeEnfriamiento.values()[contador3]);
            }

            System.out.println("Seleccione el tipo de enfriamiento");
            int opcionTipoDeEnfriamiento = scanner.nextInt();

            autoACombustion.setTipoDeEnfriamiento(TipoDeEnfriamiento.values()[opcionTipoDeEnfriamiento - 1]);

            System.out.println("Desea agregar otro auto a combustion? s = si n = no");
            opSeguir = scanner.next();

        } while (opSeguir.equals("s"));
    }

    public void registrarAutoElectrico() throws DatosIncorrectosException {
        String opSeguir;

        do {
            AutoElectrico autoElectrico = new AutoElectrico();

            for (int contador1 = 0; contador1 <= Sucursal.values().length - 1; contador1++) {
                System.out.println((contador1 + 1) + ") " + Sucursal.values()[contador1]);
            }
            System.out.println("Seleccione la sucursal");
            String opcionSucursal1 = scanner.next();
            int opcionDefinitivaSuc1 = Integer.parseInt(opcionSucursal1);
            autoElectrico.setSucursal(Sucursal.values()[opcionDefinitivaSuc1 - 1]);


            for (int contador = 0; contador <= TipoDeUso.values().length - 1; contador++) {
                System.out.println((contador + 1) + ") " + TipoDeUso.values()[contador]);
            }
            System.out.println("Seleccione el tipo de uso");
            int opcionTipoDeUso1 = scanner.nextInt();


            autoElectrico.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso1 - 1]);
            String opcionAutorizados1;
            do {

                Autorizado autorizado = new Autorizado();
                System.out.println("Ingrese el nombre del autorizado:(si no tiene autorizados, unicamente digite null en cada campo y en el id coloque 00000000 y siga con la aplicacion)");
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
            } while (opcionAutorizados1.equalsIgnoreCase("s"));


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

            System.out.println("Desea agregar otro auto electrico? s = si n = no");
            opSeguir = scanner.next();

            System.out.println(opSeguir.equals("s"));

        } while (opSeguir.equals("s"));

    }

    public void registrarCamion() throws DatosIncorrectosException {
        String opSeguir;

        do {
        Camion camion = new Camion();

        for (int contador1 = 0; contador1 <= Sucursal.values().length - 1; contador1++) {
            System.out.println((contador1 + 1) + ") " + Sucursal.values()[contador1]);
        }
        System.out.println("Seleccione la sucursal");
        String opcionSucursal3 = scanner.next();
        int opcionDefinitivaSuc3 = Integer.parseInt(opcionSucursal3);
        camion.setSucursal(Sucursal.values()[opcionDefinitivaSuc3 - 1]);


        for (int contador4 = 0; contador4 <= TipoDeUso.values().length - 1; contador4++) {
            System.out.println((contador4 + 1) + ") " + TipoDeUso.values()[contador4]);
        }
        System.out.println("Seleccione el tipo de uso");
        int opcionTipoDeUso3 = scanner.nextInt();


        camion.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso3 - 1]);
        String opcionAutorizados3;
        do {

            Autorizado autorizado = new Autorizado();
            System.out.println("Ingrese el nombre del autorizado:(si no tiene autorizados, unicemente digite null en cada campo y en el id coloque 00000000 siga con la aplicacion)");
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
        } while (opcionAutorizados3.equalsIgnoreCase("s"));


        System.out.println("Ingrese el nombre del propietario");
        String nombrePropietario3 = scanner.next();

        System.out.println("Ingrese el la direccion del propietario");
        String direccionPropietario3 = scanner.next();

        System.out.println("Ingrese el id del propietario");
        String idPropietario3 = scanner.next();

        Propietario propietario3 = new Propietario(nombrePropietario3, direccionPropietario3, idPropietario3);
        camion.setPropietario(propietario3);

        camion.setFechaDeRegistro(LocalDate.now());
        for (int contador6 = 0; contador6 <= TipoDeCombustible.values().length - 1; contador6++) {
            System.out.println((contador6 + 1) + ") " + TipoDeCombustible.values()[contador6]);
        }
        System.out.println("Seleccione el tipo de combustible");
        int opcionTipoDeCombustible3 = scanner.nextInt();


        camion.setTipoDeCombustible(TipoDeCombustible.values()[opcionTipoDeCombustible3 - 1]);

        for (int contador = 0; contador <= TipoDeEnfriamiento.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + TipoDeEnfriamiento.values()[contador]);
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
            System.out.println("Desea agregar otro camion? s = si n = no");
            opSeguir = scanner.next();

        } while (opSeguir.equals("s"));

    }

    public void registrarColectivo() throws DatosIncorrectosException {
        String opSeguir;

        do {
        Colectivo colectivo = new Colectivo();

        for (int contador = 0; contador <= Sucursal.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + Sucursal.values()[contador]);
        }
        System.out.println("Seleccione la sucursal");
        String opcionSucursal4 = scanner.next();
        int opcionDefinitivaSuc4 = Integer.parseInt(opcionSucursal4);
        colectivo.setSucursal(Sucursal.values()[opcionDefinitivaSuc4
                - 1]);


        for (int contador4 = 0; contador4 <= TipoDeUso.values().length - 1; contador4++) {
            System.out.println((contador4 + 1) + ") " + TipoDeUso.values()[contador4]);
        }
        System.out.println("Seleccione el tipo de uso");
        int opcionTipoDeUso4 = scanner.nextInt();


        colectivo.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso4 - 1]);
        String opcionAutorizados4;
        do {

            Autorizado autorizado = new Autorizado();
            System.out.println("Ingrese el nombre del autorizado:(si no tiene autorizados, unicamente digite null en cada  campo y en el id coloque 00000000 y siga con la aplicacion)");
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
            opcionAutorizados4 = scanner.next();
        } while (opcionAutorizados4.equalsIgnoreCase("s"));


        System.out.println("Ingrese el nombre del propietario");
        String nombrePropietario4 = scanner.next();

        System.out.println("Ingrese el la direccion del propietario");
        String direccionPropietario4 = scanner.next();

        System.out.println("Ingrese el id del propietario");
        String idPropietario4 = scanner.next();

        Propietario propietario4 = new Propietario(nombrePropietario4, direccionPropietario4, idPropietario4);
        colectivo.setPropietario(propietario4);

        colectivo.setFechaDeRegistro(LocalDate.now());
        for (int contador = 0; contador <= TipoDeCombustible.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + TipoDeCombustible.values()[contador]);
        }
        System.out.println("Seleccione el tipo de combustible");
        int opcionTipoDeCombustible4 = scanner.nextInt();


        colectivo.setTipoDeCombustible(TipoDeCombustible.values()[opcionTipoDeCombustible4 - 1]);

        for (int contador = 0; contador <= TipoDeEnfriamiento.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + TipoDeEnfriamiento.values()[contador]);
        }
        System.out.println("Seleccione el tipo de enfriamiento");
        int opcionTipoDeEnfriamiento4 = scanner.nextInt();

        colectivo.setTipoDeEnfriamiento(TipoDeEnfriamiento.values()[opcionTipoDeEnfriamiento4 - 1]);

        System.out.println("Digite la cantidad de pasajeros");
        int cantidadDePasajeros = scanner.nextInt();

        colectivo.setCantidadDePasajeros(cantidadDePasajeros);
            System.out.println("Desea agregar otro colectivo? s = si n = no");
            opSeguir = scanner.next();

            System.out.println(opSeguir.equals("s"));

        } while (opSeguir.equals("s"));

    }

    public void registrarMotoElectrica() throws DatosIncorrectosException {
        String opSeguir;

        do {
        MotoElectrica motoElectrica = new MotoElectrica();

        for (int contador = 0; contador <= Sucursal.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + Sucursal.values()[contador]);
        }
        System.out.println("Seleccione la sucursal");
        String opcionSucursal5 = scanner.next();
        int opcionDefinitivaSuc5 = Integer.parseInt(opcionSucursal5);
        motoElectrica.setSucursal(Sucursal.values()[opcionDefinitivaSuc5 - 1]);


        for (int contador = 0; contador <= TipoDeUso.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + TipoDeUso.values()[contador]);
        }
        System.out.println("Seleccione el tipo de uso");
        int opcionTipoDeUso5 = scanner.nextInt();


        motoElectrica.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso5 - 1]);
        String opcionAutorizados5;
        do {

            Autorizado autorizado = new Autorizado();
            System.out.println("Ingrese el nombre del autorizado:(si no tiene autorizados, unicamente digite null en cada campo y en el id coloque 00000000 y siga con la aplicacion)");
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
            opcionAutorizados5 = scanner.next();
        } while (opcionAutorizados5.equalsIgnoreCase("s"));


        System.out.println("Ingrese el nombre del propietario");
        String nombrePropietario5 = scanner.next();

        System.out.println("Ingrese el la direccion del propietario");
        String direccionPropietario5 = scanner.next();

        System.out.println("Ingrese el id del propietario");
        String idPropietario5 = scanner.next();

        Propietario propietario5 = new Propietario(nombrePropietario5, direccionPropietario5, idPropietario5);
        motoElectrica.setPropietario(propietario5);

        motoElectrica.setFechaDeRegistro(LocalDate.now());
        for (int contador = 0; contador <= PosicionDelConductor.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + PosicionDelConductor.values()[contador]);
        }
        System.out.println("Seleccione la posicion del conductor");
        int opcionPosicionDelConductor = scanner.nextInt();


        motoElectrica.setPosicionDeConduccion(PosicionDelConductor.values()[opcionPosicionDelConductor - 1]);

        System.out.println("Digite  el amperage");
        String amperage1 = scanner.next();


        motoElectrica.setAmperage(amperage1);


        System.out.println("Digite la autonomia");
        String autonomia1 = scanner.next();

        motoElectrica.setAutonomia(autonomia1);
            System.out.println("Desea agregar otra moto? s = si n = no");
            opSeguir = scanner.next();

            System.out.println(opSeguir.equals("s"));

        } while (opSeguir.equals("s"));
    }

    public void registrarMoto() throws DatosIncorrectosException {
        String opSeguir;

        do {
        Moto moto = new Moto();

        for (int contador = 0; contador <= Sucursal.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + Sucursal.values()[contador]);
        }
        System.out.println("Seleccione la sucursal");
        String opcionSucursal6 = scanner.next();
        int opcionDefinitivaSuc6 = Integer.parseInt(opcionSucursal6);
        moto.setSucursal(Sucursal.values()[opcionDefinitivaSuc6 - 1]);


        for (int contador = 0; contador <= TipoDeUso.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + TipoDeUso.values()[contador]);
        }
        System.out.println("Seleccione el tipo de uso");
        int opcionTipoDeUso6 = scanner.nextInt();


        moto.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso6 - 1]);
        String opcionAutorizados6;
        do {

            Autorizado autorizado = new Autorizado();
            System.out.println("Ingrese el nombre del autorizado:(si no tiene autorizados, unicamente digite null en cada campo y en el id coloque 00000000 y siga con la aplicacion)");
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
            opcionAutorizados6 = scanner.next();
        } while (opcionAutorizados6.equalsIgnoreCase("s"));


        System.out.println("Ingrese el nombre del propietario");
        String nombrePropietario6 = scanner.next();

        System.out.println("Ingrese el la direccion del propietario");
        String direccionPropietario6 = scanner.next();

        System.out.println("Ingrese el id del propietario");
        String idPropietario6 = scanner.next();

        Propietario propietario6 = new Propietario(nombrePropietario6, direccionPropietario6, idPropietario6);
        moto.setPropietario(propietario6);

        moto.setFechaDeRegistro(LocalDate.now());
        for (int contador = 0; contador <= PosicionDelConductor.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + PosicionDelConductor.values()[contador]);
        }
        System.out.println("Seleccione la posicion del conductor");
        int opcionPosicionDelConductor1 = scanner.nextInt();


        moto.setPosicionDeConduccion(PosicionDelConductor.values()[opcionPosicionDelConductor1 - 1]);

        for (int contador = 0; contador <= TipoDeCombustible.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + TipoDeCombustible.values()[contador]);
        }
        System.out.println("Seleccione el tipo de combustible");
        int opcionTipoDeCombustible6 = scanner.nextInt();


        moto.setTipoDeCombustible(TipoDeCombustible.values()[opcionTipoDeCombustible6 - 1]);

        for (int contador = 0; contador <= TipoDeEnfriamiento.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + TipoDeEnfriamiento.values()[contador]);
        }
        System.out.println("Seleccione el tipo de enfriamiento");
        int opcionTipoDeEnfriamiento6 = scanner.nextInt();

        moto.setTipoDeEnfriamiento(TipoDeEnfriamiento.values()[opcionTipoDeEnfriamiento6 - 1]);
            System.out.println("Desea agregar otra moto? s = si n = no");
            opSeguir = scanner.next();

        } while (opSeguir.equals("s"));

    }

    public void registrarUtilitario() throws DatosIncorrectosException {
        String opSeguir;

        do {
        Utilitario utilitario = new Utilitario();

        for (int contador = 0; contador <= Sucursal.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + Sucursal.values()[contador]);
        }
        System.out.println("Seleccione la sucursal");
        String opcionSucursal7 = scanner.next();
        int opcionDefinitivaSuc7 = Integer.parseInt(opcionSucursal7);
        utilitario.setSucursal(Sucursal.values()[opcionDefinitivaSuc7 - 1]);


        for (int contador = 0; contador <= TipoDeUso.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + TipoDeUso.values()[contador]);
        }
        System.out.println("Seleccione el tipo de uso");
        int opcionTipoDeUso7 = scanner.nextInt();


        utilitario.setTipoDeUso(TipoDeUso.values()[opcionTipoDeUso7 - 1]);
        String opcionAutorizados7;
        do {

            Autorizado autorizado = new Autorizado();
            System.out.println("Ingrese el nombre del autorizado:(si no tiene autorizados, unicamente digite null en cada campo y en el id coloque 00000000 y siga con la aplicacion)");
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
            opcionAutorizados7 = scanner.next();
        } while (opcionAutorizados7.equals("s"));


        System.out.println("Ingrese el nombre del propietario");
        String nombrePropietario7 = scanner.next();

        System.out.println("Ingrese el la direccion del propietario");
        String direccionPropietario7 = scanner.next();

        System.out.println("Ingrese el id del propietario");
        String idPropietario7 = scanner.next();

        Propietario propietario7 = new Propietario(nombrePropietario7, direccionPropietario7, idPropietario7);
        utilitario.setPropietario(propietario7);

        utilitario.setFechaDeRegistro(LocalDate.now());
        for (int contador = 0; contador <= TipoDeCombustible.values().length - 1; contador++) {
            System.out.println((contador + 1) + ") " + TipoDeCombustible.values()[contador]);
        }
        System.out.println("Seleccione el tipo de combustible");
        int opcionTipoDeCombustible7 = scanner.nextInt();


        utilitario.setTipoDeCombustible(TipoDeCombustible.values()[opcionTipoDeCombustible7 - 1]);

        for (int contador3 = 0; contador3 <= TipoDeEnfriamiento.values().length - 1; contador3++) {
            System.out.println((contador3 + 1) + ") " + TipoDeEnfriamiento.values()[contador3]);
        }
        System.out.println("Seleccione el tipo de enfriamiento");
        int opcionTipoDeEnfriamiento7 = scanner.nextInt();

        utilitario.setTipoDeEnfriamiento(TipoDeEnfriamiento.values()[opcionTipoDeEnfriamiento7 - 1]);
            System.out.println("Desea agregar otro utilitario? s = si n = no");
            opSeguir = scanner.next();
            System.out.println("Digite el tipo de carga");
            String tipoDeCarga = scanner.next();
            utilitario.setTipoDeCarga(tipoDeCarga);

        } while (opSeguir.equals("s"));
    }
}
