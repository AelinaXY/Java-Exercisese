package javaExercises;

public class UniqueSum {

	public static int uniqueSum(int a, int b, int c) {

		if (a == b) {
			if (a == c) {
				return 0;
			}

			return c;
		}

		else {

			if (a == c) {
				return b;
			}

			if (b == c) {
				return a;
			}
		}

		return a + b + c;

	}

}
