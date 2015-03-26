import java.util.Scanner;
public class TestInteger {
	public static void main(String[] args){
		
		int integer;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		integer = input.nextInt();
		
		
		System.out.println("isEven "+MyInteger.isEven(integer)+
				"\n"+"isOdd "+MyInteger.isOdd(integer)+"\n"+"isPrime "
				+MyInteger.isPrime(integer));
	}

}
