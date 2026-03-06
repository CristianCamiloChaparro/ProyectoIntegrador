package com.models;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "casos")
public class Caso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_caso")
    private Integer numeroCaso;

    private String asunto;
    private String sede;

    @Enumerated(EnumType.STRING)
    private EstadoCaso estado = EstadoCaso.pendiente;

    @ManyToOne
    @JoinColumn(name = "cedula_cliente", nullable = false)
    private Cliente cliente;

    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    public enum EstadoCaso { pendiente, asignado, en_proceso, cerrado }

    public Integer getNumeroCaso() { return numeroCaso; }
    public void setNumeroCaso(Integer numeroCaso) { this.numeroCaso = numero