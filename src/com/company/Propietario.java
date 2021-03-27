package com.company;

public class Propietario extends Persona{

    public Propietario() throws DatosIncorrectosException{

    }

    public Propietario(String nombre, String direccion, String id) throws DatosIncorrectosException {
        super(nombre, direccion, id);
    }


    public String toString() {
        return "Propietario (" +
                "nombre = " + getNombre() +
                "direccion = " + getDireccion() +
                "id = " + getId() +

                ')';
    }

}
