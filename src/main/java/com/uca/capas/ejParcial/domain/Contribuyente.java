package com.uca.capas.ejParcial.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema = "public", name = "contribuyente")
public class Contribuyente {

    @Id
    @GeneratedValue(generator = "contribuyente_c_contribuyente_seq", strategy = GenerationType.AUTO)
    @Column(name = "c_contribuyente")
    private Integer codigoContribuyente;

    @NotEmpty(message = "El campo no debe de estar vacio")
    @Size(max = 30, message = "Maximo 30 caracteres")
    @Column(name = "s_nombre")
    private String nombre;

    @NotEmpty(message = "El campo no debe de estar vacio")
    @Size(max = 30, message = "Maximo 30 caracteres")
    @Column(name = "s_apellido")
    private String apellido;

    @NotEmpty(message = "El campo no debe de estar vacio")
    @Size(min = 14, max = 14, message = "Exactamente 14 caracteres")
    @Column(name = "s_nit")
    private String nit;

    @Column(name = "f_fecha_ingreso")
    private LocalDate fechaIngreso;

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

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    //delegate fecha
    public String getFechaDelegate(){
		if(this.fechaIngreso == null){
			return "";
		}
		else{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String shortdate = this.fechaIngreso.format(formatter);
			return shortdate;
		}
	}

    public Importancia getImportancia() {
        return importancia;
    }

    public void setImportancia(Importancia importancia) {
        this.importancia = importancia;
    }

    //current date before insert
    @PrePersist
    public void prePersist(){
        this.fechaIngreso = LocalDate.now();
    }
}