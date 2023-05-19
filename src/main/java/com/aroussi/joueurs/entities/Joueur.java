package com.aroussi.joueurs.entities;

import jakarta.persistence.*;

import lombok.*;

import java.util.Date;
import java.util.Date;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Joueur {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idJoueur;
    private String title;
    private String nomJoueur;
    private String prenomJoueur;
    private Date dateInscrit;
    @ManyToOne
    private Equipe equipe;
    @OneToOne
    private Image image;

    /*public Joueur() {
        super();
    }

    public Joueur(String title, String nomJoueur, String prenomJoueur, Date dateInscrit) {
        super();
        this.title = title;
        this.nomJoueur = nomJoueur;
        this.prenomJoueur = prenomJoueur;
        this.dateInscrit = dateInscrit;
    }

    public Long getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Long idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public String getPrenomJoueur() {
        return prenomJoueur;
    }

    public void setPrenomJoueur(String prenomJoueur) {
        this.prenomJoueur = prenomJoueur;
    }

    public Date getDateInscrit() {
        return dateInscrit;
    }

    public void setDateInscrit(Date dateInscrit) {
        this.dateInscrit = dateInscrit;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Joueurs{" +
                "idJoueur=" + idJoueur +
                ", title='" + title + '\'' +
                ", nomJoueur='" + nomJoueur + '\'' +
                ", prenomJoueur='" + prenomJoueur + '\'' +
                ", dateInscrit=" + dateInscrit +
                '}';
    }*/
}
