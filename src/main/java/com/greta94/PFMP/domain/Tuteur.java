package com.greta94.PFMP.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * Projet gestionstages
 * Pour LAERCE SAS
 * <p>
 * Créé le  06/02/2018.
 *
 * @author fred
 */

//*****Création de la table stagiaire******
@Entity
public class Tuteur {


    //============identifiant============
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="code", length = 20, nullable = false, unique = true)
    private Long id;
    //=======================================

    @Column()//**** 2 éme colonne civililité
            String civilite;
    @Column//**** 3 éme colonne Nom
    private String nom;
    @Column//**** 4 éme colonne Prenom
    private String prenom;

    @Column//**** 5 éme colonne Mobile
    private String telephone;

    @Column//**** 6 éme colonne email
    private String email;
    @Column//**** 7 éme fonction email
    private String fonction;

    // lié la table entreprise avec stage
    @OneToMany(mappedBy ="tuteur")
    private List<Stage> stages;

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

    public Tuteur() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuteur)) return false;
        Tuteur tuteur = (Tuteur) o;
        return Objects.equals(getCivilite(), tuteur.getCivilite()) &&
                Objects.equals(getNom(), tuteur.getNom()) &&
                Objects.equals(getPrenom(), tuteur.getPrenom()) &&
                Objects.equals(getTelephone(), tuteur.getTelephone()) &&
                Objects.equals(getEmail(), tuteur.getEmail()) &&
                Objects.equals(getFonction(), tuteur.getFonction());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCivilite(), getNom(), getPrenom(), getTelephone(), getEmail(), getFonction());
    }

    @Override
    public String toString() {
        return "Tuteur{" +
                "id=" + id +
                ", civilite='" + civilite + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", fonction='" + fonction + '\'' +
                '}';
    }
}
