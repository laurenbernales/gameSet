
public class Card {

    /* Card Object: each of these represents one of the cards in the deck.
    Values are represented as integers for easy comparison. See comments below
    for details as per value mapping.
     */

    // TODO: Optionally we can instead of int use either enum or hashMap, that would read easier

    int color, shape, quantity, shade;

    public Card(int color, int shape, int shade, int quantity){
        this.color = color;
        this.shade = shade;
        this.shape = shape;
        this.quantity = quantity;
    }

    // Getter method, returns the 4 features of a card in an array

    public int[] getFeatures(){
        int[] featureArray = {color, shape, shade, quantity};
        return featureArray;
    }
}
