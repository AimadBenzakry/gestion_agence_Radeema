package com.example.projet_jee.bean;

import javax.persistence.*;

@Entity
public class PaiementConsommation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    //private Consommation consommation ;
    private double montant;

    /******Constructors******/
    public PaiementConsommation() {
    }

    /******Getters&Setters******/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
