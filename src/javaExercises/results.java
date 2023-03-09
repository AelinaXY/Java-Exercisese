package javaExercises;

public class results {
	private int physicsResult, chemistryResult, biologyResult, total, percentage;
	private int sixtyPercent = (int) (150 * 0.6);

	public results(int phy, int chm, int bio) {
		physicsResult = phy;
		chemistryResult = chm;
		biologyResult = bio;
		total = phy + chm + bio;
		percentage = (phy + chm + bio) * 100 / 450;
	}

	public void displayResult() {
		System.out.println(String.format(
				"Physics Result: %d \n" + "Chemistry Result: %d\n" + "Biology Result: %d \n" + "Total Marks: %d",
				physicsResult, chemistryResult, biologyResult, total));
	}

	public void displayPercnt() {

		if (percentage < 60
				|| (physicsResult < sixtyPercent || biologyResult < sixtyPercent || chemistryResult < sixtyPercent)) {
			System.out.println(String.format(
					"**************************\nOverall Percent: %d [FAIL] \n**************************", percentage));
			System.out.println(String.format("You failed at these subjects: \n%s%s%s",
					physicsResult < sixtyPercent ? "Physics\n" : "\n",
					chemistryResult < sixtyPercent ? "Chemistry\n" : "\n",
					biologyResult < sixtyPercent ? "Biology\n" : "\n"));

		} else {
			System.out.println(String.format(
					"**************************\nOverall Percent: %d [PASS] \n**************************", percentage));
		}
	}

}