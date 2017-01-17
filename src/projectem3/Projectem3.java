/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectem3;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Projectem3 {

    public static final int MAX_MEMORIES=2;
    
    
    public static void main(String[] args){
        // Array on guardem informació de les memòries
        
        Memoria[] array=new Memoria[MAX_MEMORIES];
        
        for (int i = 0; i < array.length; i++) {
            array[i]=new Memoria();
        }
        
        int i = 0;
        String s=new String("");s="";
        
        Memoria HDSata=new Memoria();
        HDSata.setTipus("Seagate");
        array[0]=new Memoria();
        array[0].setTipus("Western");
        array[0].setPreu(200);
        array[0].setSsd(false);
        array[0].setOmplit(true);
        
        System.out.println(array[0]);
        //System.out.println("La memòria" +HDSata.getTipus()+" val" +HDSata.getPreu());
        System.out.println("La memòria" +array[0].getTipus()+" val" +HDSata.getPreu());
        String n=array[1].getTipus();
        System.out.println();
        
        
        
        System.exit(0);
        
        //Les meves propietats
        String tipus = null;
        String marca = null;
        int preu = 0;
        boolean ssd = false;
        boolean omplit = false;
        
        
        Scanner ent = new Scanner(System.in);
        int opcio;
        
        /*
        do {
            System.out.println("\n\nMenú de l'aplicació.");
            System.out.println("0. Sortir.");
            System.out.println("1. Introduïr memoria.");
            System.out.println("2. Introduir tipus ");
            System.out.println("3. Modificar memoria.");
            System.out.println("4. Borrar memoria.");
            System.out.println("5. Llistar memoria.");
            System.out.println("6. Recuperar memoria borrada.");
    */
}
        }

