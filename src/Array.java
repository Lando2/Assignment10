import java.util.Scanner;


public class Array {
	static int min, max, total, average;
	public static void main(String[] args){
		
		int arraySize;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will find the highest, lowest, average, and the sum of the numbers that\n"
				+ "you will enter\n"
				+ "How many numbers do you want to enter?");
		
		arraySize = input.nextInt();
		int array[] = new int[arraySize];
		
		System.out.println("Enter a series of " +arraySize+" numbers?");
		
		Array.getValues(array);
		System.out.println("The Highest element is :"+Array.showHighest(array));
		System.out.println("The Lowest element is: " +Array.showLowest(array));
		System.out.println("The Sum of the elements is: "+Array.showTotal(array));
		System.out.println("The Average of the elements is: " +Array.showAverage(array));
		
	}

	public static void getValues(int array[]){
		
		Scanner input = new Scanner(System.in);
		
		for (int k = 0; k < array.length; k++)
    {
       System.out.print("Enter element " +
                        (k + 1) + ": ");
       array[k] = input.nextInt();
    }

	}
	
	public static int showLowest(int array[]){
		min = array[0];
		for(int j = 0; j<array.length; j++){
			
			if (array[j] < min){
				min = array[j];
			}
		}
return min;
	}
	public static int showHighest(int array[]){
		
	for(int j = 0; j<array.length; j++){
		
		if( max < array[j]){
			max = array[j];
		}
		
	}
return max;
		
	}
	public static int showTotal(int array[]){
		for(int n = 0; n< array.length; n++){
			total += array[n];
		}
		return total;
	}
	public static int showAverage(int array[]){
		average = total / array.length;
		return average;
	}
}

	

