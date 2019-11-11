package com.testcrud.demo.Dao;

import com.testcrud.demo.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipeRepository  extends JpaRepository<Equipe,Long > {
Equipe findByNom(String nom);
void deleteByNom(String nom);

}
