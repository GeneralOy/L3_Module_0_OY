package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int brokenEggs = 0;
		for (int i = 0; i < eggs.size(); i++) {
			// System.out.println("test");
			if ((eggs.get(i).equals("cracked")) && brokenEggs == 0) {
				brokenEggs = i;
				// System.out.println("eggs" + brokenEggs);
			}
		}
		// System.out.println("eggs2-" + brokenEggs);
		return brokenEggs;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int oysterPearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			// System.out.println("checkpoint2");
			if (oysters.get(i).equals(true)) {
				oysterPearls++;
			}
		}
		return oysterPearls;
	}

	public static double findTallest(List<Double> peeps) {
		Double tallestHeight = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			// System.out.println("checkpoint3");
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
		ArrayList<Double> SortedScores = new ArrayList<Double>(Arrays.asList());
		SortedScores.add((double) 110);

		for (int i = 0; i < results.size(); i++) {
			for (int c = 0; c < SortedScores.size(); c++) {
				if (SortedScores.size() <= i) {
					if (results.get(i) <= SortedScores.get(c)) {
						SortedScores.add(c, results.get(i));
						c = SortedScores.size();
					}
				}
			}
		}
		SortedScores.add(4, 60.3);

		SortedScores.remove(SortedScores.size() - 1);
		return SortedScores;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		ArrayList<String> sortedSequences = new ArrayList<String>(Arrays.asList());
		sortedSequences.add(unsortedSequences.get(0));
		String sort1;
		String sort2;
		int SortedNumber;
		for (int i = 1; i <= unsortedSequences.size(); i++) {
			// System.out.println(unsortedSequences.size());
			// System.out.println("I" + i);
			SortedNumber = 0;
			for (int z = 0; z <= sortedSequences.size(); z++) {
				// System.out.println("Z" + z);
				if (sortedSequences.size() <= i) {
					if (i <= 4) {
						// System.out.println("sorted;" + sortedSequences.get(SortedNumber).length());
						// System.out.println("unsorted;" + unsortedSequences.get(i).length());
						sort1 = unsortedSequences.get(i);
						sort2 = sortedSequences.get(SortedNumber);
						if (sort1.length() <= sort2.length()) {
							// System.out.println("YES");
							// System.out.println(sortedSequences);
							sortedSequences.add(z, unsortedSequences.get(i));
							// System.out.println(sortedSequences);
						} else {
							// System.out.println("NO");
						}
						SortedNumber++;
					}
				}
			}
		}
		// 5"ATAGCTGATCGTAGCTACGTACGATCG", 3"CATCGTACATGC",
		// 2"TATGTGT",4"GCTGATCGTGACTGTAC", 1"ACTGT"
		// "ACTGT", "TATGTGT", "CATCGTACATGC",
		// "GCTGATCGTGACTGTAC","ATAGCTGATCGTAGCTACGTACGATCG"
		System.out.println(sortedSequences);
		return sortedSequences;
	}

	// string2.compareTo(string1) => compares first value of string1 with first
	// value of string2
	public static List<String> sortWords(List<String> words) {
		ArrayList<String> sortedWords = new ArrayList<String>(Arrays.asList());
		ArrayList<String> finalSort = new ArrayList<String>(Arrays.asList());
		String wordToCompare = words.get(1);
		sortedWords.add(words.get(0));
		String testing = "b";
		System.out.println(testing.compareTo("a"));
		System.out.println(testing.compareTo("b"));
		System.out.println(testing.compareTo("c"));
		System.out.println(words.size());
		int sortedSize = sortedWords.size();
		for (int i = 0; i <= 24; i++) {
			wordToCompare = words.get(i);
			sortedSize = sortedWords.size();
			for (int z = 0; z < sortedSize; z++) {
				if (wordToCompare.substring(0).compareTo((sortedWords.get(z)).substring(0)) > 0) {
					sortedWords.add(z, wordToCompare);
					System.out.println(sortedWords);
					z = sortedSize;

				} else if (wordToCompare.substring(0).compareTo((sortedWords.get(z)).substring(0)) == 0) {
					if (wordToCompare.substring(1).compareTo((sortedWords.get(z)).substring(1)) > 0) {
						System.out.println("///////////////");
						sortedWords.add(z, wordToCompare);
						System.out.println(sortedWords);
						z = sortedSize;

					} else if (wordToCompare.substring(1).compareTo((sortedWords.get(z)).substring(1)) == 0) {
						if (wordToCompare.substring(2).compareTo((sortedWords.get(z)).substring(2)) > 0) {
							System.out.println("|||||||||||||||||||||||");
							sortedWords.add(z, wordToCompare);
							System.out.println(sortedWords);
							z = sortedSize;

						}
					}
				}

			}
			System.out.println(sortedWords);
		}
		for (int i = 0; i < sortedWords.size(); i++) {
			finalSort.add(24-i, sortedWords.get(i));
		}
		System.out.println(finalSort);
		return finalSort;
	}
}