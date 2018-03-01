package com.greta94.PFMP.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * Projet PFMP
 *
 * <p>
 * Créé le  06/02/2018.
 *
 * @author group
 */

//*****Création de la table stagiaire******
@Entity
public class Stagiaire {


  //============identifiant============
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="code", length = 20, nullable = false, unique = true)
    private Long id;
    //=======================================
    @Column //****1 ere colonne code synchro
    private Long codeSynchro;
    @Column()//**** 2 éme colonne civililité
    String civilite;
    @Column//**** 3 éme colonne Nom
    private String nom;
    @Column//**** 4 éme colonne Prenom
    private String prenom;
    @Column//**** 5 éme colonne adresse
    private String adresse;
    @Column//**** 6 éme colonne Mobile
    private String telephoneMobile;
    @Column//**** 7 éme colonne fixe
    private String telephoneFixe;
    @Column//**** 8 éme colonne email
    private String email;
    @Column//**** 9 éme colonne Securité sociale
    private String securiteSociale;

  public Stagiaire() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCodeSynchro() {
    return codeSynchro;
  }

  public void setCodeSynchro(Long codeSynchro) {
    this.codeSynchro = codeSynchro;
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

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public String getTelephoneMobile() {
    return telephoneMobile;
  }

  public void setTelephoneMobile(String telephoneMobile) {
    this.telephoneMobile = telephoneMobile;
  }

  public String getTelephoneFixe() {
    return telephoneFixe;
  }

  public void setTelephoneFixe(String telephoneFixe) {
    this.telephoneFixe = telephoneFixe;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSecuriteSociale() {
    return securiteSociale;
  }

  public void setSecuriteSociale(String securiteSociale) {
    this.securiteSociale = securiteSociale;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Stagiaire)) return false;
    Stagiaire stagiaire = (Stagiaire) o;
    return Objects.equals(getCodeSynchro(), stagiaire.getCodeSynchro()) &&
            Objects.equals(getCivilite(), stagiaire.getCivilite()) &&
            Objects.equals(getNom(), stagiaire.getNom()) &&
            Objects.equals(getPrenom(), stagiaire.getPrenom()) &&
            Objects.equals(getAdresse(), stagiaire.getAdresse()) &&
            Objects.equals(getTelephoneMobile(), stagiaire.getTelephoneMobile()) &&
            Objects.equals(getTelephoneFixe(), stagiaire.getTelephoneFixe()) &&
            Objects.equals(getEmail(), stagiaire.getEmail()) &&
            Objects.equals(getSecuriteSociale(), stagiaire.getSecuriteSociale());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getCodeSynchro(), getCivilite(), getNom(), getPrenom(), getAdresse(), getTelephoneMobile(), getTelephoneFixe(), getEmail(), getSecuriteSociale());
  }

  @Override
  public String toString() {
    return "Stagiaire{" +
            "id=" + id +
            ", codeSynchro=" + codeSynchro +
            ", civilite='" + civilite + '\'' +
            ", nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", adresse='" + adresse + '\'' +
            ", telephoneMobile='" + telephoneMobile + '\'' +
            ", telephoneFixe='" + telephoneFixe + '\'' +
            ", email='" + email + '\'' +
            ", securiteSociale='" + securiteSociale + '\'' +
            '}';
  }
}