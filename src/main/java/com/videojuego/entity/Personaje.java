package com.videojuego.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "personaje")
public class Personaje {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    @Column(name = "nombre", nullable = false, length = 15)
    private String nombre;

    @Column(name = "fuerza", nullable = false, precision = 10)
    private BigDecimal fuerza;

    @Column(name = "mana", nullable = false, precision = 10)
    private BigDecimal mana;

    @Column(name = "energia", nullable = false, precision = 10)
    private BigDecimal energia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_especie", nullable = false)
    private Especie idEspecie;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_jugador", nullable = false)
    private Jugador idJugador;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getFuerza() {
        return fuerza;
    }

    public void setFuerza(BigDecimal fuerza) {
        this.fuerza = fuerza;
    }

    public BigDecimal getMana() {
        return mana;
    }

    public void setMana(BigDecimal mana) {
        this.mana = mana;
    }

    public BigDecimal getEnergia() {
        return energia;
    }

    public void setEnergia(BigDecimal energia) {
        this.energia = energia;
    }

    public Especie getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(Especie idEspecie) {
        this.idEspecie = idEspecie;
    }

    public Jugador getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Jugador idJugador) {
        this.idJugador = idJugador;
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