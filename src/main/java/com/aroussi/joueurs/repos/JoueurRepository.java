package com.aroussi.joueurs.repos;

import com.aroussi.joueurs.entities.Joueur;
import com.aroussi.joueurs.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "rest")
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    List<Joueur> findByTitle(String title);
    List<Joueur> findByTitleContains(String title);

    @Query("select a from Joueur a where a.prenomJoueur like %?1")
    List<Joueur> findByPrenomJoueur(String prenomJoueur);

    @Query("select a from Joueur a where a.equipe = ?1")
    List<Joueur> findByEquipe(Equipe equipe);

    List<Joueur> findByEquipeIdEquipe(Long id);

    List<Joueur> findByOrderByTitleAsc();

    @Query ("select a from Joueur a order by a.title asc, a.prenomJoueur desc")
    List<Joueur> sortByTitleAndPrenomJoueur();

}
