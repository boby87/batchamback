package com.cobade.batcham.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class SecteurVillage implements Serializable {
    @Id @GeneratedValue
    private Long idsecteur;
    private String nomsecteur;
    @OneToMany(mappedBy = "secteurVillage")
    private List<Personne> personnes;

    public SecteurVillage(String nomsecteur) {
        this.nomsecteur = nomsecteur;
    }

    public SecteurVillage() {
    }

    public Long getIdsecteur() {
        return idsecteur;
    }

    public void setIdsecteur(Long idsecteur) {
        this.idsecteur = idsecteur;
    }

    public String getNomsecteur() {
        return nomsecteur;
    }

    public void setNomsecteur(String nomsecteur) {
        this.nomsecteur = nomsecteur;
    }

    public List<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }
}
