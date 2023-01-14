package com.portfolio.Luciano.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducation {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String tituloE;
    @NotBlank
    private String descripcionE;

    //constructor
    public dtoEducation() {
    }

    public dtoEducation(String nombreE, String descripcionE, String tituloE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.tituloE = tituloE;
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

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }

}
