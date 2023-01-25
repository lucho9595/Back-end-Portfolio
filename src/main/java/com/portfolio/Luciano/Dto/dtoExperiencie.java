package com.portfolio.Luciano.Dto;

import java.util.Date;
import javax.validation.constraints.NotBlank;

public class dtoExperiencie {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private Date inicioE;
    @NotBlank
    private Date finE;
    @NotBlank
    private String img;
    @NotBlank
    private String url_imagen;

    //constructor
    public dtoExperiencie() {
    }

    public dtoExperiencie(String nombreE, String descripcionE, Date inicioE, Date finE, String img, String url_imagen) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioE = inicioE;
        this.finE = finE;
        this.img = img;
        this.url_imagen = url_imagen;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }
}
