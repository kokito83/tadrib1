package com.greta94.PFMP.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


//*****Création de la table Stage ******
@Entity
public class Session {


    //============identifiant============
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    //=======================================
    //***** 1 ere colonne code Session
    @Column(name = "code", length = 20, nullable = false, unique = true)
    private String code;
    //=======================================
    //**** 2 éme Libellé Session
    @Column(name = "libelle", length = 250)
    private String libelle;
    //=======================================
    @Column //**** 3 éme colonne date debut de Session
    private String date_debut_Session;
    //=======================================
    @Column()//**** 4 éme date fin de Session
    private String date_fin_Session;
    //=======================================
    @Column //****5 ere colonne date debut de stage
    private String date_debut_Stage;
    @Column()//**** 6 éme date fin de stage
    private String date_fin_Stage;


    // lié la table Session a la table  formation
    @ManyToOne (cascade = CascadeType.ALL)
    private Formation formation;
    @ManyToMany(mappedBy = "sessions")
    private Set<Stagiaire> stagiaires;
  // constructeur par defaut
    public Session() {
    }

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

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDate_debut_Session() {
        return date_debut_Session;
    }

    public void setDate_debut_Session(String date_debut_Session) {
        this.date_debut_Session = date_debut_Session;
    }

    public String getDate_fin_Session() {
        return date_fin_Session;
    }

    public void setDate_fin_Session(String date_fin_Session) {
        this.date_fin_Session = date_fin_Session;
    }

    public String getDate_debut_Stage() {
        return date_debut_Stage;
    }

    public void setDate_debut_Stage(String date_debut_Stage) {
        this.date_debut_Stage = date_debut_Stage;
    }

    public String getDate_fin_Stage() {
        return date_fin_Stage;
    }

    public void setDate_fin_Stage(String date_fin_Stage) {
        this.date_fin_Stage = date_fin_Stage;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Set<Stagiaire> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(Set<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }

    public void addStagiaire(Stagiaire stagiaire){
        if(this.stagiaires == null){
            stagiaires = new HashSet<>();
        }
        stagiaires.add(stagiaire);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Session)) return false;
        Session session = (Session) o;
        return Objects.equals(getCode(), session.getCode()) &&
                Objects.equals(getLibelle(), session.getLibelle()) &&
                Objects.equals(getDate_debut_Session(), session.getDate_debut_Session()) &&
                Objects.equals(getDate_fin_Session(), session.getDate_fin_Session()) &&
                Objects.equals(getDate_debut_Stage(), session.getDate_debut_Stage()) &&
                Objects.equals(getDate_fin_Stage(), session.getDate_fin_Stage()) &&
                Objects.equals(getFormation(), session.getFormation()) &&
                Objects.equals(getStagiaires(), session.getStagiaires());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCode(), getLibelle(), getDate_debut_Session(), getDate_fin_Session(), getDate_debut_Stage(), getDate_fin_Stage(), getFormation(), getStagiaires());
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", date_debut_Session='" + date_debut_Session + '\'' +
                ", date_fin_Session='" + date_fin_Session + '\'' +
                ", date_debut_Stage='" + date_debut_Stage + '\'' +
                ", date_fin_Stage='" + date_fin_Stage + '\'' +
                ", formation=" + formation +
                ", stagiaires=" + stagiaires +
                '}';
    }
}