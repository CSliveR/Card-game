import java.util.ArrayList;

public class Bataille {
    private PaquetCarte paquetMelange;
    private ArrayList<Carte> cartesJ1;
    private ArrayList<Carte> cartesJ2;

    public Bataille(PaquetCarte paquetMelange, ArrayList<Carte> cartesJ1, ArrayList<Carte> cartesJ2){
        this.paquetMelange = paquetMelange;
        this.cartesJ1 = cartesJ1;
        this.cartesJ2 = cartesJ2;
    }

    public void distribuerCartes(){
        int i = 0;  
        while(i < 26){
            cartesJ1.add(i, paquetMelange.retirerFirstCard());
            cartesJ2.add(i, paquetMelange.retirerFirstCard());        
            i++;
        }
    }

    public void game(){
        if(cartesJ1.get(0).compareTo(cartesJ2.get(0)) < 0){
            cartesJ2.add(cartesJ2.size(), cartesJ1.get(0));
            cartesJ2.add(cartesJ2.size(), cartesJ2.get(0));
            cartesJ2.remove(cartesJ2.get(0));    
            cartesJ1.remove(cartesJ1.get(0));

        }else if(cartesJ1.get(0).compareTo(cartesJ2.get(0)) > 0){
            cartesJ1.add(cartesJ1.size(), cartesJ2.get(0));
            cartesJ1.add(cartesJ1.size(), cartesJ1.get(0));
            cartesJ1.remove(cartesJ1.get(0));
            cartesJ2.remove(cartesJ2.get(0));
        }else{
            System.out.println("DRAW !!!!");
            if(cartesJ1.get(2).compareTo(cartesJ2.get(2)) < 0){
                cartesJ2.add(cartesJ2.size(), cartesJ2.get(0));
                cartesJ2.remove(cartesJ2.get(0));                
                cartesJ2.add(cartesJ2.size(), cartesJ2.get(0));
                cartesJ2.remove(cartesJ2.get(0));               
                cartesJ2.add(cartesJ2.size(), cartesJ2.get(0));
                cartesJ2.remove(cartesJ2.get(0)); 
                
                cartesJ2.add(cartesJ2.size(), cartesJ1.get(0));
                cartesJ1.remove(cartesJ1.get(0)); 
                cartesJ2.add(cartesJ2.size(), cartesJ1.get(0)); 
                cartesJ1.remove(cartesJ1.get(0)); 
                cartesJ2.add(cartesJ2.size(), cartesJ1.get(0));
                cartesJ1.remove(cartesJ1.get(0)); 
                

            }else if(cartesJ1.get(2).compareTo(cartesJ2.get(2)) > 0){
                cartesJ1.add(cartesJ1.size(), cartesJ1.get(0)); 
                cartesJ1.remove(cartesJ1.get(0));  
                cartesJ1.add(cartesJ1.size(), cartesJ1.get(0));
                cartesJ1.remove(cartesJ1.get(0)); 
                cartesJ1.add(cartesJ1.size(), cartesJ1.get(0));
                cartesJ1.remove(cartesJ1.get(0)); 
                
                cartesJ1.add(cartesJ1.size(), cartesJ2.get(0));
                cartesJ2.remove(cartesJ2.get(0)); 
                cartesJ1.add(cartesJ1.size(), cartesJ2.get(0));
                cartesJ2.remove(cartesJ2.get(0)); 
                cartesJ1.add(cartesJ1.size(), cartesJ2.get(0));
                cartesJ2.remove(cartesJ2.get(0)); 
            }
        }
          
        System.out.println("JOUEUR 1" + "\n" + cartesJ1);
        System.out.println("JOUEUR 2" + "\n" + cartesJ2);


        System.out.println("JOUEUR 1" + " " + cartesJ1.size());
        System.out.println("JOUEUR 2" + " " + cartesJ2.size());
    }

      
    
}
