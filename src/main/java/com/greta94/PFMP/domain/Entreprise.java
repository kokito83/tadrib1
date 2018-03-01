package com.greta94.PFMP.domain;

import javax.persistence.*;
//*****Création de la table entreprise******
@Entity
public class Entreprise {

          //============identifiant============
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(  nullable = false, unique = true)
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


}
