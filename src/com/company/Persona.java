package com.company;

public abstract class Persona {
    private String nombre;
    private String direccion;
    private String id;

    public Persona(String nombre, String direccion, String id) throws DatosIncorrectosException{
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
    }

    public Persona() throws DatosIncorrectosException{
        this.nombre = "";
        this.direccion = "";
        this.id = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {


    }

    public String getId()  {

        return id;
    }

    public void setId(String id) throws DatosIncorrectosException{
        if(String.valueOf(id).length()!=8){
            throw new DatosIncorrectosException("El DNI debe tener 8 dígitos.");
        }else{
            this.id = id;
        }

    }

}
