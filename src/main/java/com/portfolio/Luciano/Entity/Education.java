package com.portfolio.Luciano.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private Date fechaDuracion;
    private String descripcionE;
    

    //constructores
    public Education() {
    }

    public Education(String nombreE, String descripcionE, Date fechaDuracion) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaDuracion = fechaDuracion;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
