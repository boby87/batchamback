package com.cobade.batcham.Controlleur;

import com.cobade.batcham.Metier.PersonneMetier;
import com.cobade.batcham.Model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/batcham")
public class WebController {

    @Autowired
    private PersonneMetier personneMetier;

    @GetMapping("/personnes")
    Page<Personne> index(Pageable pageable){
        return personneMetier.findAll(pageable);
    }
    @GetMapping("/personne/{mc}")
    Page<Personne> findbyname(@PathVariable String mc, Pageable pageable){
        return personneMetier.findByNomPrenom("%"+mc+"%",pageable);
    }
}
