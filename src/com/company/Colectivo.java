package com.company;

import java.time.LocalDate;
import java.util.List;

public class Colectivo extends Vehiculo implements IVehiculoACombustion{
    private String tipoDeCombustible;
    private String tipoDeEnfriamiento;
    private int cantidadDePasajeros;
    public Colectivo(String sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, String tipoDeCombustible, String tipoDeEnfriamiento, int cantidadDePasajeros){
        super(sucursal, tipoDeUso,autorizados, propietario, fechaDeRegistro);
        this.tipoDeCombustible = tipoDeCombustible;
        this.tipoDeEnfriamiento = tipoDeEnfriamiento;
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    @Override
    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    @Override
    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    @Override
    public void setTipoDeEnfriamiento(String tipoDeEnfriamiento) {
        this.tipoDeEnfriamiento = tipoDeEnfriamiento;
    }

    @Override
    public String getTipoDeEnfriamiento() {
        return tipoDeEnfriamiento;
    }

    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    @Override
    public String toString() {
        return "Colectivo (" +
                "sucursal = " + getSucursal() +
                "tipo de uso = " + getTipoDeUso() +
                "autorizados = " + getAutorizados() +
                "propietario = " + getPropietario().getNombre() +
                "fecha de registro = " + getFechaDeRegistro() +
                "tipo de combustible = " + getTipoDeCombustible() +
                "tipo de enfriamiento = " + getTipoDeEnfriamiento() +
                "tipo de combustible =" + getTipoDeCombustible() +
                "cantidad de pasajeros =" + getCantidadDePasajeros() +
                ')';
    }
}


