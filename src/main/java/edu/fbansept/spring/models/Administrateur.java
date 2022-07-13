package edu.fbansept.spring.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Administrateur extends Utilisateur{

    private boolean superAdministrateur;

    public boolean isSuperAdministrateur() {
        return superAdministrateur;
    }

    public void setSuperAdministrateur(boolean superAdministrateur) {
        this.superAdministrateur = superAdministrateur;
    }
}
