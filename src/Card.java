
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
    
    
    //don't have the images, but setting it up anyways
    //It's kind of long, but each feature would correspond to a different 
    //string, so haven't figured out how to make more efficient
    public String getImageName(){
    	//color
    	int feature1 = getFeatures()[0];
    	//String stringFeature1 = String.valueOf(feature1);
    	String color = "";
    	if (feature1 == 0){
    		color = "color:zero_";
    	}
    	else if (feature1 == 1){
    		color = "color:one_";
    	}
    	else if (feature1 == 2){
    		color = "color:two_";
    	}
    	else{
    		color = "color:three_";
    	}

        //shape
    	int feature2 = getFeatures()[1];
    	String shape = "";
    	if (feature2 == 0){
    		shape = "shape:zero_";
    	}
    	else if (feature2 == 1){
    		shape = "shape:one_";
    	}
    	else if (feature2 == 2){
    		shape = "shape:two_";
    	}
    	else{
    		shape = "shape:three_";
    	}

    	//shade
    	int feature3 = getFeatures()[2];
    	String shade = "";
    	if (feature3 == 0){
    		shade = "shade:zero_";
    	}
    	else if (feature3 == 1){
    		shade = "shade:one_";
    	}
    	else if (feature3 == 2){
    		shade = "shade:two_";
    	}
    	else{
    		shade = "shade:three_";
    	}
    	
    	//quantity
    	int feature4 = getFeatures()[3];
    	String quant = "";
    	if (feature4 == 0){
    		quant = "quant:zero";
    	}
    	else if (feature4 == 1){
    		quant = "quant:one";
    	}
    	else if (feature4 == 2){
    		quant = "quant:two";
    	}
    	else{
    		quant = "quant:three";
    	}
    	String name = color+shape+shade+quant+".png" ;
    	return name;
    }
    
}

