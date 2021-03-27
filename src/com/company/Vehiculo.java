package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Vehiculo {

    private String numeroPatente;
    private Sucursal sucursal;
    private TipoDeUso tipoDeUso;
    private List<Autorizado> autorizados;
    private Propietario propietario;
    private LocalDate fechaDeRegistro;

    public Vehiculo(Sucursal sucursal, TipoDeUso tipoDeUso, List<Autorizado> autorizados, Propietario propietario, LocalDate fechaDeRegistro) {
        this.numeroPatente = generarPlaca();
        this.tipoDeUso = tipoDeUso;
        this.sucursal = sucursal;
        this.autorizados = autorizados;
        this.propietario = propietario;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public Vehiculo() throws DatosIncorrectosException {

        this.numeroPatente = generarPlaca();
        this.tipoDeUso = this.tipoDeUso.PROFESIONAL;
        this.sucursal = this.sucursal.Hogwarts;
        this.autorizados = new ArrayList<>();
        this.propietario = new Propietario();
        this.fechaDeRegistro = LocalDate.now();


    }

    public String getNumeroPatente() {
        return numeroPatente;
    }

    public void setNumeroPatente(String numeroPatente) {
        this.numeroPatente = numeroPatente;
    }

    public void setTipoDeUso(TipoDeUso tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }

    public TipoDeUso getTipoDeUso() {
        return tipoDeUso;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<Autorizado> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(List<Autorizado> autorizados) {
        this.autorizados = autorizados;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public LocalDate getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(LocalDate fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    private String generarPlaca() {
        Random aleatorio = new Random(System.nanoTime());
        int enteroRandom = 1 + aleatorio.nextInt(1000000000);
        String placa = String.valueOf(enteroRandom);
        return "TCD" + placa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numeroPatente='" + numeroPatente + '\'' +
                ", tipoDeUso='" + tipoDeUso + '\'' +
                ", sucursal='" + sucursal + '\'' +
                ", autorizados=" + autorizados +
                ", propietario=" + propietario +
                ", fechaDeRegistro=" + fechaDeRegistro +
                '}';
    }
}
