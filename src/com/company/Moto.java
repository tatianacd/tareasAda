package com.company;

import java.time.LocalDate;
import java.util.List;

public class Moto extends Vehiculo implements IVehiculoACombustion, IMoto{

    private TipoDeCombustible tipodeDeCombustible;
    private TipoDeEnfriamiento tipoDeEnfriamiento;
    private PosicionDelConductor posicionDelConductor;

    public Moto(Sucursal sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, TipoDeCombustible tipoDeCombustible, TipoDeEnfriamiento tipoDeEnfriamiento, PosicionDelConductor posicionDelConductor){
      super(sucursal, tipoDeUso,autorizados, propietario,fechaDeRegistro);
      this.tipoDeEnfriamiento = tipoDeEnfriamiento;
      this.tipodeDeCombustible = tipoDeCombustible;
      this.posicionDelConductor = posicionDelConductor;

    }

    @Override
    public void setTipoDeCombustible(TipoDeCombustible tipoDeCombustible) {
        this.tipodeDeCombustible = tipoDeCombustible;

    }

    @Override
    public TipoDeCombustible getTipoDeCombustible() {
        return tipodeDeCombustible;
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
    public void setPosicionDeConduccion(PosicionDelConductor posicionDeConduccion) {
        this.posicionDelConductor = posicionDeConduccion;
    }

    @Override
    public PosicionDelConductor getPosicionDeConduccion() {
        return posicionDelConductor;
    }

    @Override
    public String toString() {
        return "Motocicleta (" +
                "sucursal = " + getSucursal() +
                "tipo de uso = " + getTipoDeUso() +
                "autorizados = " + getAutorizados() +
                "propietario = " + getPropietario().getNombre() +
                "tipo de combustible = " + getTipoDeCombustible() +
                "fecha de registro = " + getFechaDeRegistro() +
                "posicion del conductor = " + getPosicionDeConduccion() +

                ')';
    }
}
