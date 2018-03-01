package com.greta94.PFMP.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Projet pfmp-base
 * Pour LAERCE SAS
 * <p>
 * Créé le  11/01/2018.
 *
 * @author fred
 */
@Entity
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="code", length = 20, nullable = false, unique = true)
    private String code;
    @Column(name="libelle", length = 50)
    private String libelle;

    @ManyToMany(mappedBy = "disciplines")
    private List<Formateur> formateurs = new ArrayList<Formateur>();


    public List<Formateur> getFormateurs() {
        return formateurs;
    }

    public void setFormateurs(List<Formateur> formateurs) {
        this.formateurs = formateurs;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Discipline that = (Discipline) o;
    return Objects.equals(code, that.code) &&
            Objects.equals(libelle, that.libelle);
  }

  @Override
  public int hashCode() {

    return Objects.hash(code, libelle);
  }


  @Override
    public String toString() {
        return "Discipline{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }

    public void addProfesseur(Formateur individu) {
        this.getFormateurs().add(individu);
    }

    public void removeProfesseur(Formateur individu) {
        this.getFormateurs().remove(individu);
    }
}
