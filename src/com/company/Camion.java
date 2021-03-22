package com.company;

import java.time.LocalDate;
import java.util.List;

public class Camion extends Vehiculo implements IVehiculoACombustion {
    private int cantidadDeEjes;
    private TipoDeCamion tipoDeCamion;
    private String tipoDeCombustible;
    private String tipoDeEnfriamiento;

    public Camion(String sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, int cantidadDeEjes, TipoDeCamion tipoDeCamion, String tipoDeEnfriamiento,String tipoDeCombustible) {
        super(sucursal, tipoDeUso, autorizados, propietario, fechaDeRegistro);
        this.tipoDeEnfriamiento = tipoDeEnfriamiento;
        this.tipoDeCombustible = tipoDeCombustible;
        this.cantidadDeEjes = cantidadDeEjes;
        this.tipoDeCamion = tipoDeCamion;
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

    public void setCantidadDeEjes(int cantidadDeEjes) {
        this.cantidadDeEjes = cantidadDeEjes;
    }

    public int getCantidadDeEjes() {
        return cantidadDeEjes;
    }

    public TipoDeCamion getTipoDeCamion() {
        return tipoDeCamion;
    }

    public void setTipoDeCamion(TipoDeCamion tipoDeCamion) {
        this.tipoDeCamion = tipoDeCamion;
    }

    @Override
    public String toString() {
        return "Camion (" +
                "sucursal = " + getSucursal() +
                "tipo de uso = " + getTipoDeUso() +
                "autorizados = " + getAutorizados() +
                "propietario = " + getPropietario().getNombre() +
                "fecha de registro = " + getFechaDeRegistro() +
                "tipo de combustible = " + getTipoDeCombustible() +
                "tipo de enfriamiento = " + getTipoDeEnfriamiento() +
                "cantidad de Ejes =" + cantidadDeEjes +
                ", tipo de Camion = " + tipoDeCamion +
                ')';
    }
}
