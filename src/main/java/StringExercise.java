import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

class StringExercise {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Something: ");
		String input = keyboard.nextLine();
		System.out.println("You Entered: " + input);

		if (StringUtils.isNumeric(input)) {
			System.out.print(input + " is a number\n");
		} else {
			System.out.println(input + " is not a number");
		}
		System.out.println("Flipped Case: " + StringUtils.swapCase(input));
		System.out.println("Reversed: " + StringUtils.reverse(input));
	}
}


