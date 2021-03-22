package com.company;


import java.time.LocalDate;
import java.util.List;

public class AutoElectrico extends Vehiculo implements  IVehiculoElectrico{
    private String amperage;
    private String autonomia;

    public AutoElectrico(String sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro, String amperage, String autonomia){
       super(sucursal, tipoDeUso, autorizados, propietario, fechaDeRegistro);

        this.amperage = amperage;
        this.autonomia = autonomia;

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
    public String toString() {
        return "Auto electrico (" +
                "sucursal = " + getSucursal() +
                "tipo de uso = " + getTipoDeUso() +
                "autorizados = " + getAutorizados() +
                "propietario = " + getPropietario().getNombre() +
                "fecha de registro = " + getFechaDeRegistro() +
                "autonomia = " + getAutonomia() +
                "amperage = " + getAmperage() +
                ')';
    }
}
