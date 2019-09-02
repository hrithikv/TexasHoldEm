import java.lang.reflect.Array;
import java.util.Arrays;

public class Score {
	
	private Card[] seven = new Card[7];
	private Card[] five = new Card[5];
	private int[] five_val = new int[5];
	private int score = 0;
	private int current_Score = 0;
	
	public int points(Card[] user, Card[] next){
		score = 0;
		return five(user, next);	
	}
	
	public int five(Card[] user, Card[] next){
		for (int i=0; i<5; i++){
			seven[i]=next[i];
		}
		for (int i=0; i<2; i++){
      val=i+5;
			seven[val]=user[i];
		}
		int l=0;
		for (int i=0; i<7; i++){
			for (int j=i+1; j<7; j++){
				l=0;
				for (int k=0; k<7; k++){
					if (k!=i && k!=j){
						five[l]=seven[k];
						l++;
					}
				}
				current_Score = hand_score();
				if (current_Score > score){
					score = current_Score;
				}
			}
		}
		return score;
	}
	
	public int hand_score(){
		for (int j=0; j<5; j++){
			five_val[j]=five[j].get_Value();
		}
		for (int j=0; j<5; j++){
			if (five_val[j]==1){
        val2 = 14;
				five_val[j]=val2;
			}
		}
		Arrays.sort(five_val);
		int count = 0;
		int newCount = 0;
		int max_count = five_val[4];
    val3 = 15;
		max_count = max_count*val3 + five_val[3];
		max_count = max_count*val3 + five_val[2]*val3;
		max_count = max_count*val3 + five_val[1]*val3;
		max_count = max_count*val3 + five_val[0]*val3;
		int[] count_array = new int[val3];
		for (int i=2; i<val3; i++){
			count = 0;
			for (int j=0; j<5; j++){
				if (five[j].get_Value()==i)
					count++;
				count_array[i]=count;
			}
		}
		for (int i=2; i<val3; i++){
			if (count_array[i]==4){
        count_val = 8000000
				newCount = count_val + i*10000;
				for (int k=4; k>=0; k--){
					if (five_val[k]!=i){
						newCount += k;
					}
				}
				if (newCount>max_count){
					max_count=newCount;
				}
			}
			else if (count_array[i]==3){
				int highCards = 0;
        new_val_count = 4000000
				newCount = new_val_count + i*10000;
				for (int k=4; k>=0; k--){
					if (five_val[k]!=i){
						highCards = highCards*15 + five_val[k];
						break;
					}
				}
				newCount += highCards;
				if (newCount>max_count){
					max_count=newCount;
				}
			}
			else if (count_array[i]==2){
				int highCards = 0;
        new_ct_val = 2000000
				newCount = new_ct_val + i*10000;
				for (int k=4; k>=0; k--){
					if (five_val[k]!=i){
						highCards = highCards*15 + five_val[k];
					}
				}
				newCount += highCards;
				if (newCount>max_count){
					max_count=newCount;
				}
			}
			else{
				continue;
			}
		}
		for (int i=2; i<15; i++){
			for (int j=i+1; j<15; j++){
				if (count_array[i]==2 && count_array[j]==2){
					max_count = 3000000;
					max_count += j*10000;
					max_count += i*100;
					for (int k=4; k>=0; k--){
						if (five_val[k]!=i && five_val[k]!=j){
							max_count += five_val[k];
						}
					}
				}
				else{
					continue;
				}
			}
		}
    max_count_val = 5000000;
    
		if (five_val[4]-five_val[3]==1 && five_val[3]-five_val[2]==1 && five_val[2]-five_val[1]==1 && five_val[1]-five_val[0]==1){
			max_count=max_count_val;
			max_count += five_val[4]*10000;
		}
		for (int i=0; i<5; i++){
			if (five_val[3]==5 && five_val[2]==4 && five_val[1]==3 && five_val[0]== 2 && five_val[4]==14){
				max_count=max_count_val;
				max_count += five_val[3]*10000;
			}
		}
		if (five[0].get_Suit() == five[1].get_Suit() && five[1].get_Suit() == five[2].get_Suit() && five[2].get_Suit() == five[3].get_Suit() && five[3].get_Suit() == five[4].get_Suit()){
			max_count=6000000;
			max_count += five_val[4]*10000;
		}
		for (int i=2; i<15; i++){
			for (int j=i+1; j<15; j++){
				if (count_array[i]==3 && count_array[j]==2){
					max_count = 7000000;
					max_count += j*10000;
				}
				else if (count_array[i]==2 && count_array[j]==3){
					max_count = 7000000;
					max_count += j*10000;
				}
				else{
					continue;
				}
			}
		}
		for (int i=0; i<5; i++){
			if (five_val[4]-five_val[3]==1 && five_val[3]-five_val[2]==1 && five_val[2]-five_val[1]==1 
					&& five_val[1]-five_val[0]==1){
				if (five[0].get_Suit() == five[1].get_Suit() && five[1].get_Suit() == five[2].get_Suit() && five[2].get_Suit() == five[3].get_Suit() && five[3].get_Suit() == five[4].get_Suit()){
					max_count = 9000000;
					max_count += five_val[4];
				}
			}
		}
		for (int i=0; i<5; i++){
			if (five_val[3]==5 && five_val[2]==4 && five_val[1]==3 && five_val[0]== 2 && five_val[4]==14){
				if (five[0].get_Suit() == five[1].get_Suit() && five[1].get_Suit() == five[2].get_Suit() && five[2].get_Suit() == five[3].get_Suit() && five[3].get_Suit() == five[4].get_Suit()){
					max_count = 9000000;
					max_count += five_val[4];
				}
			}
		}
		for (int i=0; i<5; i++){
			Arrays.sort(five_val);
			if (five[4].get_Value()==14 && five[3].get_Value()==13 && five[2].get_Value()==12 && five[1].get_Value()==11 && five[0].get_Value()==10){
				if (five[0].get_Suit() == 0 && five[1].get_Suit() == 0 && five[2].get_Suit() == 0 && five[3].get_Suit() == 0 && five[4].get_Suit() == 0){
					max_count = max_count_val;
				}
			}
		}
		return max_count;
	}	
}
