package com.greta94.PFMP.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Projet gestionstages
 * Pour LAERCE SAS
 * <p>
 * Créé le  06/02/2018.
 *
 * @author fred
 */

@Entity
public class Formateur extends Personne {
    @Column
    private String role;

    @ManyToMany(cascade=CascadeType.ALL)
    private Set<Discipline> disciplines;

    @ManyToMany(cascade=CascadeType.ALL)
    private Set<Division> divisions;


    public Formateur(){
        this.divisions = new HashSet<>();
        this.disciplines = new HashSet<>();

    }

    public Set<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(Set<Division> divisions) {
        this.divisions = divisions;
    }

    public void addDivision(Division division) {
        this.divisions.add(division);
    }

    public Set<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Set<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public void addDiscipline(Discipline discipline) {
        if (this.disciplines != null) {
            this.disciplines.remove(discipline);
        }
        this.disciplines.add(discipline);
        // gestion du lien inverse
        discipline.addProfesseur(this);
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
