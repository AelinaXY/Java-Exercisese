package javaExercises;

public class Blackjack {

	public static int blackJackMethod(int a, int b) {
		return a > 21 && b > 21 ? 0 : (a > b ? (a > 21 && b <= 21 ? b : a) : (b > 21 && a <= 21 ? a : b));
	}

}
