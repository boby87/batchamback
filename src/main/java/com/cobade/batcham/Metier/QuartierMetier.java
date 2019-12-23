package com.cobade.batcham.Metier;

import com.cobade.batcham.Model.QuartierVille;

import java.util.List;

public interface QuartierMetier {

    List<QuartierVille> findAllQuartier();
    void AddQuartierToPersonne(Long idpersonne,Long idquartier);
}
