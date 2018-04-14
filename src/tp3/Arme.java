/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author Ouadie
 */
public class Arme {

private String nom;
private int dommage;

    public Arme(String nom, int dommage) {
        this.nom = nom;
        this.dommage = dommage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDommage() {
        return dommage;
    }

    public void setDommage(int dommage) {
        this.dommage = dommage;
    }



}