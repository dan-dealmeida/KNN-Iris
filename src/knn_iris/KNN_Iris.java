/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package knn_iris;
import Control.ControllerFile;
import Model.Classification;
import Model.EuclideanDist;
import Model.Iris;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zelen
 */
public class KNN_Iris {
    
    
    public static void main(String[] args) throws IOException {
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int sizeK = 6;//k closest values
        String newLabel = "";
        double[] values;
        values = new double[sizeK];
        int[] indexList;
        indexList = new int[sizeK];
        double distance = 0;
        EuclideanDist dist = new EuclideanDist();
        Classification classification = new Classification();
        
        
        //assign labeled file list from .txt file
        ControllerFile labeledFile = new ControllerFile();
        labeledFile.openFile();
        int linesInLabeled = labeledFile.countLines();
        
        List<Iris> labeledList;
        labeledList = new ArrayList<>();
        
        for (count = 0;count<linesInLabeled;count++){
            labeledList.add(labeledFile.readLabeledFile(count));
        }
        
        
        //assign unlabeled list of Irises from .txt file
        ControllerFile unlabeledFile = new ControllerFile();
        unlabeledFile.openFile();
        int linesInUnlabeled = unlabeledFile.countLines();
        
        List<Iris> unlabeledList;
        unlabeledList = new ArrayList<>();
        
        for (count = 0;count<linesInUnlabeled;count++){
            
            unlabeledList.add(unlabeledFile.readUnlabeledFile(count));
        }
        
        
        
        //make all element in values array big
        for(i = 0; i <sizeK;i++){
            values[i] = 100;
        }
        //compare distances between elements on unlabeled list and elements in labeled list
        for (i = 0;i<linesInUnlabeled;i++){
            for (j = 0;j<linesInLabeled;j++){
                distance = dist.dist4(labeledList.get(j), unlabeledList.get(i));
                for (k = 0; k < sizeK; k++){
                    if(values[k] > distance){
                        values[k] = distance;
                        indexList[k] = j;// list of k closest indexes
                        break;
                                        
                    }
                }
            
            }
            //assign coutLabels to label of unlabeledList[i]
            
            newLabel = classification.countLabels(indexList, labeledList);
            unlabeledList.get(i).setLabel(newLabel);
        }
        
        
        //print list
        for(i = 0; i < unlabeledList.size();i++){
            System.out.println("getLargPetala " + i + ":" + unlabeledList.get(i).getLargPetala());
            System.out.println("getAltPetala " + i + ":" + unlabeledList.get(i).getAltPetala());
            System.out.println("getAltSepala " + i + ":" + unlabeledList.get(i).getAltSepala());
            System.out.println("getLargSepala " + i + ":" + unlabeledList.get(i).getLargSepala());
            System.out.println("label of " + i + ":" + unlabeledList.get(i).getLabel());
            //System.out.println(labeledList.get(indexList[i]).getLabel() == label1);//index of smallest k distances
        }
       
        
        
        
        
    } 
}
