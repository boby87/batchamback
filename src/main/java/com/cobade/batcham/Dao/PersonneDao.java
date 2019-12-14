package com.cobade.batcham.Dao;

import com.cobade.batcham.Model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneDao extends JpaRepository<Personne,Long> {
    Personne findBynomprenom(String nomprenom);
}
