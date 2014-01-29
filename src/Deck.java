import java.util.Random;

public class Deck {

    /* Deck Object: represents a collection of all the cards necessary to play the game. */

    final int DECK_SIZE = 81; // 3^4, number of cards in the deck
    final int COLORS = 3, SHAPES = 3, SHADES = 3, QUANTITIES = 3;

    Card[] cardsInDeck = new Card[DECK_SIZE];
    // TODO: I made this an Array, a Stack may be more appropriate?

    public Deck() {
        // TODO: Quadruple nested for loop, not costly because 81 runs, but would be nice to have something more efficient
        for (int color = 0; color < COLORS; color++) {
            for (int shape = 0; shape < SHAPES; shape++) {
                for (int shade = 0; shade < SHADES; shade++) {
                    for (int quantity = 0; quantity < QUANTITIES; quantity++) {
                        int indexInDeck = 3 * 3 * 3 * color + 3 * 3 * shape + 3 * shade + quantity;
                        cardsInDeck[indexInDeck] = new Card(color, shape, shade, quantity);
                    }
                }
            }
        }
    }

    // This method retrieves a particular card in the deck
    public Card getCard(int index) {
        return cardsInDeck[index];
    }

    public int deckSize() {
        return cardsInDeck.length;
    }

    public void shuffleDeck() {
        Random random = new Random();
        for (int i = cardsInDeck.length - 1; i > 0; i--){
            int index = random.nextInt(i+1);
            Card placeholder = cardsInDeck[index];
            cardsInDeck[index] = cardsInDeck[i];
            cardsInDeck[i] = placeholder;
        }
    }
}
