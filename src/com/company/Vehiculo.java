package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//modelo vehiculo
public class Vehiculo {

    private String numeroPatente;
    private String tipoDeUso;
    private String sucursal;
    private String tipoDeVehiculo;
    private List <Persona> autorizados;
    private Persona propietario;
    private LocalDate fechaDeRegistro;

    public Vehiculo(String numeroPatente, String tipoDeUso, String sucursal, String tipoDeVehiculo, List<Persona> autorizados, Persona propietario, LocalDate fechaDeRegistro) {
        this.numeroPatente = numeroPatente;
        this.tipoDeUso = tipoDeUso;
        this.sucursal = sucursal;
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.autorizados = autorizados;
        this.propietario = propietario;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public String getNumeroPatente() {
        return numeroPatente;
    }

    public void setNumeroPatente(String numeroPatente) {
        this.numeroPatente = numeroPatente;
    }

    public String getTipoDeUso() {
        return tipoDeUso;
    }

    public void setTipoDeUso(String tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public List<Persona> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(List<Persona> autorizados) {
        this.autorizados = autorizados;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public LocalDate getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(LocalDate fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }
}
