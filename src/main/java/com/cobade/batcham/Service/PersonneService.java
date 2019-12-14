package com.cobade.batcham.Service;

import com.cobade.batcham.Dao.PersonneDao;
import com.cobade.batcham.Metier.PersonneMetier;
import com.cobade.batcham.Model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PersonneService implements PersonneMetier {

    @Autowired
    private PersonneDao personneDao;
    @Override
    public Personne savePersonne(Personne personne) {
        return personneDao.save(personne);
    }

    @Override
    public List<Personne> findAll() {
        return personneDao.findAll();
    }

    @Override
    public Personne findByNomPrenom(String nom_prenom) {
        return personneDao.findBynomprenom(nom_prenom);
    }
}
