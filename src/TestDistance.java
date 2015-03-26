import java.util.Scanner;
public class TestDistance {
	public static void main(String [] args){
		double xOne,xTwo,yOne,yTwo, distance = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter x1: ");
		xOne = input.nextDouble();
		System.out.println("Please enter y1: ");
		yOne = input.nextDouble();
		System.out.println("Please enter x2: ");
		xTwo = input.nextDouble();
		System.out.println("Please enter y2: ");
		yTwo = input.nextDouble();
		
		System.out.println("The distance between the points ("+xOne+","+yOne+") and ("+xTwo+","+yTwo+") is "
		+TheDistance.getDistance(xOne, xTwo, yOne, yTwo, distance));
	}

}
