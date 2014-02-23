
public class Card {

    /* Card Object: each of these represents one of the cards in the deck.
    Values are represented as integers for easy comparison. See comments below
    for details as per value mapping.
     */

    // TODO: Optionally we can instead of int use either enum or hashMap, that would read easier

    int color, shape, quantity, shade;

    public Card(int color, int shape, int shade, int quantity) {
        this.color = color;
        this.shade = shade;
        this.shape = shape;
        this.quantity = quantity;
    }

    // Getter method, returns the 4 features of a card in an array

    public int[] getFeatures() {
        int[] featureArray = {color, shape, shade, quantity};
        return featureArray;
    }

    /* This method will take a Card object with quantities defined, read those
    values, and return a String that corresponds to the file name of an
    image of that particular Card.
     */

    public String getImageName() {
        String colorString, shapeString, shadeString, quantityString;

        switch (color) {
            case 0:
                colorString = "color:zero_";
                break;
            case 1:
                colorString = "color:one_";
                break;
            case 2:
                colorString = "color:two_";
                break;
            default:
                colorString = "color:null_";
        }

        switch (shape) {
            case 0:
                shapeString = "shape:zero_";
                break;
            case 1:
                shapeString = "shape:one_";
                break;
            case 2:
                shapeString = "shape:two_";
                break;
            default:
                shapeString = "shape:null_";
        }

        switch (shade) {
            case 0:
                shadeString = "shade:zero_";
                break;
            case 1:
                shadeString = "shade:one_";
                break;
            case 2:
                shadeString = "shade:two_";
                break;
            default:
                shadeString = "shade:null_";
        }

        switch (quantity) {
            case 0:
                quantityString = "quantity:zero_";
                break;
            case 1:
                quantityString = "quantity:one_";
                break;
            case 2:
                quantityString = "quantity:two_";
                break;
            default:
                quantityString = "quantity:null_";
        }

        return (colorString + shapeString + shadeString + quantityString + ".png");
    }
}

