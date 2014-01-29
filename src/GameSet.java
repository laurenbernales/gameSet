import java.util.List;

public class GameSet {
    public static void main(String[] args){
        Deck deck = new Deck(); // See Deck class for details.
    }

    // This method takes as an input a List<Card> and confirms whether or not it's a set
    private void confirmCards(List<Card> cardTriplet){
        // First check to be certain that three cards have been selected
        if (cardTriplet.size() != 3){
            // TODO: Here it will print a message saying that an invalid selection has been made
            return; // This ends the method without running the rest of it
        }

        // If we do in fact have exactly 3 cards, the below code is valid.
        // Retrieve first the 3 cards, then the features of each card as an Array.
        // See Card class for more info.

        Card firstCard = cardTriplet.get(0);
        Card secondCard = cardTriplet.get(1);
        Card thirdCard = cardTriplet.get(2);

        int[] firstFeat = firstCard.getFeatures();
        int[] secFeat = secondCard.getFeatures();
        int[] thirdFeat = thirdCard.getFeatures();

        boolean confirmation; // We will set this TRUE if it is a SET and FALSE otherwise.

        for(int feature = 0; feature < firstFeat.length; feature++){
            // Case where all 3 features are equal to each other
            if (firstFeat[feature] == secFeat[feature] && firstFeat[feature] == thirdFeat[feature]){
                // TODO: This is incomplete, finish.
            }
        }
    }

}
