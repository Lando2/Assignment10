import java.util.Scanner;

public class Lottery {
	static int x = 0;

	public static void main(String[] args) {

		int[] lotteryNums = new int[5];
		int[] user = new int[5];
		int random;

		System.out.println("Enter a series of 5 numbers.");
		getValues(user);
		for (int i = 0; i < 5; i++) {
			random = (int) (Math.random() * 9);
			for (int x = 0; x < i; x++) {
				if (lotteryNums[i] == random) {
					random = (int) (Math.random() * 9);
				}

			}
			lotteryNums[i] = random;
		}
		
		System.out.println("The lottery numbers are:");

		for (int i = 0; i < lotteryNums.length; i++)
			System.out.print(lotteryNums[i] + " ");

		System.out.println("\nThe matching numbers are:");
		compareNumbers(user, lotteryNums);
		System.out.println("\nYou matched " + x + " numbers");
		
	}

	public static void getValues(int[] x) {
		for (int i = 0; i < x.length; i++) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number " + (i + 1) + ":");

			x[i] = input.nextInt();
			if (x[i] > 9 || x[i] < 0) {
				System.out.println("Must be between 0-9");
				i--;
			}
		}
	}

	public static void compareNumbers(int[] user, int[] lotteryNums) {
		int i = 0, j = 0;

		while (i < user.length && j < user.length) {

			if (lotteryNums[j] == user[i]) {
				x++;
				System.out.print(user[i] + " ");

			}

			i++;
			j++;

		}
	}
}
