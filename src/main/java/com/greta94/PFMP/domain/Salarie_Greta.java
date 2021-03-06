package com.greta94.PFMP.domain;
import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

//*****Création de la table stagiaire******
@Entity
public class Salarie_Greta {


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
    @Column//**** 6 éme colonne telephone
    private String telephone;
    @Column//**** 7 éme colonne email
    private String email;
    @Column//**** 8 éme colonne Fonction
    private String fonction;
    @Column(unique = true)
    private String login;

    @Column
    private String mdp;

    @Column
    private String mdpOrigine;

    @Column
    private String roles;



    // lié la table salarie de greta avec stage
    @OneToMany(mappedBy ="salarie_greta")
    private List<Stage> stages;


    // lié la table salarie de greta avec visite
    @OneToMany(mappedBy ="formateur")
    private List<Visite> visites;


    @ManyToMany(cascade=CascadeType.ALL)
    private Set<Formation> formations;

    public Salarie_Greta(){
        this.formations = new HashSet<>();
        // this.disciplines = new HashSet<>();

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getMdpOrigine() {
        return mdpOrigine;
    }

    public void setMdpOrigine(String mdpOrigine) {
        this.mdpOrigine = mdpOrigine;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Salarie_Greta)) return false;
        Salarie_Greta that = (Salarie_Greta) o;
        return Objects.equals(getCodeSynchro(), that.getCodeSynchro()) &&
                Objects.equals(getCivilite(), that.getCivilite()) &&
                Objects.equals(getNom(), that.getNom()) &&
                Objects.equals(getPrenom(), that.getPrenom()) &&
                Objects.equals(getAdresse(), that.getAdresse()) &&
                Objects.equals(getTelephone(), that.getTelephone()) &&
                Objects.equals(getEmail(), that.getEmail()) &&
                Objects.equals(getFonction(), that.getFonction()) &&
                Objects.equals(getLogin(), that.getLogin()) &&
                Objects.equals(getMdp(), that.getMdp()) &&
                Objects.equals(getMdpOrigine(), that.getMdpOrigine()) &&
                Objects.equals(getRoles(), that.getRoles()) &&
                Objects.equals(getStages(), that.getStages());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCodeSynchro(), getCivilite(), getNom(), getPrenom(), getAdresse(), getTelephone(), getEmail(), getFonction(), getLogin(), getMdp(), getMdpOrigine(), getRoles(), getStages());
    }

    @Override
    public String toString() {
        return "Salarie_Greta{" +
                "id=" + id +
                ", codeSynchro=" + codeSynchro +
                ", civilite='" + civilite + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", fonction='" + fonction + '\'' +
                ", login='" + login + '\'' +
                ", mdp='" + mdp + '\'' +
                ", mdpOrigine='" + mdpOrigine + '\'' +
                ", roles='" + roles + '\'' +
                ", stages=" + stages +
                '}';
    }
}