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

    public static final int MAX_MEMORIES = 2;
    //private static boolean home;
    //private static char esSSD;
    //private static boolean SSD;
    //private static String memoria;
    private static Memoria[] array = new Memoria[MAX_MEMORIES];
    //private static char siNo;
    private static int opcio;

    public static void main(String[] args) {

        
        inicialitzarVariables();
        do {
            demanarOpcio();
            tractarOpcio();
        } while (!opcioFinal());

}
    

    public static void inicialitzarVariables() {

        for (int i = 0; i < array.length; i++) {
            array[i] = new Memoria();
            array[i].setOmplit(false);
}

    }

    public static void demanarOpcio() {
        
        Scanner ent = new Scanner(System.in);

        System.out.println("\n\nMenú de l'aplicació.");
        System.out.println("0. Sortir.");
        System.out.println("1. Introduïr memoria.");
        System.out.println("2. Modificar memoria.");
        System.out.println("3. Borrar memoria.");
        System.out.println("4. Llistar memories.");
        System.out.println("5. Recuperar memoria borrada.");
        opcio = ent.skip("[\r\n]*").nextInt();

    }

    public static void tractarOpcio() {

        switch (opcio) {
            case 0:                             //0. Sortir
                System.out.println("Has sortit de l'aplicació de forma correcta!!");
                break;
            case 1:                             //1. Introduïr memoria
                introduirMemoria();
                break;
            case 2:                             //2. Modificar memoria
                modificarMemoria();
                break;
            case 3:                                     //3. Borrar memoria
                borrarMemoria();
                break;
            case 4:                                     //4. Llistar memories
                llistarMemories();
                break;
            case 5:                                     //5. Recuperar memoria borrada
                recuperarMemoria();
                break;
            default:
                System.out.println("\nOpció incorrecta!!");
        }

    }

    public static boolean opcioFinal() {
        return opcio == 0;
    }

    public static void introduirMemoria() {

        Scanner ent = new Scanner(System.in);

        int i;
        for (i = 0; i < array.length && array[i].isOmplit(); i++);
        //Si no hem arribat al final és per que hem trobat una casella buida (no omplida)
        if (i < array.length) {
            System.out.println("\nMarca:");
            array[i].setMarca(ent.skip("[\r\n]*").nextLine());
            System.out.println("Tipus:");
            array[i].setTipus(ent.skip("[\r\n]*").nextLine());
            System.out.println("Preu:");
            array[i].setPreu(ent.skip("[\r\n]*").nextDouble());

            char isSSD;
            do {
                System.out.println("És SSD o HD?(S/H):");
                isSSD = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                //per tant només haurem de tractar les lletres majúscules
            } while (isSSD != 'H' &&  isSSD != 'S');
            array[i].setSsd(isSSD == 'S');     //si esSSD conté la 'S' SSD serà true i sinó false. Fa el mateix que un if_else però és molt més curt
            array[i].setOmplit(true);
        } else {
            System.out.println("\nNo hi caben més memories, si vols, primer borra algunes de elles.");
        }

    }

    public static void modificarMemoria() {

        Scanner ent = new Scanner(System.in);
        //Primer recorrem l'array buscant caselles omplides i preguntant quina volem modificar
        char siNo = 'N';
        int cont = 1, i;
        for (i = 0; i < array.length && siNo != 'S' && siNo != 'F'; i++) {
            if (array[i].isOmplit()) {
                System.out.format("\nMemoria %d:\n", cont++);
                System.out.println(array[i].toString());
                do {
                    System.out.println("\nVols modificar la memoria(S/N) o finalitzar la cerca (F)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
            }
            if (siNo == 'S') {
                break;
            }
        }
        //Si l'usuari ha contestat que sí és que ha triat un pilot per modificar    
        if (siNo == 'S') {

            System.out.println("\nMarca: " + array[i].getMarca());
            do {
                System.out.println("\nVols modificar la marca?(S/N):");
                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nova marca: ");
                array[i].setMarca(ent.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nTipus: " + array[i].getTipus());
            do {
                System.out.println("\nVols modificar el tipus de disc?(S/N):");
                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nou tipusl: ");
                array[i].setTipus(ent.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nPreu: " + array[i].getPreu());
            do {
                System.out.println("\nVols modificar el preu?(S/N):");
                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nou preu afegit: ");
                array[i].setPreu(ent.skip("[\r\n]*").nextDouble());
            }

            if (array[i].isSsd()) {
                System.out.println("\nÉs SSD");
            } else {
                System.out.println("\nÉs HD");
            }
            do {
                System.out.println("\nVols modificar el sistema de disc?(S/N):");
                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                char esSSD;
                do {
                    System.out.println("És SSD o HD?(SSD/HD):");
                    esSSD = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esSSD != 'S' && esSSD != 'H');
                array[i].setSsd(esSSD == 'S');     //
                System.out.print("Nou gènere: ");
                if (array[i].isSsd()) {
                    System.out.println("SSD");
                } else {
                    System.out.println("HD");
                }
            }

            System.out.println("Memoria modificada correctament.");

        } else {
            System.out.println("\nNo hi ha memories per modificar, o no n'has triat cap per modificar.");
}

    }

    public static void borrarMemoria() {

         Memoria m = null;   //Apuntem a la memòria
        Scanner ent = new Scanner(System.in);
        char siNo = 'N';
        int i;
        for (i = 0; i < array.length && siNo != 'F'; i++) {
            m = array[i];
            if (m.isOmplit()) {
                System.out.println(m);
                do {
                    System.out.println("\nVols borrar la memoria(S/N) o finalitzar la cerca (F)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
            }
            if (siNo == 'S') {
                break;
            }
        }

        if (siNo == 'S') {
            m.setOmplit(false);
            System.out.println("Memoria borrada correctament.");

        } else {
            System.out.println("\nNo s'ha borrat cap Memoria.");
}

    }

    public static void llistarMemories() {

       Scanner ent = new Scanner(System.in);

        boolean algun = false;
        char siNo = 'S';
        int i;
        for (i = 0; i < array.length; i++) {
           Memoria m = array[i];
            if (m.isOmplit()) {
                algun = true;
                System.out.println(m);
                do {
                    System.out.println("\nVols vore més memories(S/N)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N');
            }
            if (siNo == 'N') {
                break;
            }
        }
        if (!algun) {
            System.out.println("\nNo hi ha memories per mostrar, si vols, primer crea'n.");
}

    }

    public static void recuperarMemoria() {

        Scanner ent = new Scanner(System.in);
        //Primer recorrem l'array buscant caselles buides i preguntant quina volem recuperar
        char siNo = 'N';
        int cont = 0, i;
        for (i = 0; i < array.length && siNo != 'S' && siNo != 'F'; i++) {
            if (!array[i].isOmplit()) {
                System.out.format("\nMemoria %d:\n", ++cont);
                System.out.println(array[i].toString());
                do {
                    System.out.println("\nVols recuperar la memoria(S/N) o finalitzar la cerca (F)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
            }
            if (siNo == 'S') {
                break;
            }
        }
        //Si l'usuari ha contestat que sí és que ha triat un pilot per modificar    
        if (siNo == 'S') {
            array[i].setOmplit(true);
            System.out.println("Memoria recuperada correctament.");
        } else {
            if (cont == 0) {
                System.out.println("No hi ha memories per recuperat.");
            } else {
                System.out.println("Memoria no recuperada.");
            }
        }

    }



}
