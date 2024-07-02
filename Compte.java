public class Compte {
    long numeroCompte ;
    String Nom ;
    String prenom ;
    double soldeCompte ;
    public long getNumeroCompte() {
        return numeroCompte;
    }

    public Compte(int numeroCompte, String nom, String prenom, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.Nom = nom;
        this.prenom = prenom;
        this.soldeCompte = soldeCompte;
    }


}
