package com.company;

import java.time.LocalDate;
import java.util.List;

public class AutoACombustion extends Vehiculo implements IVehiculoACombustion{
    private TipoDeCombustible tipoDeCombustible;
    private TipoDeEnfriamiento tipoDeEnfriamiento;
    public AutoACombustion(Sucursal sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, TipoDeCombustible tipoDeCombustible, TipoDeEnfriamiento tipoDeEnfriamiento){
        super(sucursal,tipoDeUso, autorizados, propietario, fechaDeRegistro);
        this.tipoDeCombustible = tipoDeCombustible;
        this.tipoDeEnfriamiento = tipoDeEnfriamiento;
    }

    public AutoACombustion() throws DatosIncorrectosException{
        super();
        this.tipoDeEnfriamiento = TipoDeEnfriamiento.POR_ACEITE;
        this.tipoDeCombustible = TipoDeCombustible.Petroleo;
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
