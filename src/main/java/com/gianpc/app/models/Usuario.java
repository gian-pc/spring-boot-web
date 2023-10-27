package com.gianpc.app.models;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String email;

    // Construct
    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public Usuario(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
