import java.util.ArrayList;
import java.util.Scanner;

public class SortSumArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<>();
		int[] a = new int[5];

		Scanner input = new Scanner(System.in);
		int x = 0;
		for (int i = 0; i < a.length; i++) {

			System.out.print("Please enter a number:");
			x = input.nextInt();
			s.add(x);
		}
		System.out.println("The numbers are \n"+s);
		s.sort(null);
		System.out.println("Here are the sorted numbers \n"+s);
		System.out.println("Here is the sum of the numbers \n "+sum(s));

	}

	public static int sum(ArrayList a) {

		int x = 0;
		for (int i = 0; i < a.size(); i++) {
			x += (int) a.get(i);
		}
		return x;

	}

}
