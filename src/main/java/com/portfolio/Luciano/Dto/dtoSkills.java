package com.portfolio.Luciano.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {

    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    @NotBlank
    private String img;

    public dtoSkills() {
    }

    public dtoSkills(String nombre, int porcentaje, String img) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
