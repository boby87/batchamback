package com.cobade.batcham.Service;

import com.cobade.batcham.Dao.PersonneDao;
import com.cobade.batcham.Dao.QuartierDao;
import com.cobade.batcham.Metier.QuartierMetier;
import com.cobade.batcham.Model.Personne;
import com.cobade.batcham.Model.QuartierVille;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("quartier")
@Transactional
public class QuartierService implements QuartierMetier {
    @Autowired private QuartierDao quartierDao;
    @Autowired private PersonneDao personneDao;

    @Override
    public List<QuartierVille> findAllQuartier() {
        return quartierDao.findAll();
    }

    @Override
    public void AddQuartierToPersonne(Long idpersonne, Long idquartier) {
        Personne personne=personneDao.getOne(idpersonne);
        QuartierVille quartierVille=quartierDao.getOne(idquartier);
        personne.setQuartierVille(quartierVille);
    }
}
