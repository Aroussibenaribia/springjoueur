package com.aroussi.joueurs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    private String equipeName;
    private String equipeFounder;
    private String equipeCountry;

    @OneToMany(mappedBy = "equipe")
    @JsonIgnore
    private List<Joueur> joueurs;
}
