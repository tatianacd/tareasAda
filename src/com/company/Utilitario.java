package com.company;

import java.time.LocalDate;
import java.util.List;

public class Utilitario extends Vehiculo implements IVehiculoACombustion{
    private String tipoDeCombustible;
    private String tipoDeEnfriamiento;
    private String tipoDeCarga;
    public Utilitario(String sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, String tipoDeCombustible, String tipoDeEnfriamiento, String tipoDeCarga){
        super(sucursal, tipoDeUso, autorizados, propietario, fechaDeRegistro);

        this.tipoDeCombustible = tipoDeCombustible;
        this.tipoDeEnfriamiento = tipoDeEnfriamiento;
        this.tipoDeCarga = tipoDeCarga;

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

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        this.tipoDeCarga = tipoDeCarga;
    }

    @Override
    public String toString() {
        return "Utilitario (" +
                "sucursal = " + getSucursal() +
                "tipo de uso = " + getTipoDeUso() +
                "autorizados = " + getAutorizados() +
                "propietario = " + getPropietario().getNombre() +
                "fecha de registro = " + getFechaDeRegistro() +
                "tipo de combustible = " + getTipoDeCombustible() +
                "tipo de enfriamiento = " + getTipoDeEnfriamiento() +
                "tipo de carga = " + getTipoDeCarga() +

                ')';
    }
}


