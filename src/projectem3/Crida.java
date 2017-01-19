/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectem3;

/**
 *
 * @author manuel
 */public class Crida {
    



public static void main(String[] args){
    
    Metodes.ubicacioDins();
    Metodes.ubicacioDins(0F);
    Metodes.ubicacioDIns(0);
    Metodes.ubicacioDins(0, 2);
    Metodes.ubicacioDins(0, 2F);
    Metodes objecte=new Metodes();
    new Metodes().ubicacioDinsNoEstatic();
    objecte.ubicacioDinsNoEstatic();
    
    //si fem control space tambe podem accedir als esatics.
    //als estatics nomes podem acedir instanciant objectes de la mateixa clase
    
}


}