package com.testcrud.demo.Services;

import com.testcrud.demo.Dao.EquipeRepository;
import com.testcrud.demo.Dao.JoueurRepository;
import com.testcrud.demo.entity.Joueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.Date;
import java.util.List;

@Service
public class JoueurService {
    @Autowired
    private JoueurRepository joueurRepository;

public void supprimerJoueur(String Nom){
   joueurRepository.deleteById(joueurRepository.findByNom(Nom).getId());

}
public Joueur ajouterJ(Joueur j){
    return joueurRepository.save(j);
}

public List<Joueur> affichier(){
    return joueurRepository.findAll();
}
public Joueur afficherJoueur(Long id){
    return joueurRepository.findById(id).get();

}
    public void modifier(String nom , int num) {
        Joueur j=joueurRepository.findByNom(nom);
        j.setNum_maillo(num);
        joueurRepository.save(j);

    }

}
