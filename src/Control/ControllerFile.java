/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Iris;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

/**
 *
 * @author zelen
 */
public class ControllerFile {
    static File file = null;
    int line = 0;

   
    public File openFile() throws IOException {
        String pastainicial = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(pastainicial);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
        }
        return file;
    }
    
    
    public Iris readLabeledFile(int n) throws IOException {
        BufferedReader entrada = null;
        entrada = new BufferedReader(new FileReader(file));
        Iris i = new Iris();
        int nLine = 0;
        //comeca no 1 e pula todas as linhas até a linha n
        for (nLine=0; nLine<n;nLine++){
            String pula = entrada.readLine();
        }
        String line = entrada.readLine();
        StringTokenizer st  = new StringTokenizer(line,",");
            
        while (st.hasMoreTokens()){
            i.setLargPetala(parseDouble(st.nextToken()));
            i.setAltPetala(parseDouble(st.nextToken()));
            i.setLargSepala(parseDouble(st.nextToken()));
            i.setAltSepala(parseDouble(st.nextToken()));
            i.setLabel(st.nextToken());
        }
         
        entrada.close();
        
        return i;
    }
    
    public Iris readUnlabeledFile(int n) throws IOException {
        BufferedReader entrada = null;
        entrada = new BufferedReader(new FileReader(file));
        Iris i = new Iris();
        int nLine = 0;
        //comeca no 1 e pula todas as linhas até a linha n
        for (nLine=0; nLine<n;nLine++){
            String pula = entrada.readLine();
        }
        String line = entrada.readLine();
        StringTokenizer st  = new StringTokenizer(line,",");
            
        while (st.hasMoreTokens()){
            i.setLargPetala(parseDouble(st.nextToken()));
            i.setAltPetala(parseDouble(st.nextToken()));
            i.setLargSepala(parseDouble(st.nextToken()));
            i.setAltSepala(parseDouble(st.nextToken()));
        }
        i.setLabel("none");
         
        entrada.close();
        
        return i;
    }
    
        
    //retorna quantas linhas o arquivo file contem
    public int countLines() throws IOException {
        BufferedReader entrada = null;
        entrada = new BufferedReader(new FileReader(file));
        int count = 0;
        
        while (entrada.ready()) {
            String line = entrada.readLine();
            count++;
           
        }
        
        entrada.close();
        return count;
    }

    
    
}
