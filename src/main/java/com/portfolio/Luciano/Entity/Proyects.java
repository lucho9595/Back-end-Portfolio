package com.portfolio.Luciano.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Proyects {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
            
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    private String description;
    
    private String img;
    
    private String url_imagen;

    //constructor
    public Proyects() {
    };

    public Proyects(String nombre, String description, String img, String url_imagen) {
        this.nombre = nombre;
        this.description = description;
        this.img = img;
        this.url_imagen = url_imagen;
    };
    
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url) {
        this.url_imagen = url;
    }
    
}
