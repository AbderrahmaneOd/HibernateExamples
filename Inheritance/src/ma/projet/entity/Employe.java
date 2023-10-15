/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entity;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author hp
 */
@Entity
public class Employe extends Personne {
    private Double salaire;

    public Employe() {
    }

    public Employe(Double salaire, String nom, String prenom, String telephone, String adresse, Date dateNaissance) {
        super(nom, prenom, telephone, adresse, dateNaissance);
        this.salaire = salaire;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }
    
    
    
}
