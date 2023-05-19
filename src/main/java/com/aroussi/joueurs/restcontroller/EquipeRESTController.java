package com.aroussi.joueurs.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aroussi.joueurs.entities.Equipe;
import com.aroussi.joueurs.repos.EquipeRepository;

@RestController
@RequestMapping("/api/equipes")
@CrossOrigin("*")
public class EquipeRESTController {
    @Autowired
    EquipeRepository equipeRepository;

    @RequestMapping(value = "/allEquipes", method = RequestMethod.GET)
    public List<Equipe> getAllEquipes () {
        return equipeRepository.findAll();
    }

    @RequestMapping(value = "/addEquipe", method = RequestMethod.POST)
    public Equipe createEquipe (@RequestBody Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Equipe getEquipeByID (@PathVariable("id") Long id) {
        return equipeRepository.findById(id).get();
    }
}
