

public class Tableau {
    public static void main(String[] args) {


        int[] tbl2 = {0, 6, 7, 8, 9, 0};
        int[] tbl3 = {1, 2, 3, 4, 5};
        System.out.println(verifierTableau(tbl2, tbl3));

        int[] tbl = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("la somme est " + tableauCa(tbl));
        int[] tableau2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(nbPaire(tableau2));

    }


    public static int tableauCa(int[] tableau) {

        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

    public static int nbPaire(int[] tableau) {
        int somme = 0;
        for (int element : tableau) {
            if (element % 2 == 0) {
                somme++;
            }
        }
        return somme;
    }

    public static int[] tableauInverse(int[] tableau) {
        int[] tableauI = new int[tableau.length];
        int j = 0;
        for (int i = tableau.length; i >= 1; i++) {
            tableauI[j] = tableau[i];
        }
        return tableauI;
    }

    public static boolean verifierTableau(int[] tableau1, int[] tableau2) {
        boolean retour = false;
        for (int i = 0; i < tableau1.length; i++) {
            if (tableau1.length == tableau2.length) {
                retour = true;
            }
            if (tableau1[i] == tableau2[i]) {
                retour = true;
            }

        }
        return retour;
    }

    public static int occurenceN(int[] tableau, int entier) {
        for (int i = 0; i < tableau.length; i++) {
            int compteur = 0;
            if (tableau[i] == entier) {
                compteur++;


            }
            return compteur;
        }

        return entier;
    }
}



