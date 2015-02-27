import java.util.Scanner;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
import java.math.BigDecimal;

public class FindPi {

	public static void main(String[] args) {
		double n = 0, iterations, uIterations;
		BigDecimal.valueOf(n);

		long startTime, endTime;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount of iterations to find PI");
		uIterations = input.nextDouble();

		startTime = System.nanoTime();
		for (iterations = 0; iterations < uIterations; iterations++) {
			n += Math.pow(-1, iterations) / ((2 * iterations) + 1);
		}

		n = n * 4;
		endTime = System.nanoTime();

		long totalTime = endTime - startTime;

		System.out.println(BigDecimal.valueOf(n) + " " + "\n It took "+ (double) NANOSECONDS.toMillis(totalTime) / 1000
		+ " seconds to complete this operation");

	}

}
