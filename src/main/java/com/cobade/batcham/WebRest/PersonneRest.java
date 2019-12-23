package com.cobade.batcham.WebRest;

import com.cobade.batcham.Dto.AddQuartieToUser;
import com.cobade.batcham.Metier.PersonneMetier;
import com.cobade.batcham.Metier.QuartierMetier;
import com.cobade.batcham.Metier.SecteurMetier;
import com.cobade.batcham.Model.Personne;
import com.cobade.batcham.Model.QuartierVille;
import com.cobade.batcham.Model.SecteurVillage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/batcham")
public class PersonneRest {

    @Autowired
    private PersonneMetier personneMetier;
    @Autowired
    QuartierMetier quartierMetier;
    @Autowired
    SecteurMetier secteurMetier;

    @GetMapping("/personnes")
    Page<Personne> index(Pageable pageable){
        return personneMetier.findAll(pageable);
    }
    @GetMapping("/personne/{mc}")
    Page<Personne> findbyname(@PathVariable String mc, Pageable pageable){
        return personneMetier.findByNomPrenom("%"+mc+"%",pageable);
    }
    // QUARTIER
    @GetMapping("/quartiers")
    List<QuartierVille> findallquartier(){
        return quartierMetier.findAllQuartier();
    }
    @PostMapping("/addquartier")
    void addquartierToUser(@RequestBody AddQuartieToUser addQuartieToUser){
        quartierMetier.AddQuartierToPersonne(addQuartieToUser.getIdpersonne(),addQuartieToUser.getIdquartorsecteur());
    }

    // SECTEUR
    @GetMapping("/secteur")
    List<SecteurVillage> findallsecteur(){
        return secteurMetier.findAllSecteur();
    }
    @PostMapping("/addsecteur")
    void addsecteurToUser(@RequestBody AddQuartieToUser addQuartieToUser){
        secteurMetier.AddSecteurToPersonne(addQuartieToUser.getIdpersonne(),addQuartieToUser.getIdquartorsecteur());
    }
}
