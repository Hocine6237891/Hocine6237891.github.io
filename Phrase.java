import java.util.Scanner;

public class Phrase {
    public String phraseTr() {

       final String PHRASE_1 = "Saisir une phrase ";
        Scanner scanner = new Scanner(System.in);
        System.out.println(PHRASE_1);
        String phrase = scanner.nextLine();
        String conv = phrase.replace("a" , "5") ;
                    phrase.replace("o" , "v") ;
                    phrase.replace("e" , "B");
        return conv;
    }
    public String encrypter() {


        final String PHRASE_2 = "Saisir une phrase a chiffrer ";
        final String NB_1 = "Saisir un nombre entre 1 et 25 ";
        Scanner scan = new Scanner(System.in);
              System.out.println(PHRASE_2)  ;
              System.out.println(NB_1) ;
              int nombre  = scan.nextInt();
              String mot = "";
              String phrase1 = scan.nextLine();
              char[] phraseT = phrase1.toCharArray();
              while (true) {
                  if (nombre < 1 && nombre < 25) {
                      System.out.println(PHRASE_2);
                  }
             try {

                  }
             catch (NumberFormatException e) {}

              }

    }
    public static void main(String[] args){
        Phrase phrase = new Phrase();
        phrase.phraseTr();
    }


        }


