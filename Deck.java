import java.util.*;

public class Deck {

    private Card[] deck;
    private int total_used;

    public Deck() {
    	this(false);
    }

    public Deck(boolean has_Jokers) {
        if (has_Jokers)
            deck = new Card[54];
        else
            deck = new Card[52];
        int card_count = 0;
        for(int curr_Suit = 0; curr_Suit <= 3; curr_Suit++) {
        		for(int curr_Val = 1; curr_Val <= 13; curr_Val++) {
        			deck[card_count]=new Card(curr_Val,curr_Suit);
        			card_count++;
        		}
        }		
        if (has_Jokers) {
            deck[52] = new Card(1,Card.JOKER);
            deck[53] = new Card(2,Card.JOKER);
        }
        total_used = 0;
    }


    public void shuffle_deck(boolean has_Jokers) { 	
    	int totalCards = 0;
    	if (!has_Jokers){
    		totalCards = 52;
    	}
    	else{
    		totalCards = 54;
    	}
        req_length = deck.length;
		    for (int j=0; j<req_length; j++) {
			    int req_num = (int)(Math.random()*req_length);
		      Card found_val = deck[j];
		      deck[j] = deck[req_num];
		      deck[req_num] = found_val;
		}
    }


    public int cards_remaining() { 
        return deck.length - total_used;
    }


    public Card deal_card() {
    	if (cards_remaining()==0){
    		throw new IllegalArgumentException();
    	}
    	total_used++;
    	return deck[total_used-1];
    }

    public boolean jokers_available() {
        total_length = deck.length;
        return (total_length == 54);
    }
    
    public String to_String() {
    		String string_str = "";
        total_length = deck.length;
    		for(int j = 0; j < total_length; j++) {
    			string_str += deck[j].toString();
    			if(j == total_length - 1)
    				string_str += ".";
    			else
    				string_str += ", ";
    			if(j > 0 && j % 4 == 0)
    				string_str += "\n";
    		}
    		return string_str;
    }

} 
