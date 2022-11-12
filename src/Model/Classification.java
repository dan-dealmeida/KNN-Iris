/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import java.util.Arrays;  
/**
 *
 * @author zelen
 */
public class Classification {
    private String[] labels = {"Iris-setosa", "Iris-versicolor", "Iris-virginica"}; 
    private int[] count = {0,0,0};
    private int size = 0;
    
    
    
    //receieves a list conteining indexes of k closest points and the list
    public String countLabels(int[] indexList, List<Iris> labeledList){
        int i;
        int biggest = 0;
        this.size = indexList.length;
        for(i = 0; i <size;i++){
            //gets labels and counts them
            if(labeledList.get(indexList[i]).getLabel().equals(labels[0])){
                count[0]++;
            }
            else if(labeledList.get(indexList[i]).getLabel().equals(labels[1])){
                count[1]++;
            }
            else if(labeledList.get(indexList[i]).getLabel().equals(labels[2])){
                count[2]++;
            }
            else{
                
            }
            
            
        }
        
        for (i = 0; i < 3 ; i++){//problem arround here
            if (count[i]>biggest){
                biggest = count[i];
                return labels[i];
            }
        }
        return "N/A";
    }
    
    
    
    
    
}
