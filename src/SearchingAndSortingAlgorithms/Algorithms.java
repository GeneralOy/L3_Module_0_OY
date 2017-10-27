package SearchingAndSortingAlgorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	static int brokenEggs = 0;
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i<eggs.size()+1; i++ ) {
			if(eggs.get(i)) {
				brokenEggs ++;
			}
		}
		return brokenEggs; //<- this needs changing
	}
	
	//Add other methods here
}