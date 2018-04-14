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
public class Personne {
    
    
    
private String nom;
private int sante;
private int armure;
static int cp=1;
Arme tabArm []= new Arme[8];




    
    public Personne(String nom, int sante, int armure) {
        this.nom = nom;
        this.sante = sante;
        this.armure = armure;
    }



public Personne(String n) //question 1
{
        this.nom=n;
        this.armure=0;
        this.sante=100;
    }   

public Personne(){    
 this.nom="joueur"+cp++;
  this.armure=0;
    tabArm[1]= new Arme("mitraillette",10);
    tabArm[2]= new Arme("gant",20);

}

public String toString(){

    return this.getNom()+" "+"a"+" "+ this.getSante()+" "+" Santé: "+" "+"et"+" "+this.getArmure()+" "+" Armure";

}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSante(int sante) {
        this.sante = sante;
    }

    public void setArmure(int armure) {
        this.armure = armure;
    }

    public void setTabArm(Arme[] tabArm) {
        this.tabArm = tabArm;
    }


public String getNom()
{return this.nom;}

public int getSante()
{return this.sante;}

public int getArmure()
{return this.armure;}

public void augmenterSante(int s)
{ if ((getSante()+s)>=100 ) {System.out.println("votre santé est au maximum");
this.sante=100;
}
else 
    this.sante=this.sante+s;
}

public void baisserSante(int s)
{ if ((getSante()-s)<=0 ) {System.out.println("le personnage est mort");
this.sante=0;
}
else 
    this.sante=this.sante-s;
}

public void augmenterArmure(int a)
{ if ((getArmure()+a)>=100 ) {System.out.println("votre armure est au maximum");
this.sante=100;
}
else 
    this.armure=this.armure+a;
}

public void baisserArmure(int a)
{ if ((getArmure()-a)<=0 ) {System.out.println("pas d'armure");
this.armure=0;
}
else 
    this.armure=this.armure-a;
}


public void initArm(){

   
    tabArm[0]= new Arme("mitraillette",10);
    tabArm[1]= new Arme("gant",20);
    
}

public Arme ArmePlusDestruct (){

int mavaleur = 0;
int index=0;
for (int i = 0; i < tabArm.length; i++) {
if (tabArm[i].getDommage() > mavaleur)
{
mavaleur = tabArm[i].getDommage();
index=i;
}
    }

return tabArm[index];
}


}