package com.portfolio.Luciano.Security.Dto;

import javax.validation.constraints.NotBlank;

public class LoginUsuario {
    //no puede estar en blanco o vacio;
    @NotBlank
    private String nombreUsuario;
    @NotBlank
    private String password;
    
    //Getters and Setters

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
