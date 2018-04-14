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
public class Bot extends Personne {
    
    private int niveau;
    public Bot(String n)
    {
    super(n);
    this.niveau = 0;
    }
    public int getniveau()
    {return niveau;}
    public void setniveau(int n)
    {this.niveau=n;}
    
    public String toString(){
    return super.toString()+" "+" Niveau: "+" "+this.getniveau();
    }
}
    
   
