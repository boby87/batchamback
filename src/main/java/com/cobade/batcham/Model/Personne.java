package com.cobade.batcham.Model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Personne implements Serializable {
    @Id
    @GeneratedValue
    private Long idpersonne;
    @Column(name = "Nom_Prenom")
    private String nomprenom;
    @Column(name = "date_naissance")
    private String datenaissance;
    private String contact;
    private String lieuresidence;
    @ManyToOne
    @JoinColumn(name = "idquartier")
    private QuartierVille quartierVille;
    @ManyToOne
    @JoinColumn(name = "idsecteur")
    private SecteurVillage secteurVillage;

    public Personne() {
    }

    public Personne(String nomprenom, String datenaissance, String contact, String lieuresidence) {
        this.nomprenom = nomprenom;
        this.datenaissance = datenaissance;
        this.contact = contact;
        this.lieuresidence = lieuresidence;
    }

    public Long getIdpersonne() {
        return idpersonne;
    }

    public void setIdpersonne(Long idpersonne) {
        this.idpersonne = idpersonne;
    }

    public String getNomprenom() {
        return nomprenom;
    }

    public void setNomprenom(String nomprenom) {
        this.nomprenom = nomprenom;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public QuartierVille getQuartierVille() {
        return quartierVille;
    }

    public void setQuartierVille(QuartierVille quartierVille) {
        this.quartierVille = quartierVille;
    }

    public SecteurVillage getSecteurVillage() {
        return secteurVillage;
    }

    public void setSecteurVillage(SecteurVillage secteurVillage) {
        this.secteurVillage = secteurVillage;
    }

    public String getLieuresidence() {
        return lieuresidence;
    }

    public void setLieuresidence(String lieuresidence) {
        this.lieuresidence = lieuresidence;
    }
}
