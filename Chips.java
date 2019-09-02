public class Chips {

	private int chips;
	
	public void increase_chips(int amount){
		chips = chips+amount;
	}
	
	public void remove_chips(int amount){
		chips = chips-amount;
	}
	
	public int total_chips(){
		return chips;
	}
}
