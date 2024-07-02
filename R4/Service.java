package R4;

import java.sql.SQLOutput;

public class Service {
    private int numeroP ;
    private String nome ;
    private String description ;
    private boolean indiceP ;
    private int prix ;

    public Service(String nom , String desccrption , boolean indiceP , int numeroP , int prix ){
        this.numeroP = numeroP;
        this.nome = nom ;
        this.description = desccrption ;
        this.indiceP = indiceP ;
 this.prix = prix ;
    }

    public double diminuerP(){
        return this.prix * 0.7 ;
    }
    public class Main {
        public static void main(String[] args) {
            Service s1 = new Service("Pomme", "bon produit" , true , 2002 , 1000);
            s1.diminuerP();
            Service s2 = new Service("Poire" , "bon produit a acheter " , false ,  2002 , 1000);
           s2.diminuerP();
            Service s3 = new Service("Tomate" , "mauvais produit" , false , 2002 , 1000);
            s3.diminuerP();
            Service s4 = new Service("orange", "Good produit" , true , 1000 , 2000);
           System.out.println("le nouveau prix " + s4.diminuerP());

        }
    }
}
