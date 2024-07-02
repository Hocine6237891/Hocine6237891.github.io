public class Vehicule {
    String marque ;
    int vitesse ;
    int capacite ;
 static int vitesseA = 0;
    public Vehicule(String marque , int vitesse , int capacite  ) {
        this.marque = marque ;
        this.vitesse = vitesse ;
        this.capacite = capacite ;
      vitesseA ++ ;
    }
    public Vehicule(String marque , int vitesse) {

    }
    public int getVitesse() {
        return vitesse;
    }
    public void setVitesse(int vitesse) {
        this.vitesse = vitesse ;

    }

    public void afficherVitessePlusrapide(){
        System.out.println("vitesse plus rapide " + vitesse );

    }
    // Attribut d'instance et de classe
}
