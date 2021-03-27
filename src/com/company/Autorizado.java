package com.company;

import java.util.ArrayList;
import java.util.List;

public class Autorizado extends Persona {

    public Autorizado(String nombre, String direccion, String id) throws DatosIncorrectosException {
        super(nombre, direccion, id);


    }

    public Autorizado() throws DatosIncorrectosException {
        super();
    }

    public String toString() {
       return "Autorizado (" +
                "nombre = " + getNombre() +
                "direccion = " + getDireccion() +
                "id = " + getId() +

                ')';
    }
}
