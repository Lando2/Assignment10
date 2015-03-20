
public class TestCoin {
	
	public static void main(String[] args) {
		
		
		Coin c = new Coin();
		
		for(int i = 0; i < 20; i++){
			
			c.toss();
		}
		System.out.println(c.getSideUp());
	}
}
