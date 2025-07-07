package Flow_control_statements;

import java.util.*;

public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter values separated by space:");
		String input = sc.nextLine().trim();

		if (input.isEmpty()) {
			System.out.println("No values");
		} else {
			String[] values = input.split("\\s+");
			for (int i = 0; i < values.length; i++) {
				System.out.print(values[i]);
				if (i < values.length - 1) {
					System.out.print(",");
				}
			}
		}

		sc.close();
	}
}