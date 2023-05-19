package com.aroussi.joueurs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aroussi.joueurs.entities.Image;
public interface ImageRepository extends JpaRepository<Image , Long> {
}
