
public class MyInteger {
	
	public static boolean isEven(int integer){
		if(integer % 2 == 0){
	
		return true;
		}
		return false;
	}
	public static boolean isOdd(int integer){
		if(integer % 2 != 0){
			return true;
			
		}
		return false;
	}
	public static boolean isPrime(int integer){
		for(int count = 2; count<integer; count++){
	           if(integer % count == 0){
	               return false; 
	             }
	           }
	return true;
	}
}
