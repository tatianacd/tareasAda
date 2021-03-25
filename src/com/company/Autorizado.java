package com.company;

import java.util.ArrayList;
import java.util.List;

public class Autorizado extends Persona {

    public Autorizado(String nombre, String direccion, String id) {
        super(nombre, direccion, id);


    }

    public Autorizado(){
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
