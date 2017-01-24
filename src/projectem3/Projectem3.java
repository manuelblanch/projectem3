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
    private static boolean home;
    private static char esSSD;
    private static boolean SSD;
    private static String memoria;
    private static Memoria[] array=new Memoria[MAX_MEMORIES];
    
    public static void main(String[] args){
        // Array on guardem informació de les memòries
        //Scanner ent = new Scanner(System.in);
        
        Memoria[] array=new Memoria[MAX_MEMORIES];
        
        for (int i = 0; i < array.length; i++) {
            array[i]=new Memoria();
        }
        
        for (int i = 0; i < array.length; i++){
            array[i]= new Memoria();
            array[i].setOmplit(false);
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
       
        do {
            System.out.println("\n\nMenú de l'aplicació.");
            System.out.println("0. Sortir.");
            System.out.println("1. Introduïr memòria.");
            System.out.println("2. Modificar memòria.");
            System.out.println("3. Borrar memòria.");
            System.out.println("4. Llistar memòries.");
            System.out.println("5. Recuperar memòria borrada.");
            switch (opcio = ent.skip("[\r\n]*").nextInt()) {
                case 0:                             //0. Sortir
                    System.out.println("Adéu!!");
                    break;
                case 1:                             //1. Introduïr pilot
                    if (!omplit) {
                        System.out.println("\nMemoria:");
                        tipus = ent.skip("[\r\n]*").nextLine();
                        System.out.println("Tipus:");
                        preu = ent.skip("[\r\n]*").nextInt();
                        System.out.println("Preu:");
                       
                        char esHome;
                        do {
                            System.out.println("SSD o HD:");
                            esSSD = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (esSSD != 'S' && esSSD != 'H');
                        SSD = (esSSD == 'H');     //si esHome conté la 'H' home serà true i sinó false. Fa el mateix que un if_else però és molt més curt
                        omplit = true;
                    } else {
                        System.out.println("\nNo hi ha memories per omplir, si vols primer borra'n.");
                    }
                    break;
                case 2:                             //2. Modificar memòria
                    if (omplit) {
                        char siNo;
                        do {
                            System.out.println("\nVols vore la memòria?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            System.out.println("\nMemoria: "+tipus);
                            System.out.println("Marcal: "+marca);
                            System.out.println("Preu: "+preu);
                            if(home) System.out.println("És SSD");
                            else System.out.println("És HD");
                      }     

                        do {
                            System.out.println("\nVols modificar la memoria?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            
                            System.out.println("\nMarca: "+marca);
                            do {
                                System.out.println("\nVols modificar la marca?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S'){
                                System.out.print("Nova memoria: ");
                                tipus = ent.skip("[\r\n]*").nextLine();
                            }

                            System.out.println("\nMarca: "+marca);
                            do {
                                System.out.println("\nVols modificar la marca?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S'){
                                System.out.print("Nou preul: ");
                                preu = ent.skip("[\r\n]*").nextInt();
                            }

                            System.out.println("\nPreu: "+preu);
                            do {
                                System.out.println("\nVols modificar el preu?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S'){
                                System.out.print("Preu modificat: ");
                                preu = (int) ent.skip("[\r\n]*").nextDouble();
                            }

                            if(SSD) System.out.println("\nÉsSSD");
                            else System.out.println("\nÉs HD");
                            do {
                                System.out.println("\nVols modificar el sistema?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S'){
                                char esSSD;
                                do {
                                    System.out.println("És SSD o HD?(H/D):");
                                    esSSD = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                                } while (esSSD != 'H' && esSSD != 'D');
                                SSD = (esSSD == 'H');     //si esHome conté la 'H' home serà true i sinó false. Fa el mateix que un if_else però és molt més curt
                                System.out.print("Nou model: ");
                                if(SSD) System.out.println("SSD");
                                else System.out.println("HD");
                            }

                            System.out.println("Memoria modificada correctament.");
                        } else System.out.println("Memoria no modificada.");  
                        
                    } else {
                        System.out.println("\nNo hi ha memories per modificar, si vols primer crea'n.");
                    }
                    break;
                case 3:                                     //3. Borrar memoria
                    if (omplit) {
                        char siNo;
                        do {
                            System.out.println("\nVols vorela memòria?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            System.out.println("\nMemoria: "+memoria);
                            System.out.println("Tipusl: "+tipus);
                            System.out.println("Preu: "+preu);
                            if(SSD) System.out.println("És SSD");
                            else System.out.println("És HD");
                        }     

                        do {
                            System.out.println("\nVols borrar la memoria?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            omplit = false;       
                            System.out.println("Memoria borrada correctament.");
                        } else System.out.println("Memoria no borrada.");  
                        
                    } else {
                        System.out.println("\nNo hi ha memories per borrar, si vols primer crea'n.");
                    }
                    break;
                case 4:                                     //4. Llistar memories
                    if (omplit) {
                        System.out.println("\nMemoria: "+memoria);
                        System.out.println("Tipus: "+tipus);
                        System.out.println("Preu : "+preu);                        
                        if(SSD) System.out.println("És SSD");
                        else System.out.println("És HD");
                    } else {
                        System.out.println("\nNo hi ha memories per mostrar, si vols primer crea'n.");
                    }                    
                    break;
                case 5:                                     //5. Recuperar memoria borrada
                    
                    if (!omplit) {

                        char siNo;
                        do {
                            System.out.println("\nVols vore la memoria?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            System.out.println("\nMemoria: "+memoria);
                            System.out.println("Tipus: "+tipus);
                            System.out.println("Preu:: "+preu);
                            if(SSD) System.out.println("És SSD");
                            else System.out.println("És HD");
                       }     

                        do {
                            System.out.println("\nVols recuperar la memoria?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            omplit = true;       
                            System.out.println("Memoria recuperada correctament.");
                        } else System.out.println("Memoria no recuperada.");  
                        
                    } else {
                        System.out.println("\nNo hi ha memoria per recuperar, si vols primer borra'n.");
                    }

                    break;
                default:
                    System.out.println("\nOpció incorrecta!!");
            }
        } while (opcio != 0);

    }

}

