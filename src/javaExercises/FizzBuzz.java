package javaExercises;

public class FizzBuzz {

	public static void FizzBuzzMethod(int a) {
		String outString = "";

		for (int i = 1; i <= a; i++) {
			outString = "";
			if (i % 3 == 0) {
				outString = outString.concat("Fizz");
			}

			if (i % 5 == 0) {
				outString = outString.concat("Buzz");
			}

			if (outString.equals("")) {
				outString = outString.concat(Integer.toString(i));
			}

			System.out.println(outString);
		}
	}

}
