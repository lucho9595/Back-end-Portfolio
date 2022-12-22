package com.portfolio.Luciano.Dto;

import java.util.Date;
import javax.validation.constraints.NotBlank;

public class dtoEducation {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private Date fechaDuracion;

    //constructor
    public dtoEducation() {
    }

    public dtoEducation(String nombreE, String descripcionE, Date fechaDuracion) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaDuracion = fechaDuracion;
    }

    //Getters and Setters
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public Date getFechaDuracion() {
        return fechaDuracion;
    }

    public void setFechaDuracion(Date fechaDuracion) {
        this.fechaDuracion = fechaDuracion;
    }

}
