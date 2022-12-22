package com.portfolio.Luciano.Dto;


import javax.validation.constraints.NotBlank;

public class dtoExperiencie {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;


    //constructor
    public dtoExperiencie() {
    }

    public dtoExperiencie(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;

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
}
