package com.cobade.batcham.Dao;

import com.cobade.batcham.Model.Personne;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface PersonneDao extends JpaRepository<Personne,Long> {
    @Query("select q from Personne q where q.nomprenom like :mc ")
    Page<Personne> findBynomprenom(@Param("mc") String nomprenom,Pageable pageable);
    @Override
    Page<Personne> findAll(Pageable pageable);
    @Query("select q from Personne q where q.nomprenom like :x ")
    Personne findBynom(@Param("x")String nom);
    @Query("select q from Personne q where q.nomprenom = nomprenom and q.password = password")
    Personne findBynomprenomAndpassword(@Param("nomprenom") String nomprenom,@Param("password") String password);

}
