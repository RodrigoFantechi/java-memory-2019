import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Memory1 {


    public static void main(String[] args) {

        ArrayList<Integer> mazzoDiCarte = new ArrayList(16);

        for (int i = 0; i < 8; i++) {
            mazzoDiCarte.add (i);
            mazzoDiCarte.add (i);
        }

        Collections.shuffle(mazzoDiCarte);

        carta matrice[][] = new carta[4][4];
        int contatore=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrice[i][j] = new carta(mazzoDiCarte.get(contatore).toString(), false, false);

                contatore++;
            }
        }


        do {



            condizioneVittoria(matrice);

        } while (controllocarte(matrice)==false);



    }

    public static void condizioneVittoria(carta[][] pippo) {

        Scanner posizione1 = new Scanner (System.in);
        int i = posizione1.nextInt();

        Scanner posizione2 = new Scanner (System.in);
        int j = posizione2.nextInt();


        Scanner posizione3 = new Scanner (System.in);
        int k = posizione1.nextInt();
        Scanner posizione4 = new Scanner (System.in);
        int l = posizione2.nextInt();

        if ((pippo[i][j] == pippo[k][l] && i != k && j != l)) {
                            pippo[i][j].setSelected(true);
                            pippo[k][l].setSelected(true);
                            System.out.print("azzeccato");
                        }else{
            pippo[i][j].setSelected(false);
            pippo[k][l].setSelected(false);
            System.out.print("sbagliato");

        }
                    }

    public static boolean controllocarte(carta[][] pippo) {
        for (int i = 0; i < pippo.length; i++) {
            for (int j = 0; j < pippo.length; j++) {
                if (pippo[i][j].getSelected()==true){
                    return true;
                }
            }
        }return false;


    }
    }




