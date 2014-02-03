import java.util.ArrayList;
import java.util.List;

public class GameSet {
    public static void main(String[] args) {
        Deck deck = new Deck(); // Create a Deck of 81 cards.

        // TODO: Network interface, see how many players are in the game.
        int numPlayers = 0;
        String playerName = new String(); // TODO: Write code where this is set.
        List<Player> playersInGame = new ArrayList<Player>();

        for (int i=0; i < numPlayers; i++){
            playersInGame.add(new Player(playerName));
        }
    }
}
