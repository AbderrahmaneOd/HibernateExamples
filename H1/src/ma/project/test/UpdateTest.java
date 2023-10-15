/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.test;

import ma.project.entity.Produit;
import ma.project.service.ProduitService;

/**
 *
 * @author hp
 */
public class UpdateTest {
    public static void main(String[] args) {
        ProduitService produitService = new ProduitService();
        
        Produit produit = produitService.findById(1);
        produit.setMarque("Dell");
        
        produitService.update(produit);
    }
}
