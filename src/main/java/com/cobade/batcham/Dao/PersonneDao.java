package com.cobade.batcham.Dao;

import com.cobade.batcham.Model.Personne;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface PersonneDao extends JpaRepository<Personne,Long> {
    Personne findBynomprenom(String nomprenom);
    @Override
    Page<Personne> findAll(Pageable pageable);
}
