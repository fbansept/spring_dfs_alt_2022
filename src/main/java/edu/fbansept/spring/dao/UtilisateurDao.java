package edu.fbansept.spring.dao;

import edu.fbansept.spring.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer> {

    Utilisateur findByPseudo(String pseudo);
}
