import java.util.Scanner;


public class CompareNumbers {

	public static void main(String[] args) {

		int i, d, c;
		int sum, product, average;
		
		System.out.println(" Enter first integer: ");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		
		System.out.println(" Enter second integer:");
		d = input.nextInt();
		
		System.out.println(" Enter third integer");
		c = input.nextInt();
	
		System.out.printf("For the numbers " + i + ", " + d + " and " + c + "\n");
		if ((i > d) && (i > c))
			{
			System.out.println("Largest is " + i);
		} else if ((d > i) && (d > c)) 
			{
			System.out.println("Largest is " + d);
		} else if ((c > i) && (c > d)) 
			{
			System.out.println("Largest is " + c);
		}
		if ((i < d) && (i < c))
			{
			System.out.println("Smallest is " +i);
		} else if ((d < i) && (d < c)) 
			{
			System.out.println("Smallest is " + d);
		} else if ((c < i) && (c < d)) 
			{
			System.out.println("Smallest is " + c +"\n");
		}
		
		sum = i + d + c;
		System.out.println("Sum is " +sum);
		
		product = i * d * c; 
		System.out.println("Product is " +product);
		
		average = (i + d + c) / 3 ;
		System.out.println("Average is " +average);
	}

}

