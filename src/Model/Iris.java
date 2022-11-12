/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zelen
 */
public class Iris {
    public String label;
    private double altPetala;
    private double largPetala;
    private double altSepala;
    private double largSepala;
    
    
    
    
    //setters
    public void setLabel(String l){
        this.label = l;
    }
    public void setAltPetala(double n){
        this.altPetala = n;
    }
    public void setLargPetala(double n){
        this.largPetala = n;
    }
    public void setAltSepala(double n){
        this.altSepala = n;
    }
    public void setLargSepala(double n){
        this.largSepala = n;
    }
    
    //getters
    public String getLabel(){
        return label;
    }
    public double getAltPetala(){
        return altPetala;
    }
    public double getLargPetala(){
        return largPetala;
    }
    public double getAltSepala(){
        return altSepala;
    }
    public double getLargSepala(){
        return largSepala; 
        
    }
    
    
}
