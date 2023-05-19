package com.aroussi.joueurs.repos;

import com.aroussi.joueurs.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

}
