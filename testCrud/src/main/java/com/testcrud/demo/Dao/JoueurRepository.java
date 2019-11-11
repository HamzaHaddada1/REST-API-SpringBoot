package com.testcrud.demo.Dao;

import com.testcrud.demo.entity.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepository extends JpaRepository<Joueur,Long> {

Joueur findByNom(String nom);
    void deleteByNom(String nom);

}
