package com.darkcode.spring.app.Models;

import java.time.LocalDateTime;

public class User {
    private String nombre;
    private String apellido;
    private Long id;
    private String email;
    private LocalDateTime fechaCreacion;

    public User(String nombre, String apellido, Long id, String email, LocalDateTime fechaCreacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
    } 
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getEmail(){
        return email;
    }
    public Long getId(){
        return id;
    }
    public LocalDateTime getFechaCreacion(){
        return fechaCreacion;
    }
}   
