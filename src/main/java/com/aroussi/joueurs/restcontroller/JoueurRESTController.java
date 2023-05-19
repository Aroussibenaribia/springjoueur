package com.aroussi.joueurs.restcontroller;

import com.aroussi.joueurs.entities.Joueur;
import com.aroussi.joueurs.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class JoueurRESTController {
    @Autowired
    JoueurService joueurService;

    @RequestMapping(value = "/allJoueurs", method = RequestMethod.GET)
    public List<Joueur> getAllJoueurs() {
        return joueurService.getAllJoueurs();
    }

    @RequestMapping(value = "/joueur/{id}", method = RequestMethod.GET)
    public Joueur getJoueurById(@PathVariable("id") Long id) {
        return joueurService.getJoueur(id);
    }

    @RequestMapping(path = "addJoueur", method = RequestMethod.POST)
    public Joueur createJoueur(@RequestBody Joueur a) {
        return joueurService.saveJoueur(a);
    }

    @RequestMapping(path = "/updateJoueur", method = RequestMethod.PUT)
    public Joueur updateJoueur(@RequestBody Joueur a) {
        return joueurService.updateJoueur(a);
    }

    @RequestMapping(value = "/deleteJoueur/{id}", method = RequestMethod.DELETE)
    public void deleteJoueur(@PathVariable("id") Long id) {
        joueurService.deleteJoueurById(id);
    }

    @RequestMapping(value = "/equipe/{idEquipe}", method = RequestMethod.GET)
    public List<Joueur> getJoueursByEquipe(@PathVariable("idEquipe") Long idEquipe) {
        return joueurService.findByEquipeIdEquipe(idEquipe);
    }
}
