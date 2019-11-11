package com.testcrud.demo.controller;

import com.testcrud.demo.Services.EquipeService;
import com.testcrud.demo.entity.Equipe;
import com.testcrud.demo.entity.Joueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/equipe")
public class EquipeController {

    @Autowired
    private EquipeService equipeService;

    @PostMapping
    public String ajouterEquipe(@RequestBody Equipe e){
        equipeService.ajouterEquipe(e);
        return "ajouter";

    }
    @GetMapping("{id}")
    public Equipe afficher(@PathVariable Long id){
        return equipeService.afficherEquipe(id);
    }
    @PutMapping("{nom}/{date}")
    public void modifier(@PathVariable String nom, @PathVariable String date) throws Exception{
        DateFormat formatteur=new SimpleDateFormat();
        Date d=(Date)formatteur.parse(date);
        equipeService.modifier(nom,d);
    }
    @DeleteMapping("{nom}")
    public String supprimerEquipe(@PathVariable String nom)
    {
        equipeService.supprimerEquipe(nom);
        return "supprimer";
    }



}
