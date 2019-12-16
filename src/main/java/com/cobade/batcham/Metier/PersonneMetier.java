package com.cobade.batcham.Metier;

import com.cobade.batcham.Model.Personne;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonneMetier {
    public Personne savePersonne(Personne personne);
    Page<Personne> findAll(Pageable pageable);
    Personne findByNomPrenom(String nom_prenom);
}
