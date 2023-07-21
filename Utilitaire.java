import java.util.ArrayList;

public class Utilitaire {
    
    public static void main(String[] args) throws Exception {
        PaquetCarte paquet = new PaquetCarte(new ArrayList<>(52));
        paquet.melangerCartes();
        /*System.out.println(paquet.toString());
        System.out.println(paquet.nbCartes());*/

        ArrayList<Carte> cartesJ1 = new ArrayList<>();
        ArrayList<Carte> cartesJ2 = new ArrayList<>();
 
        Bataille bataille = new Bataille(paquet, cartesJ1, cartesJ2);
        bataille.distribuerCartes();
        
        System.out.println("Cartes Joueur 1" + "\n" + cartesJ1);
        System.out.println("Cartes Joueur 2" + "\n" + cartesJ2);
        
        try {        
            for(int i=0; i<100; i++){
                bataille.game();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("FIN DE LA PARTIE");
        }

        if(cartesJ1.size() > cartesJ2.size()){
            System.out.println("Victoire: JOUEUR 1");
        }else if(cartesJ2.size() > cartesJ1.size()){
            System.out.println("Victoire: JOUEUR 2");
        }else{
            System.out.println("MATCH NUL");
        }
    }

}