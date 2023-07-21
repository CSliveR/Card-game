import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PaquetCarte{

    private ArrayList<Carte> paquet;

    public PaquetCarte(ArrayList<Carte> paquet) throws Exception {
        this.paquet = paquet;
        
        ArrayList<String> nomsValeurs = new ArrayList<>(Arrays.asList("As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"));
        ArrayList<String> nomsCouleurs = new ArrayList<>(Arrays.asList("coeur", "carreau", "pique", "trèfle"));

        int j = 0;
        while(j < nomsCouleurs.size()){
            int i = 0;
            while(i < nomsValeurs.size()){
                paquet.add(i, new Carte(nomsValeurs.get(i),nomsCouleurs.get(j)));
                i++;
            }
            j++;
        }
    }

    public ArrayList<Carte> getPaquet(){
        return paquet;
    }   

    public Carte retirerFirstCard() {
        Carte firstCard = paquet.get(0);
        paquet.remove(0);
        return firstCard;
    }
    
    
    public Carte firstCard() {
        return paquet.get(0);
    }

    public int nbCartes() {
        return paquet.size();
    }

    public void melangerCartes() {
        int i = 0;

        while(i < 100){
            Random random = new Random();
            int nombre = random.nextInt(52);
            Carte randomCard = paquet.get(nombre);
            paquet.remove(nombre);
            Carte firstCard = retirerFirstCard();
            paquet.add(0, randomCard);
            paquet.add(nombre, firstCard);
            i++;
        }
    }

    @Override
    public String toString() {
        return "PAQUET DE CARTES" + "\n" +  paquet;
    }

}