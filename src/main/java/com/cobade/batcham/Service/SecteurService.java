package com.cobade.batcham.Service;

import com.cobade.batcham.Dao.PersonneDao;
import com.cobade.batcham.Dao.SecteurDao;
import com.cobade.batcham.Metier.SecteurMetier;
import com.cobade.batcham.Model.Personne;
import com.cobade.batcham.Model.SecteurVillage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("secteur")
@Transactional
public class SecteurService implements SecteurMetier {

    @Autowired private SecteurDao secteurDao;
    @Autowired private PersonneDao personneDao;
    @Override
    public List<SecteurVillage> findAllSecteur() {
        return secteurDao.findAll();
    }

    @Override
    public void AddSecteurToPersonne(Long idpersonne, Long idsecteur) {
        Personne personne=personneDao.getOne(idpersonne);
        SecteurVillage secteurVillage=secteurDao.getOne(idsecteur);
        personne.setSecteurVillage(secteurVillage);
    }
}
