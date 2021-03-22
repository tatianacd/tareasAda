package com.company;

import java.time.LocalDate;
import java.util.List;

public class AutoACombustion extends Vehiculo implements IVehiculoACombustion{
    private String tipoDeCombustible;
    private String tipoDeEnfriamiento;
    public AutoACombustion(String sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, String tipoDeCombustible,String tipoDeEnfriamiento){
        super(sucursal,tipoDeUso, autorizados, propietario, fechaDeRegistro);
        this.tipoDeCombustible = tipoDeCombustible;
        this.tipoDeEnfriamiento = tipoDeEnfriamiento;
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

    @Override
    public String toString() {
        return "Auto a combustion (" +
                "sucursal = " + getSucursal() +
                "tipo de uso = " + getTipoDeUso() +
                "autorizados = " + getAutorizados() +
                "propietario = " + getPropietario().getNombre() +
                "fecha de registro = " + getFechaDeRegistro() +
                "tipo de combustible = " + getTipoDeCombustible() +
                "tipo de enfriamiento = " + getTipoDeEnfriamiento() +
                ')';

    }
}
