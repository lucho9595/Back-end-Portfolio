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
    private String tituloE;
    private String descripcionE;
    private Date inicioE;
    private Date finE;
    private String img;
    private String url_imagen;

    //constructores
    public Education() {
    }

    public Education(String nombreE, String descripcionE, String tituloE, Date inicioE, Date finE, String img, String url_imagen) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.tituloE = tituloE;
        this.inicioE = inicioE;
        this.finE = finE;
        this.img = img;
        this.url_imagen = url_imagen;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url) {
        this.url_imagen = url;
    }

}
