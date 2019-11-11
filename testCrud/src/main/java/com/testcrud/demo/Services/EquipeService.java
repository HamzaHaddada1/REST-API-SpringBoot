package com.testcrud.demo.Services;

import com.testcrud.demo.Dao.EquipeRepository;
import com.testcrud.demo.entity.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Service
public class EquipeService {
@Autowired
    private EquipeRepository equipeRepository;

public void ajouterEquipe(Equipe e){
    equipeRepository.save(e);
}
public Equipe afficherEquipe(Long id){
    return equipeRepository.findById(id).get();
}

public void modifier(String nom , Date d){
Equipe p=equipeRepository.findByNom(nom);
  p.setDate_creation(d);
    equipeRepository.save(p);

    /*return equipeRepository.findById(id).map(user ->
            {
                e.setId(id);
                return equipeRepository.save(e);
            }
    ).orElse(
            e
    );*/
}
public void supprimerEquipe(String nom){
   equipeRepository.deleteById(equipeRepository.findByNom(nom).getId());
}
}
