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
        @Column(  nullable = false, unique = true)
        private Long id;
        //=======================================
        @Column //****1 ere colonne date debut de stage
        private String date_debut_Stage;
        @Column()//**** 2 éme date fin de stage
                String date_fin_Stage;
        @Column//**** 3 éme colonne adresse stage
        private String adresse;
        @Column//**** 4 éme colonne Mobile
        private String telephoneMobile;
        @Column//**** 5 éme colonne fixe
        private String telephoneFixe;
        @Column//**** 8 éme colonne email
        private String email;
        @Column//**** 9 éme colonne Securité sociale
        private String securiteSociale;
       //=====lié liste des Stages vers leur entreprise

        @ManyToOne (cascade = CascadeType.ALL)
        private Entreprise entreprise;


    //=====lié liste des Stages vers leur Tuteur

        @ManyToOne (cascade = CascadeType.ALL)
         private Tuteur tuteur;
       //=====lié liste des Stages vers leur Salarié greta

       @ManyToOne (cascade = CascadeType.ALL)
        private Salarie_Greta salarie_greta;

       //=====lié liste des Stages vers leur Salarié greta

       @ManyToOne (cascade = CascadeType.ALL)
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

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Tuteur getTuteur() {
        return tuteur;
    }

    public void setTuteur(Tuteur tuteur) {
        this.tuteur = tuteur;
    }

    public Salarie_Greta getSalarie_greta() {
        return salarie_greta;
    }

    public void setSalarie_greta(Salarie_Greta salarie_greta) {
        this.salarie_greta = salarie_greta;
    }

    public Stagiaire getStagiaire() {
        return stagiaire;
    }

    public void setStagiaire(Stagiaire stagiaire) {
        this.stagiaire = stagiaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stage)) return false;
        Stage stage = (Stage) o;
        return Objects.equals(getDate_debut_Stage(), stage.getDate_debut_Stage()) &&
                Objects.equals(getDate_fin_Stage(), stage.getDate_fin_Stage()) &&
                Objects.equals(getAdresse(), stage.getAdresse()) &&
                Objects.equals(getTelephoneMobile(), stage.getTelephoneMobile()) &&
                Objects.equals(getTelephoneFixe(), stage.getTelephoneFixe()) &&
                Objects.equals(getEmail(), stage.getEmail()) &&
                Objects.equals(getSecuriteSociale(), stage.getSecuriteSociale()) &&
                Objects.equals(getEntreprise(), stage.getEntreprise()) &&
                Objects.equals(getTuteur(), stage.getTuteur()) &&
                Objects.equals(getSalarie_greta(), stage.getSalarie_greta()) &&
                Objects.equals(getStagiaire(), stage.getStagiaire());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDate_debut_Stage(), getDate_fin_Stage(), getAdresse(), getTelephoneMobile(), getTelephoneFixe(), getEmail(), getSecuriteSociale(), getEntreprise(), getTuteur(), getSalarie_greta(), getStagiaire());
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", date_debut_Stage='" + date_debut_Stage + '\'' +
                ", date_fin_Stage='" + date_fin_Stage + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephoneMobile='" + telephoneMobile + '\'' +
                ", telephoneFixe='" + telephoneFixe + '\'' +
                ", email='" + email + '\'' +
                ", securiteSociale='" + securiteSociale + '\'' +
                ", entreprise=" + entreprise +
                ", tuteur=" + tuteur +
                ", salarie_greta=" + salarie_greta +
                ", stagiaire=" + stagiaire +
                '}';
    }
}
