import java.util.ArrayList;
import java.util.List;

public class GameSet {
    public static void main(String[] args) {
        Deck deck = new Deck(); // Create a Deck of 81 cards.

        List<Card> cardSet = new ArrayList<Card>();
        cardSet.add(deck.distributeCard());
        cardSet.add(deck.distributeCard());
        cardSet.add(deck.distributeCard());

        System.out.println(Player.confirmCards(cardSet));

        // TODO: Network interface, see how many players are in the game.
        int numPlayers = 0;
        String playerName = new String(); // TODO: Write code where this is set.
        List<Player> playersInGame = new ArrayList<Player>();

        for (int i = 0; i < numPlayers; i++) {
            playersInGame.add(new Player(playerName));
        }

    }

    public static boolean checkForSetsOnBoard(List<Card> cardsInPlay) {
        // TODO: If there are no sets return true
        return true;
    }

    public static boolean isThereMoreThanTwelve(List<Card> cardsInPlay) {
        if (cardsInPlay.size() > 12) {
            return true;
        } else {
            return false;
        }
    }
}
