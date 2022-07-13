package edu.fbansept.spring.controllers;

import edu.fbansept.spring.dao.UtilisateurDao;
import edu.fbansept.spring.models.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UtilisateurController {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @GetMapping("/liste-utilisateur")
    public List<Utilisateur> getListUtilisateur() {

        List<Utilisateur> listeUtilisateur = utilisateurDao.findAll();

        return listeUtilisateur;
    }

    @GetMapping("/utilisateur/{id}")
    public ResponseEntity<Utilisateur> getUtilisateur(@PathVariable int id){

        Optional<Utilisateur> utilisateur = utilisateurDao.findById(id);

        if(utilisateur.isPresent()){
            return ResponseEntity.ok(utilisateur.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/utilisateur")
    public ResponseEntity<Utilisateur> createUtilisateur(@RequestBody Utilisateur utilisateur){
        utilisateurDao.save(utilisateur);

        return ResponseEntity.status(HttpStatus.CREATED).body(utilisateur);
    }

    @DeleteMapping("/utilisateur/{id}")
    public ResponseEntity<Utilisateur> deleteUtilisateur(@PathVariable int id) {

        Optional<Utilisateur> utilisateurAsupprimer = utilisateurDao.findById(id);

        if(utilisateurAsupprimer.isPresent()) {
            utilisateurDao.deleteById(id);
            return ResponseEntity.ok(utilisateurAsupprimer.get());
        }

        return ResponseEntity.notFound().build();
    }

}
