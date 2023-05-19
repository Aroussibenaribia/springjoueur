package com.aroussi.joueurs.service;

import com.aroussi.joueurs.entities.Joueur;
import com.aroussi.joueurs.entities.Equipe;

import java.util.List;

public interface JoueurService {
    Joueur saveJoueur(Joueur a);
    Joueur updateJoueur(Joueur a);
    void deleteJoueur(Joueur a);
    void deleteJoueurById(Long id);
    Joueur getJoueur(Long id);
    List<Joueur> getAllJoueurs();
    List<Joueur> findByTitle(String title);
    List<Joueur> findByTitleContains(String title);
    List<Joueur> findByPrenomJoueur(String prenomJoueur);
    List<Joueur> findByEquipe(Equipe equipe);
    List<Joueur> findByEquipeIdEquipe(Long id);
    List<Joueur> findByOrderByTitleAsc();
    List<Joueur> sortByTitleAndPrenomJoueur();
}
