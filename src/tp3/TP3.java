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
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Bot b1 = new Bot("Ouadie");
    b1.setniveau(3);
    b1.setArmure(100);
    b1.baisserArmure(50);
    b1.baisserSante(20);
    System.out.println(b1.toString());
    b1.augmenterArmure(10);
    b1.augmenterSante(10);
    System.out.println(b1.toString());
    Arme tabArm[]= new Arme[8];
    tabArm[2]=new Arme("fusil",75);
    tabArm[3]= new Arme("roquette",80);
    tabArm[4]= new Arme("explosif",80);
        
    }
    
}
