/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.entity.Employe;
import ma.projet.entity.Etudiant;
import ma.projet.service.PersonneService;

/**
 *
 * @author hp
 */
public class Test {
    
    public static void main(String[] args){
        
        PersonneService personneService = new PersonneService();
        
        personneService.create(new Employe(5000.0,"nom","prenom","telephone","adresse", new Date()));
        personneService.create(new Etudiant("R120","nom","prenom","telephone","adresse", new Date()));   
    }
}
