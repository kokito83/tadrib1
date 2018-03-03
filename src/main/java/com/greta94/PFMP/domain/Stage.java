package com.greta94.PFMP.domain;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;


//*****Création de la table Stage ******
@Entity
public class Stage {


    //============identifiant============
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    //=======================================
    @Column //****1 ere colonne date debut de stage
    private String date_debut_Stage;
    @Column()//**** 2 éme date fin de stage
            String date_fin_Stage;
    //=====lié liste des Stages vers leur entreprise

    @ManyToOne(cascade = CascadeType.ALL)
    private Entreprise entreprise;


    //=====lié liste des Stages vers leur Tuteur

    @ManyToOne(cascade = CascadeType.ALL)
    private Tuteur tuteur;
    //=====lié liste des Stages vers leur Salarié greta

    @ManyToOne(cascade = CascadeType.ALL)
    private Salarie_Greta salarie_greta;

    //=====lié liste des Stages vers leur Salarié greta

    @ManyToOne(cascade = CascadeType.ALL)
    private Stagiaire stagiaire;

    @OneToMany(mappedBy = "stage")
    private List<Visite> visites;


    public Stage() {
    }


    public List<Visite> getVisites() {
        return visites;
    }

    public void setVisites(List<Visite> visites) {
        this.visites = visites;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


}
