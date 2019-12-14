package com.cobade.batcham.Controlleur;

import com.cobade.batcham.Metier.PersonneMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    private PersonneMetier personneMetier;

    @RequestMapping("/batcham")
    String index(){
        return "template";
    }
}
