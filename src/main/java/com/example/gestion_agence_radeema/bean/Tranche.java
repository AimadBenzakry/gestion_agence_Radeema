package com.example.gestion_agence_radeema.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tranche {
    @Id @GeneratedValue
    private Long id;
    private int numero;
    private String description;
    private double consommationMin;
    private double consommationMax;
    private double prixTranche;


    /******Constructors******/
    public Tranche(int numero, String description, double consommationMin, double consommationMax, double prixTranche) {
        this.numero = numero;
        this.description = description;
        this.consommationMin = consommationMin;
        this.consommationMax = consommationMax;
        this.prixTranche = prixTranche;
    }

    public Tranche() {
    }

    /******Getters&Setters******/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getConsommationMin() {
        return consommationMin;
    }

    public void setConsommationMin(double consommationMin) {
        this.consommationMin = consommationMin;
    }

    public double getConsommationMax() {
        return consommationMax;
    }

    public void setConsommationMax(double consommationMax) {
        this.consommationMax = consommationMax;
    }

    public double getPrixTranche() {
        return prixTranche;
    }

    public void setPrixTranche(double prixTranche) {
        this.prixTranche = prixTranche;
    }
}
