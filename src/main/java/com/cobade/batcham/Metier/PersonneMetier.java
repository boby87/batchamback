package com.cobade.batcham.Metier;

import com.cobade.batcham.Model.Personne;

import java.util.List;

public interface PersonneMetier {
    public Personne savePersonne(Personne personne);
    List<Personne> findAll();
    Personne findByNomPrenom(String nom_prenom);
}
