package com.models;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Integer idEstudiante;

    @OneToOne
    @JoinColumn(name = "id_usuario", unique = true, nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_area", nullable = false)
    private AreasDerecho area;

    @ManyToOne
    @JoinColumn(name = "id_judicante")
    private Judicante judicante;

    public Integer getIdEstudiante() { return idEstudiante; }
    public void setIdEstudiante(Integer idEstudiante) { this.idEstudiante = idEstudiante; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public AreasDerecho getArea() { return area; }
    public void setArea(AreasDerecho area) { this.area = area; }

    public Judicante getJudicante() { return judicante; }
    public void setJudicante(Judicante judicante) { this.judicante = judicante; }
}
