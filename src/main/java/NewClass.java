/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdon
 */
public class NewClass {
    private String nom;
    private String prenom;
    private String metier;
    private int age;
    
    public NewClass(String n){
        nom=n;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metiers) {
        this.metier = metiers;
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


}
