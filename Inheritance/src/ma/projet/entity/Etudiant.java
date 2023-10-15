/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author hp
 */
@Entity
public class Etudiant extends Personne{
    private String cne;
    
    @OneToOne
    @JoinColumn(name = "filiere_id")
    private Filiere filiere;


    public Etudiant() {
    }

    public Etudiant(String cne, String nom, String prenom, String telephone, String adresse, Date dateNaissance) {
        super(nom, prenom, telephone, adresse, dateNaissance);
        this.cne = cne;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }
    
    
}
