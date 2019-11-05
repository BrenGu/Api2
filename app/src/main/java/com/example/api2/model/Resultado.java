package com.example.api2.model;

public class Resultado {
    private int id;
    private String url;
    private String link;
    private String nombre;
    private String direccion;
    private String telefono;
    private String descripcion;
    private String email;
    private String provincia;
    private String depende_de;
    private String autoridad;

    public Resultado() {
    }

    public Resultado(int id, String url, String link, String nombre, String direccion, String telefono, String descripcion, String email, String provincia, String depende_de, String autoridad) {
        this.id = id;
        this.url = url;
        this.link = link;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.email = email;
        this.provincia = provincia;
        this.depende_de = depende_de;
        this.autoridad = autoridad;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getLink() {
        return link;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEmail() {
        return email;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDepende_de() {
        return depende_de;
    }

    public String getAutoridad() {
        return autoridad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setDepende_de(String depende_de) {
        this.depende_de = depende_de;
    }

    public void setAutoridad(String autoridad) {
        this.autoridad = autoridad;
    }
}
