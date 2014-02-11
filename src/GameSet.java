import java.util.ArrayList;
import java.util.List;

public class GameSet {
    public static void main(String[] args) {
        Deck deck = new Deck(); // Create a Deck of 81 cards.
        Graphics graphics = new Graphics();
        graphics.setOpaque(true);

        //testing for confirmCards
        //List<Card> cardSet = new ArrayList<Card>();
        //cardSet.add(deck.distributeCard());
        //cardSet.add(deck.distributeCard());
        //cardSet.add(deck.distributeCard());

        //System.out.println(Player.confirmCards(cardSet));
        
        //testing for noSetsOnBoard
        List<Card> cardSet1 = new ArrayList<Card>();
        cardSet1.add(new Card(0,0,0,0));
        cardSet1.add(new Card(1,0,0,0));
        cardSet1.add(new Card(1,1,0,0));
        cardSet1.add(new Card(1,1,1,0));
        cardSet1.add(new Card(1,1,1,1));
        cardSet1.add(new Card(2,1,1,1));
        cardSet1.add(new Card(2,2,1,1));
        cardSet1.add(new Card(2,2,2,1));          
        
        System.out.println(noSetsOnBoard(cardSet1));

        // TODO: Network interface, see how many players are in the game.
        int numPlayers = 0;
        String playerName = new String(); // TODO: Write code where this is set.
        List<Player> playersInGame = new ArrayList<Player>();

        for (int i = 0; i < numPlayers; i++) {
            playersInGame.add(new Player(playerName));
        }

    }

    public static boolean noSetsOnBoard(List<Card> cardsInPlay) {
        //If there are no sets return true
    	boolean containsNoSet = true;
    	for (int i = cardsInPlay.size()-1; i > -1; i--){
    		for (int j = cardsInPlay.size()-1; j > -1; j--){
    			for (int k = cardsInPlay.size()-1; k > -1; k--){
    				//all cards should be different 
    				if (i != k && i != j && k != j){
    			        List<Card> cardSet = new ArrayList<Card>();
    			        cardSet.add(cardsInPlay.get(i));
    			        cardSet.add(cardsInPlay.get(j));
    			        cardSet.add(cardsInPlay.get(k));
    					boolean containSet = Player.confirmCards(cardSet);
    					if (containSet == true){
    						containsNoSet = false;
    					}
    				}
    			}
    		}	
    	}
    	return containsNoSet;
    } 

    public static boolean isThereMoreThanTwelve(List<Card> cardsInPlay) {
        if (cardsInPlay.size() > 12) {
            return true;
        } else {
            return false;
        }
    }
}