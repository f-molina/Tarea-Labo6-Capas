package com.uca.capas.ejParcial.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "importancia")
public class Importancia {

    @Id
    @GeneratedValue(generator = "importancia_cc_importancia_seq", strategy = GenerationType.AUTO)
    @Column(name = "cc_importancia")
    private Integer cImportancia;

    @Column(name = "s_importancia")
    private String sImportancia;

    @OneToMany(mappedBy = "importancia", fetch = FetchType.LAZY)
	private List<Contribuyente> contribuyentes;

    public Importancia(){}

    public Integer getcImportancia() {
        return cImportancia;
    }

    public void setcImportancia(Integer cImportancia) {
        this.cImportancia = cImportancia;
    }

    public String getsImportancia() {
        return sImportancia;
    }

    public void setsImportancia(String sImportancia) {
        this.sImportancia = sImportancia;
    }

    public List<Contribuyente> getContribuyentes() {
        return contribuyentes;
    }

    public void setContribuyentes(List<Contribuyente> contribuyentesList) {
        this.contribuyentes = contribuyentesList;
    }
}