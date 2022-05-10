package com.videojuego.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    @Column(name = "cuenta", nullable = false, length = 20)
    private String cuenta;

    @Column(name = "contrasena", nullable = false, length = 15)
    private String contrasena;

    @Column(name = "apodo", nullable = false, length = 25)
    private String apodo;

    @Column(name = "email", nullable = false, length = 25)
    private String email;

    @Column(name = "estado_registro", precision = 1)
    private BigDecimal estadoRegistro;

    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDate fechaModificacion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(BigDecimal estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}