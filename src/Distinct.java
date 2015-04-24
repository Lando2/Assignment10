import java.util.Scanner;

public class Distinct {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] strArray = new int[10];

		int size = strArray.length;

		for (int i = 0; i < strArray.length; i++) {

			System.out.print("Enter integer " + (i + 1) + ": ");
			strArray[i] = input.nextInt();

		}
		System.out.println("Your numbers: ");
		for (int k = 0; k < size; k++) {
			System.out.print(strArray[k] + " ");
		}
		for (int i = 0; i < (size - 1); i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (strArray[j] > strArray[j + 1]) {
					int temp = strArray[j];
					strArray[j] = strArray[j + 1];
					strArray[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if ((strArray[i] == (strArray[j])) && (i != j)) {
					while (i < (size) - 1) {
						strArray[i] = strArray[i + 1];
						i++;
					}
					size--;

				}

			}
		}
		System.out.println("\n\n");
		System.out.println("Distinct numbers: ");

		for (int k = 0; k < size + 1; k++) {
			System.out.print(strArray[k] + " ");
		}
	}
}
