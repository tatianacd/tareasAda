package com.company;

import java.time.LocalDate;
import java.util.List;

public class MotoElectrica extends Vehiculo implements IVehiculoElectrico, IMoto{
    private String amperage;
    private String autonomia;
    private PosicionDelConductor posicionDelConductor;

    public MotoElectrica(Sucursal sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, String amperage, String autonomia, PosicionDelConductor posicionDelConductor){
        super(sucursal, tipoDeUso, autorizados, propietario, fechaDeRegistro);
        this.amperage = amperage;
        this.autonomia = autonomia;
        this.posicionDelConductor = posicionDelConductor;
    }

    public MotoElectrica() throws DatosIncorrectosException{
        super();
        this.amperage = "";
        this.autonomia = "";
        this.posicionDelConductor = PosicionDelConductor.POSTURA_DE_CRUCERO;

    }

    @Override
    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String getAutonomia() {
        return autonomia;
    }

    @Override
    public void setAmperage(String amperage) {
        this.amperage = amperage;
    }

    @Override
    public String getAmperage() {
        return amperage;
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
        return "Moto electrica (" +
                "sucursal = " + getSucursal() +
                "tipo de uso = " + getTipoDeUso() +
                "autorizados = " + getAutorizados() +
                "propietario = " + getPropietario().getNombre() +
                "fecha de registro = " + getFechaDeRegistro() +
                "amperage = " + getAmperage() +
                "autonomia = " + getAutonomia() +
                "posicion del conductor =" + getPosicionDeConduccion() +
                ')';
    }
}
