package javaExercises;

public class Taxes {

	private static float taxAmountCalculator(int s) {

		if (s >= 45000) {
			return 0.25f;
		}

		if (s >= 30000) {
			return 0.2f;
		}

		if (s >= 20000) {
			return 0.15f;
		}

		if (s >= 15000) {
			return 0.1f;
		}

		return 0f;
	}

	public static int taxCalculator(int s) {
		return (int) (s * taxAmountCalculator(s));
	}

}
