/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zelen
 */
public class EuclideanDist {
    //pega duas iris e encontra a distancia do sfeatures euclidiana entre as duas
    
    
    //com 4 features
    public double dist4(Iris labeled, Iris i){
        double d = 0;
        double p1 = labeled.getLargPetala();
        double p2 = labeled.getAltPetala();
        double p3 = labeled.getLargSepala();
        double p4 = labeled.getAltSepala();

        double q1 = i.getLargPetala();
        double q2 = i.getAltPetala();
        double q3 = i.getLargSepala();
        double q4 = i.getAltSepala();
        
        
        d = Math.sqrt(Math.pow(p1-q1,2) + Math.pow(p2-q2,2) + Math.pow(p3-q3,2) + Math.pow(p4-q4,2));
        return d;
    }
   
}
