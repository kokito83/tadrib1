package com.greta94.PFMP.domain;

import javax.persistence.*;
import java.util.List;


//*****Création de la table Stage ******
@Entity
public class Formation {
    //============identifiant============
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    //=======================================
    //****1 ere colonne date debut de stage
    @Column(name="code", length = 20, nullable = false, unique = true)
    private String code;
    //**** 2 éme date fin de stage
    @Column(name="libelle", length = 250)
    private String libelle;
    // lié la table Formation avec Session
    @OneToMany(mappedBy = "formation")
    private List<Session> sessions;


}
