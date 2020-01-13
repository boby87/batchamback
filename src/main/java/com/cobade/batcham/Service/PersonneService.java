package com.cobade.batcham.Service;

import com.cobade.batcham.Dao.PersonneDao;
import com.cobade.batcham.Metier.PersonneMetier;
import com.cobade.batcham.Model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Personne> findAll(Pageable pageable) {
        return personneDao.findAll(pageable);
    }

    @Override
    public Page<Personne> findByNomPrenom(String nom_prenom,Pageable pageable) {
        return personneDao.findBynomprenom(nom_prenom, pageable);
    }

    @Override
    public Personne connection(String nom, String password) {
        Personne personne=personneDao.findBynomprenomAndpassword(nom, password);
        return personne;
    }

    @Override
    public Personne findBynompersonne(String nom) {
        Personne personne=personneDao.findBynom(nom);
        if (personne!=null){
            return personne;
        }
        return null;
    }
}
