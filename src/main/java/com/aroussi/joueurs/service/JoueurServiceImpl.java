package com.aroussi.joueurs.service;

import com.aroussi.joueurs.entities.Joueur;
import com.aroussi.joueurs.entities.Equipe;
import com.aroussi.joueurs.repos.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoueurServiceImpl implements JoueurService {
    @Autowired
    JoueurRepository joueurRepository;

    @Override
    public Joueur saveJoueur(Joueur a) {
        return joueurRepository.save(a);
    }

    @Override
    public Joueur updateJoueur(Joueur a) {
        return joueurRepository.save(a);
    }

    @Override
    public void deleteJoueur(Joueur a) {
        joueurRepository.delete(a);
    }

    @Override
    public void deleteJoueurById(Long id) {
        joueurRepository.deleteById(id);
    }

    @Override
    public Joueur getJoueur(Long id) {
        return joueurRepository.findById(id).get();
    }

    @Override
    public List<Joueur> getAllJoueurs() {
        return joueurRepository.findAll();
    }

    // Methods From JoueurRepository

    @Override
    public List<Joueur> findByTitle(String title) {
        return joueurRepository.findByTitle(title);
    }

    @Override
    public List<Joueur> findByTitleContains(String title) {
        return joueurRepository.findByTitleContains(title);
    }

    @Override
    public List<Joueur> findByPrenomJoueur(String prenomJoueur) {
        return joueurRepository.findByPrenomJoueur(prenomJoueur);
    }

    @Override
    public List<Joueur> findByEquipe(Equipe equipe) {
        return joueurRepository.findByEquipe(equipe);
    }

    @Override
    public List<Joueur> findByEquipeIdEquipe(Long id) {
        return joueurRepository.findByEquipeIdEquipe(id);
    }

    @Override
    public List<Joueur> findByOrderByTitleAsc() {
        return joueurRepository.findByOrderByTitleAsc();
    }

    @Override
    public List<Joueur> sortByTitleAndPrenomJoueur() {
        return joueurRepository.sortByTitleAndPrenomJoueur();
    }
}

