package intro_to_file_io;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

/*
 * Number of people in the bus
There is a bus moving in the city, and it takes and drop some people in each bus stop.
You are provided with a list (or array) of integer arrays (or tuples). Each integer array has two items which represent number of people get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.
Your task is to return number of people who are still in the bus after the last bus station (after the last array). Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and they are probably sleeping there :D
Take a look on the test cases.
Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the return integer can't be negative.
The second value in the first integer array is 0, since the bus is empty in the first bus stop.

 */
public class MetroPlays {
	Metro metro = new Metro();

	@Test
	public void test1() {
		ArrayList<int[]> list = generateList();
		assertEquals(solve(list), metro.countPassengers(list));
	}

	@Test
	public void test2() {
		ArrayList<int[]> list = generateList();
		assertEquals(solve(list), metro.countPassengers(list));
	}

	@Test
	public void test3() {
		ArrayList<int[]> list = generateList();
		assertEquals(solve(list), metro.countPassengers(list));
	}

	@Test
	public void test4() {
		ArrayList<int[]> list = generateList();
		assertEquals(solve(list), metro.countPassengers(list));
	}

	@Test
	public void test5() {
		ArrayList<int[]> list = generateList();
		assertEquals(solve(list), metro.countPassengers(list));
	}

	private ArrayList<int[]> generateList() {
		Random _random = new Random();
		ArrayList<int[]> myList = new ArrayList<int[]>();
		int totalNumber = 0;
		int[] firstStation = new int[] { _random.nextInt(26) + 5, 0 };
		myList.add(firstStation);
		totalNumber = firstStation[0];
		for (int i = 0; i < _random.nextInt(14) + 1; i++) {
			int[] station = new int[] { _random.nextInt(11), _random.nextInt(totalNumber) };
			totalNumber = totalNumber + station[0] - station[1];
			myList.add(station);
		}
		return myList;
	}

	private int solve(ArrayList<int[]> list) {
		int x = 0;
		for (int[] item : list) {
			x += item[0] - item[1];
		}
		return x;
	}
}
