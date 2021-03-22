package com.company;

import java.time.LocalDate;
import java.util.List;

public class Moto extends Vehiculo implements IVehiculoACombustion, IMoto{

    private String tipodeDeCombustible;
    private String tipoDeEnfriamiento;
    private PosicionDelConductor posicionDelConductor;

    public Moto(String sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, String tipoDeCombustible, String tipoDeEnfriamiento, PosicionDelConductor posicionDelConductor){
      super(sucursal, tipoDeUso,autorizados, propietario,fechaDeRegistro);
      this.tipoDeEnfriamiento = tipoDeEnfriamiento;
      this.tipodeDeCombustible = tipoDeCombustible;
      this.posicionDelConductor = posicionDelConductor;

    }

    @Override
    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipodeDeCombustible = tipoDeCombustible;

    }

    @Override
    public String getTipoDeCombustible() {
        return tipodeDeCombustible;
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
