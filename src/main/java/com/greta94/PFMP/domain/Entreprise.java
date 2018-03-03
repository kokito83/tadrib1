package com.greta94.PFMP.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

//*****Création de la table entreprise******
@Entity
public class Entreprise {

    //============identifiant============
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    //=======================================
    @Column //****1 ere colonne raison Sociale
    private String raison_Sociale;
    @Column()//**** 2 éme colonne domaine activite
            String activite;
    @Column//**** 3 éme colonne Code APE
    private String code_APE;
    @Column//**** 4 éme colonne Num siret
    private String num_siret;
    @Column//**** 5 éme colonne adresse
    private String adresse;
    @Column//**** 6 éme colonne telephone
    private String telephone;
    @Column//**** 7 éme colonne email
    private String email;

    // lié la table entreprise avec stage
    @OneToMany(mappedBy = "entreprise")
    private List<Stage> stages;

    public Entreprise() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaison_Sociale() {
        return raison_Sociale;
    }

    public void setRaison_Sociale(String raison_Sociale) {
        this.raison_Sociale = raison_Sociale;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getCode_APE() {
        return code_APE;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

    public void setCode_APE(String code_APE) {
        this.code_APE = code_APE;
    }

    public String getNum_siret() {
        return num_siret;
    }

    public void setNum_siret(String num_siret) {
        this.num_siret = num_siret;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entreprise)) return false;
        Entreprise that = (Entreprise) o;
        return Objects.equals(getRaison_Sociale(), that.getRaison_Sociale()) &&
                Objects.equals(getActivite(), that.getActivite()) &&
                Objects.equals(getCode_APE(), that.getCode_APE()) &&
                Objects.equals(getNum_siret(), that.getNum_siret()) &&
                Objects.equals(getAdresse(), that.getAdresse()) &&
                Objects.equals(getTelephone(), that.getTelephone()) &&
                Objects.equals(getEmail(), that.getEmail()) &&
                Objects.equals(getStages(), that.getStages());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRaison_Sociale(), getActivite(), getCode_APE(), getNum_siret(), getAdresse(), getTelephone(), getEmail(), getStages());
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "raison_Sociale='" + raison_Sociale + '\'' +
                ", activite='" + activite + '\'' +
                ", code_APE='" + code_APE + '\'' +
                ", num_siret='" + num_siret + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", stages=" + stages +
                '}';
    }
}
