
public class Coin {
	
	 
	private String a;
	public Coin(){
		
		sideUp("Heads");
		
	}
	
	public String sideUp(String a){
		
		if(a.compareTo("Heads")==0){
			return "Heads";
		}
		else 
			return "Tails";
	}
	public void toss(){
		int rand = (int) (Math.random() *2+1);
		if(rand == 1){
			a = "Heads";
		}
		else
			a = "Tails";
	}

	public String getSideUp(){
		
		return a;
		
	}

}
