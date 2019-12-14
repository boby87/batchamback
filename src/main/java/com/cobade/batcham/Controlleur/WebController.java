package com.cobade.batcham.Controlleur;

import com.cobade.batcham.Metier.PersonneMetier;
import com.cobade.batcham.Model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/batcham")
public class WebController {

    @Autowired
    private PersonneMetier personneMetier;

    @GetMapping("/personnes")
    List<Personne> index(){
        return personneMetier.findAll();
    }
}
