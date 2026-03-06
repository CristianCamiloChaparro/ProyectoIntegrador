package com.models;

import jakarta.persistence.*;

@Entity
@Table(name = "judicantes")
public class Judicante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_judicante")
    private Integer idJudicante;

    @OneToOne
    @JoinColumn(name = "id_usuario", unique = true, nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_area", nullable = false)
    private AreasDerecho area;

    @ManyToOne
    @JoinColumn(name = "id_profesor", nullable = false)
    private Profesor profesor;

    public Integer getIdJudicante() { return idJudicante; }
    public void setIdJudicante(Integer idJudicante) { this.idJudicante = idJudicante; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public AreasDerecho getArea() { return area; }
    public void setArea(AreasDerecho area) { this.area = area; }

    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
}
