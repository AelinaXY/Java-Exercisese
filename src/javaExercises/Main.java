package javaExercises;

public class Main {

	public static void main(String[] args) {
		results result = new results(0, 136, 0);

		result.displayResult();

		result.displayPercnt();

		System.out.println(Flowcharts.flowchart(1, 1, true));

		System.out.println();

		Flowcharts.flowChartA(450);
	}

}
