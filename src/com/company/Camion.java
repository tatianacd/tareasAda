package com.company;

import java.time.LocalDate;
import java.util.List;

public class Camion extends Vehiculo implements IVehiculoACombustion {
    private int cantidadDeEjes;
    private TipoDeCamion tipoDeCamion;
    private TipoDeCombustible tipoDeCombustible;
    private TipoDeEnfriamiento tipoDeEnfriamiento;

    public Camion(Sucursal sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, int cantidadDeEjes, TipoDeCamion tipoDeCamion, TipoDeEnfriamiento tipoDeEnfriamiento, TipoDeCombustible tipoDeCombustible) {
        super(sucursal, tipoDeUso, autorizados, propietario, fechaDeRegistro);
        this.tipoDeEnfriamiento = tipoDeEnfriamiento;
        this.tipoDeCombustible = tipoDeCombustible;
        this.cantidadDeEjes = cantidadDeEjes;
        this.tipoDeCamion = tipoDeCamion;
    }

    public Camion() {
        super();
        this.tipoDeEnfriamiento = TipoDeEnfriamiento.POR_ACEITE;
        this.tipoDeCombustible = TipoDeCombustible.Carbon;
        this.cantidadDeEjes = 0;
        this.tipoDeCamion = TipoDeCamion.RIGIDO;
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
