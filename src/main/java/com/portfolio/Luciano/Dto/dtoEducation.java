package com.portfolio.Luciano.Dto;

import java.util.Date;
import javax.validation.constraints.NotBlank;

public class dtoEducation {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String tituloE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private Date inicioE;
    @NotBlank
    private Date finE;

    //constructor
    public dtoEducation() {
    }

    public dtoEducation(String nombreE, String descripcionE, String tituloE, Date inicioE, Date finE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.tituloE = tituloE;
        this.inicioE = inicioE;
        this.finE = finE;
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

    public Date getInicioE() {
        return inicioE;
    }

    public void setInicioE(Date inicioE) {
        this.inicioE = inicioE;
    }

    public Date getFinE() {
        return finE;
    }

    public void setFinE(Date finE) {
        this.finE = finE;
    }

}
