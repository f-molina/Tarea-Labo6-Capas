package com.uca.capas.ejParcial.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "contribuyente")
public class Contribuyente {

    @Id
    @GeneratedValue(generator = "contribuyente_c_contribuyente_seq", strategy = GenerationType.AUTO)
    @Column(name = "c_contribuyente")
    private Integer codigoContribuyente;

    @Column(name = "s_nombre")
    private String nombre;

    @Column(name = "s_apellido")
    private String apellido;

    @Column(name = "s_nit")
    private String nit;

    @Column(name = "f_fecha_ingreso")
    private Date fechaIngreso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_importancia")
    private Importancia importancia;

    public Contribuyente(){}

    public Integer getCodigoContribuyente() {
        return codigoContribuyente;
    }

    public void setCodigoContribuyente(Integer codigoContribuyente) {
        this.codigoContribuyente = codigoContribuyente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Importancia getImportancia() {
        return importancia;
    }

    public void setImportancia(Importancia importancia) {
        this.importancia = importancia;
    }
}