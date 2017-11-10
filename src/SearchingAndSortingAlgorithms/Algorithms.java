package SearchingAndSortingAlgorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int brokenEggs = 0;
		for (int i = 0; i < eggs.size(); i++) {
			System.out.println("test");
			if ((eggs.get(i).equals("cracked")) && brokenEggs == 0) {
				brokenEggs = i;
				System.out.println("eggs" + brokenEggs);
			}
		}
		System.out.println("eggs2-" + brokenEggs);
		return brokenEggs;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int oysterPearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			System.out.println("checkpoint2");
			if (oysters.get(i).equals(true)) {
				oysterPearls++;
			}
		}
		return oysterPearls;
	}

	public static double findTallest(List<Double> peeps) {
		Double tallestHeight = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			System.out.println("checkpoint3");
			if (peeps.get(i) > tallestHeight) {
				tallestHeight = peeps.get(i);
			}
		}
		return tallestHeight;
	}

	public static Object findLongestWord(List<String> words) {
		int wordLength = 0;
		int wordIndex = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > wordLength) {
				wordLength = words.get(i).length();
				wordIndex = i;
			}
		}
		return words.get(wordIndex);
	}

	public static Object containsSOS(List<String> message1) {
		boolean SOStf = false;
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).equals(" ... --- ... ")) {
				SOStf = true;
			}
		}
		return SOStf;
	}

	public static List<Double> sortScores(List<Double> results) {
		int z = 0;
		boolean stillGreater = true;
		List<Double> SortedScores = Arrays.asList();
		System.out.println("asdf");
		System.out.println(results.size());
		for (int i = 0; i < results.size(); i++) {
			System.out.println("check");
			for (int c = 0; c <= SortedScores.size(); c++) {
				System.out.println("check2");
				if ((results.get(z)) > (SortedScores.get(z)) && stillGreater) {
					z++;
					System.out.println(z);
				} else if (results.get(z) <= (SortedScores.get(z))) {
					SortedScores.add(z, results.get(z));
					System.out.println(z + results.get(z));
				}
				// Sort through each number in results; for every number, sort through every
				// number in sorted scores, and find the 2 that it's in between
			}
		}
		return SortedScores;
	}

}