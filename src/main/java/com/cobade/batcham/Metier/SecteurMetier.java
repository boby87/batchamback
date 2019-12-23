package com.cobade.batcham.Metier;

import com.cobade.batcham.Model.SecteurVillage;

import java.util.List;

public interface SecteurMetier {
    List<SecteurVillage> findAllSecteur();
    void AddSecteurToPersonne(Long idpersonne,Long idsecteur);
}
