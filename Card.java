public class Card {

    public static int SPADES = 0; .
    public static int HEARTS = 1;
    public static int DIAMONDS = 2;
    public static int CLUBS = 3;
    public static int JOKER = 4;
    public static int ACE = 1;   
    public static int JACK = 11;    
    public static int QUEEN = 12; 
    public static int KING = 13;
    protected int suit;
    protected int value;
    
    public Card() {
        suit = JOKER;
        value = 1;
    }

    public Card(int new_Value, int new_Suit) {
        if (new_Suit != SPADES && new_Suit != HEARTS && new_Suit != DIAMONDS && new_Suit != CLUBS && new_Suit != JOKER)
            throw new IllegalArgumentException("Not a valid suit");
        if (new_Suit != JOKER && (new_Value < 1 || new_Value > 13))
            throw new IllegalArgumentException("Not a valid value");
        value = new_Value;
        suit = new_Suit;
    }

    public int get_Suit() {
        return suit;
    }

    public int get_Value() {
        return value;
    }

    public String get_suit_value() {
        switch ( suit ) {
        case SPADES:   
        return "Spades";
        case HEARTS:  
        return "Hearts";
        case DIAMONDS: 
        return "Diamonds";
        case CLUBS:    
        return "Clubs";
        default:       
        return "Joker";
        }
    }

    public String get_string_value() {
        if (suit == JOKER)
            return value;
        else {
            switch ( value ) {
            case 1: 
            return "Ace";
            case 2:  
            return "2";
            case 3:   
            return "3";
            case 4: 
            return "4";
            case 5:   
            return "5";
            case 6: 
            return "6";
            case 7: 
            return "7";
            case 8:   
            return "8";
            case 9:  
            return "9";
            case 10: 
            return "10";
            case 11: 
            return "Jack";
            case 12:  
            return "Queen";
            default: 
            return "King";
            }
        }
    }
    }
