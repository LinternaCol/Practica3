/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s216e18
 */
public class ReadDoc {
    File f ;
    FileReader fr ;
    BufferedReader br;
    String[] Data;
    int conta=0;
    SongClass SoCl;
    
    
    
    public void Read() throws IOException{
       
        try {
            f = new File("C:\\Users\\USUARIO\\Documents\\Cuarto\\Programacion estructurada\\Practica3\\hhgroups_merge_28_05.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr); 
            String Line;
            String regexYear1="[2][0][0-2][0-9]";
            String regexYear2="[1][9][7-9][0-9]";
            while((Line=br.readLine())!=null){
                Data = Line.split(",");
                for (int i = 0; i < Data.length; i++) {
                    if(Data[i].matches(regexYear1)|Data[i].matches(regexYear2)){
                        SoCl=new SongClass(Data[i]);
                        conta++;
                    }

                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(""+ex);
        }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
        System.out.println(""+ conta); 
    }
    
}
