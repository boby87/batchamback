package com.cobade.batcham.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class QuartierVille implements Serializable {
    @Id @GeneratedValue
    private Long idquartier;
    private String nomquartier;
    @OneToMany(mappedBy = "quartierVille")
    private List<Personne> personnes;

    public QuartierVille() {
    }

    public QuartierVille(String nomquartier) {
        this.nomquartier = nomquartier;
    }

    public Long getIdquartier() {
        return idquartier;
    }

    public void setIdquartier(Long idquartier) {
        this.idquartier = idquartier;
    }

    public String getNomquartier() {
        return nomquartier;
    }

    public void setNomquartier(String nomquartier) {
        this.nomquartier = nomquartier;
    }

    public List<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }
}
