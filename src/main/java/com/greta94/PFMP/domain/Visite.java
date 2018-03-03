package com.greta94.PFMP.domain;

import javax.persistence.*;
import java.util.Objects;


//*****Création de la table entreprise******
@Entity
public class Visite {

    //============identifiant============
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(  nullable = false, unique = true)
    private Long id;
    //=======================================
    @Column //****1 ere colonne raison Sociale
    private String date_visite;

    //=====lié visite vers leur Stage
    @ManyToOne(cascade = CascadeType.ALL)
    private Stage stage;

    //=====lié visite vers leur formateur
    @ManyToOne(cascade = CascadeType.ALL)
    private Salarie_Greta formateur;

    public Salarie_Greta getFormateur() {
        return formateur;
    }

    public void setFormateur(Salarie_Greta formateur) {
        this.formateur = formateur;
    }

    public Visite() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate_visite() {
        return date_visite;
    }

    public void setDate_visite(String date_visite) {
        this.date_visite = date_visite;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Visite)) return false;
        Visite visite = (Visite) o;
        return Objects.equals(getDate_visite(), visite.getDate_visite()) &&
                Objects.equals(getStage(), visite.getStage());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDate_visite(), getStage());
    }
}
