package com.aroussi.joueurs;

import com.aroussi.joueurs.entities.Joueur;
import com.aroussi.joueurs.entities.Equipe;
import com.aroussi.joueurs.repos.JoueurRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class JoueursApplicationTests {
	@Autowired
	private JoueurRepository joueurRepository;

	@Test
	public void testCreateJoueur() {
		Joueur joueur = new Joueur("All Eyes On Me", "Tupac Shakur", "Rap", new Date());
		joueurRepository.save(joueur);
	}

	@Test
	public void testFindJoueur() {
		Joueur joueur = joueurRepository.findById(1L).get();
		System.out.println(joueur);
	}

	@Test
	public void testUpdateJoueur() {
		Joueur joueur = joueurRepository.findById(1L).get();
		joueur.setPrenomJoueur("Progressive Rock");
		joueurRepository.save(joueur);
	}

	@Test
	public void testDeleteJoueur() {
		joueurRepository.deleteById(1L);
	}

	@Test
	public void testListJoueurs() {
		Iterable<Joueur> joueurs = joueurRepository.findAll();
		for (Joueur joueur : joueurs) {
			System.out.println(joueur);
		}
	}

	@Test
	public void testFindByTitle() {
		List<Joueur> joueurs = joueurRepository.findByTitle("The Life Of Pablo");
		for (Joueur joueur : joueurs) {
			System.out.println(joueur);
		}
	}

	@Test
	public void testFindByTitleContains() {
		List<Joueur> joueurs = joueurRepository.findByTitleContains("Pablo");
		for (Joueur joueur : joueurs) {
			System.out.println(joueur);
		}
	}

	@Test
	public void testFindByPrenomJoueur() {
		List<Joueur> joueurs = joueurRepository.findByPrenomJoueur("Hip Hop");
		for (Joueur joueur : joueurs) {
			System.out.println(joueur);
		}
	}

	@Test
	public void testFindByEquipe() {
		Equipe equipe = new Equipe();
		equipe.setIdEquipe(1L);

		List<Joueur> joueurs = joueurRepository.findByEquipe(equipe);
		for (Joueur joueur : joueurs) {
			System.out.println(joueur);
		}
	}

	@Test
	public void testFindByEquipeIdEquipe() {
		List<Joueur> joueurs = joueurRepository.findByEquipeIdEquipe(1L);
		for (Joueur joueur : joueurs) {
			System.out.println(joueur);
		}
	}

	@Test
	public void testFindByOrderByTitleAsc() {
		List<Joueur> joueurs = joueurRepository.findByOrderByTitleAsc();
		for (Joueur joueur : joueurs) {
			System.out.println(joueur);
		}
	}

	@Test
	public void testSortByTitleAndPrenomJoueur() {
		List<Joueur> joueurs = joueurRepository.sortByTitleAndPrenomJoueur();
		for (Joueur joueur : joueurs) {
			System.out.println(joueur);
		}
	}
}
