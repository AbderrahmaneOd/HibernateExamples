/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.test;

import java.util.Date;
import java.util.List;
import ma.project.entity.Produit;
import ma.project.service.ProduitService;

/**
 *
 * @author hp
 */
public class Test {
    
    public static void main (String[] args){
       ProduitService produitService = new ProduitService();
        
        produitService.create(new Produit("marque","ref00",new Date(),197.90,"disignation"));
        produitService.create(new Produit("marque","ref01",new Date(),20.99,"disignation"));
        produitService.create(new Produit("marque","ref02",new Date(),5,"disignation"));
        produitService.create(new Produit("marque","ref04",new Date(),125,"disignation"));
        produitService.create(new Produit("marque","ref04",new Date(),900.77,"disignation"));
        
//        List<Produit> produits = produitService.findAll();
//        
//        for(Produit produit:produits) System.out.println(produit);
//        
//        System.out.println("les informations du produit dont id = 2 : ");
//        Produit produit = produitService.findById(2);
//        System.out.println("Marque : " + produit.getMarque() + " Prix : " + produit.getPrix());
//        
//        System.out.println("la liste des produits dont le prix est supérieur à 100 DH : ");
//        produits = produitService.getProduitsPrixSuperieur(100);
//        for(Produit p:produits) System.out.println(p.getPrix()); 
        
               
    }
}
