
public class Carte {

    private String valeur;
    private String couleur;
    

    public Carte(String valeur, String couleur) throws Exception {
        this.valeur = valeur;
        this.couleur = couleur;
  

        if ((valeur != "As" && valeur != "2" && valeur != "3" && valeur != "4" && valeur != "5" && valeur != "6" && valeur != "7" && valeur != "8" 
            && valeur != "9" && valeur != "10" && valeur != "Valet" && valeur != "Dame" && valeur != "Roi") 
            || (couleur != "pique" && couleur != "coeur" && couleur != "carreau" && couleur != "trèfle"))
        {
            throw new Exception("Carte invalide", null);
        }
    }

    public String getValeur() {
        return valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getForce(){
        if(getValeur() == "Valet"){
            return 11;
        }else if (getValeur() == "Dame"){
            return 12;
        }else if(getValeur() == "Roi"){
            return 13;
        }else if(getValeur() == "As"){
            return 14;
        }else{
            return Integer.parseInt(getValeur());
        }
    }

    @Override
    public String toString() {
        return getValeur() + " de " + getCouleur();
    }
    
    public int compareTo(Carte c){
        if(this.getForce() < c.getForce()){
            return -1;
        }else if(this.getForce() > c.getForce()){
            return 1;
        }else{
            return 0;
        }
    }



}