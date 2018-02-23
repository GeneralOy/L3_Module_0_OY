package intro_to_file_io;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Metro {
	
	int countPassengers(ArrayList<int[]> list) {
		int numberOfPassengersLeft = 0;
		for(int[] number : list) {
			numberOfPassengersLeft += number[0] - number[1];
		}
		return numberOfPassengersLeft;
	}
}