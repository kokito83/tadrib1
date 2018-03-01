package com.greta94.PFMP.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Projet gestionstages
 * Pour LAERCE SAS
 * <p>
 * Créé le  06/02/2018.
 *
 * @author fred
 */

@Entity
public class Professionnel extends Personne {
    @Column
    private String fonction;

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}
