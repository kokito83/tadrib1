package com.greta94.PFMP.domain;



import javax.persistence.*;
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
       //=====lié liste des Stages vers leur Tuteur

       @ManyToOne (cascade = CascadeType.ALL)
        private Salarie_Greta salarie_stage;



        public Stage() {
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
                Objects.equals(getEntreprise(), stage.getEntreprise());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDate_debut_Stage(), getDate_fin_Stage(), getAdresse(), getTelephoneMobile(), getTelephoneFixe(), getEmail(), getSecuriteSociale(), getEntreprise());
    }

    @Override
    public String toString() {
        return "Stage{" +
                "date_debut_Stage='" + date_debut_Stage + '\'' +
                ", date_fin_Stage='" + date_fin_Stage + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephoneMobile='" + telephoneMobile + '\'' +
                ", telephoneFixe='" + telephoneFixe + '\'' +
                ", email='" + email + '\'' +
                ", securiteSociale='" + securiteSociale + '\'' +
                ", entreprise=" + entreprise +
                '}';
    }
}
