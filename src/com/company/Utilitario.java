package com.company;

import java.time.LocalDate;
import java.util.List;

public class Utilitario extends Vehiculo implements IVehiculoACombustion{
    private TipoDeCombustible tipoDeCombustible;
    private TipoDeEnfriamiento tipoDeEnfriamiento;
    private String tipoDeCarga;
    public Utilitario(Sucursal sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, TipoDeCombustible tipoDeCombustible, TipoDeEnfriamiento tipoDeEnfriamiento, String tipoDeCarga){
        super(sucursal, tipoDeUso, autorizados, propietario, fechaDeRegistro);

        this.tipoDeCombustible = tipoDeCombustible;
        this.tipoDeEnfriamiento = tipoDeEnfriamiento;
        this.tipoDeCarga = tipoDeCarga;

    }

    public Utilitario() throws DatosIncorrectosException{
        super();
        this.tipoDeCombustible = TipoDeCombustible.Carbon;
        this.tipoDeEnfriamiento = TipoDeEnfriamiento.POR_ACEITE;
        this.tipoDeCarga = "";

    }

    @Override
    public void setTipoDeCombustible(TipoDeCombustible tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    @Override
    public TipoDeCombustible getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    @Override
    public void setTipoDeEnfriamiento(TipoDeEnfriamiento tipoDeEnfriamiento) {
        this.tipoDeEnfriamiento = tipoDeEnfriamiento;

    }

    @Override
    public TipoDeEnfriamiento getTipoDeEnfriamiento() {
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


