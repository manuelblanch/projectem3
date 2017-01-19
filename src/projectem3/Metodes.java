/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectem3;

/**
 *
 * @author manuel
 */
public class Metodes {
    
    //Els metodes van dins de la classe entre les claus de obertura i tancament
    // poliformisme mentre els parametres no siguen iguals podem repetir el nom del metode
    
    //Els no estatic no es poden cridar es necessita un objete
    public void ubicacioDinsNoEstatic(){
        System.out.println("Metode sense parametres no estatic");
    }
    
    public static void ubicacioDins(){
        
         System.out.println("Metode sense parametre");
        
    }
    
    public static void ubicacioDIns(int i){
        
        System.out.println("Metode amb parametre");
        
    }
    
    public static void  ubicacioDins(float i){
        
        System.out.println("Metode amb parametres float");
        
    }
    
    public static void ubicacioDins(int j, int k){
        
        System.out.println("Metode en dos parametres int");
        
    }
    
     public static void ubicacioDins(int j, float k){
        
        System.out.println("Metode en dos parametres int i un float");
        
    }
    
    public int Metode(){
        return 0;
        
    }
    
    public int MetodeCompostFormatPerTresParaules(){
        return 0;
        
    }
    
}
