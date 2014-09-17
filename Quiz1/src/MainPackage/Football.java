package MainPackage;

import java.util.Scanner;

public class Football {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Touchdowns: ");
		double TD = input.nextDouble();

		System.out.print("Enter Total Yards: ");
		double Yards = input.nextDouble();

		System.out.print("Enter Interceptions: ");
		double INT = input.nextDouble();

		System.out.print("Enter Completions: ");
		double comp = input.nextDouble();

		System.out.print("Enter Pass Attempts: ");
		double ATT = input.nextDouble();

		input.close();

		double a;
		a = (comp / ATT * 100.0 - 30.0) * 0.05;
		if (a<0)
			a=0;
		else if (a>2.375)
			a=2.375;

		double b = (Yards / ATT - 3.0) * 0.25;
		if (b < 0)
			b = 0;
		else if (b > 2.375)
			b = 2.375;

		double c = TD / ATT * 100.0 * 0.2;
		if (c < 0)
			c = 0;
		else if (b > 2.375)
			c = 2.375;

		double d = 2.375 - INT / ATT * 100.0 * 0.25;
		if (d < 0)
			d = 0;
		else if (b > 2.375)
			d = 2.375;

		double Final = (a + b + c + d) / 6.0 * 100.0;
	    System.out.printf("Your QB rating is %.1f",Final);

	}
}
