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
   
    File archivo = new File("src/ceni100ta/datos");
    Scanner entrada = new Scanner(archivo);
    
    int numBailes=0;
    int segundosHastaBaile=0;
    int segundosTareaHastaBaile=0;
    int diasNumHasta=0, horasNumHasta=0, minutosNumHasta=0, segundosNumHasta=0;
    int horasTarea, minutosTarea, segundosTarea;
    int totalTiempoTareas=0;
    String lineaArchivo="";
    String diasHasta, horasHasta, minutosHasta, segundosHasta;
    Scanner lineaTareas;
    
    
    
    numBailes=entrada.nextInt();
    entrada.nextLine();
    
    for (int i=1; i<=numBailes; i++){
        
        lineaArchivo=entrada.nextLine ();
        
        diasHasta=lineaArchivo.substring (0,2);
        diasNumHasta = Integer.parseInt (diasHasta);
        horasHasta=lineaArchivo.substring (3,5);
        horasNumHasta= Integer.parseInt(horasHasta);
        minutosHasta=lineaArchivo.substring (6,8);
        minutosNumHasta= Integer.parseInt(minutosHasta);
        segundosHasta=lineaArchivo.substring (9,11);
        segundosNumHasta=Integer.parseInt(segundosHasta);
    
        segundosHastaBaile= (diasNumHasta*24*60*60)
                            +(horasNumHasta*60*60)
                            +(minutosNumHasta*60)
                            +segundosNumHasta;
        
        lineaArchivo=entrada.nextLine();
        lineaTareas=new Scanner(lineaArchivo);
        lineaTareas.useDelimiter("[:\\s]");
        
        while (lineaTareas.hasNext()){
            horasTarea=lineaTareas.nextInt();
            minutosTarea=lineaTareas.nextInt();
            segundosTarea=lineaTareas.nextInt();
            totalTiempoTareas=totalTiempoTareas+
                    (horasTarea*60*60)+
                    (minutosTarea*60)+
                    segundosTarea;
        }
       if (segundosHastaBaile > totalTiempoTareas){
           System.out.println ("Cenicienta puede ir al baile :)");
       }
       else {
           System.out.println ("Cenicienta no puede ir al baile :( ");
       }
    }
    }//fin1
}//fin2
    

