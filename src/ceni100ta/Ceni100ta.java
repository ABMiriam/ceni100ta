/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceni100ta;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author miria
 */
public class Ceni100ta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
   
        File archivo = new File("src/ceni100ta/ceni100ta");
        Scanner entrada = new Scanner(archivo);
        int vueltas;
        int fbaile2= 0, fbaileT=0, fbaile=0, ftarea=0, ftareat=0;
        
        
        
        vueltas=entrada.nextInt ();
        entrada.nextLine();
        for (int i=0; i<vueltas; i++) {
        entrada.useDelimiter(":");
           //linea 1
            fbaile=entrada.nextInt();
            fbaile=fbaile*24;
            fbaileT=fbaile;
                for (int e=0; e<=3; e++){
                    
                    entrada.useDelimiter(":");
                    fbaile2=entrada.nextInt();
                        if (fbaile2<=00){
                            continue;
                        }   
                       
                    fbaile2=fbaile2*60;
                    fbaileT=fbaile2+fbaileT;
                    fbaile2=0;
                        
                }
             //linea 2
           entrada.nextLine();
            
                for (int a=0; a<3; a++) {
                    
                    ftarea=entrada.nextInt();
                    
                    ftarea=ftarea*60;
                    ftareat=ftarea+ftareat;
                }
         
                
                
         }//fin for grande
    }//fin1
}//fin2
    

