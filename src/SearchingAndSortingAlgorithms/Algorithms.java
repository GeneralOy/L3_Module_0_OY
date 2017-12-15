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
		int sortedSize;
		String sort1;
		String sort2;
		for(int i = 1; i <= unsortedSequences.size(); i++) {
			sortedSize = sortedSequences.size();
			System.out.println("I"+i);
			for(int z = 0; z <= sortedSize; z++) {
				System.out.println("Z"+z);
				if(sortedSequences.size() <= i) {
					System.out.println("sorted;" + sortedSequences.get(z).length());
					System.out.println("unsorted;" + unsortedSequences.get(i).length());
					sort1 = unsortedSequences.get(i);
					sort2 = sortedSequences.get(z);
					if(sort1.length() <= sort2.length()) {
						System.out.println("YES");
						System.out.println(sortedSequences);
						sortedSequences.add(i-1, unsortedSequences.get(i));
					}else {
						System.out.println("NO");
					}
				}
			}
		}
		//5"ATAGCTGATCGTAGCTACGTACGATCG", 3"CATCGTACATGC", 2"TATGTGT",4"GCTGATCGTGACTGTAC", 1"ACTGT"
		//"ACTGT", "TATGTGT", "CATCGTACATGC", "GCTGATCGTGACTGTAC","ATAGCTGATCGTAGCTACGTACGATCG"
		System.out.println(sortedSequences);
		return sortedSequences;
	}

}