package com.portfolio.Luciano.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyects {
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String description;
    @NotBlank
    private String img;
    
    //Constructor

    public dtoProyects() {
    }

    public dtoProyects(String nombre, String description, String img) {
        this.nombre = nombre;
        this.description = description;
        this.img = img;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
}
