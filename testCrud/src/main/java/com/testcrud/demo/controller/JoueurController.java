package com.testcrud.demo.controller;

import com.testcrud.demo.Dao.EquipeRepository;
import com.testcrud.demo.Services.EquipeService;
import com.testcrud.demo.Services.JoueurService;
import com.testcrud.demo.entity.Joueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joueur")
public class JoueurController {
    @Autowired
    private JoueurService joueurService;


    @DeleteMapping("{nom}")
    public String deleteJoueur(@PathVariable String nom){
            joueurService.supprimerJoueur(nom);
            return "supprimer";
    }
    @PostMapping
    public Joueur ajouterJoueur(@RequestBody Joueur j){
        return joueurService.ajouterJ(j);
    }
    @GetMapping
    public List<Joueur> afficherjoueur(){
        return joueurService.affichier();
    }
    @GetMapping("{id}")
    public Joueur afficherJ(@PathVariable Long id){
        return joueurService.afficherJoueur(id);
    }

    @PutMapping("{nom}/{num}")
    public String modifierJ(@PathVariable String nom,@PathVariable int num)
    {
        joueurService.modifier(nom,num);
        return "modifier";

    }


}
