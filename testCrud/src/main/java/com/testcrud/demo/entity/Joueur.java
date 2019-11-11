package com.testcrud.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String nomPasse;
    private int num_maillo;
    @ManyToOne
    private Equipe equipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomPasse() {
        return nomPasse;
    }

    public void setNomPasse(String nomPasse) {
        this.nomPasse = nomPasse;
    }

    public int getNum_maillo() {
        return num_maillo;
    }

    public void setNum_maillo(int num_maillo) {
        this.num_maillo = num_maillo;
    }
}
