package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		/**1. Create an array list of Strings
		Don't forget to import the ArrayList class*/
		strings.add("tes1");
		strings.add("tst2");
		strings.add("tes3");
		strings.add("tst4");
		strings.add("tes5");
		/**2. Add five Strings to your list*/
		for(int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s);
		}
		/**3. Print all the Strings using a standard for-loop*/
		for(String s : strings) {
			System.out.println(s);
		}
		/**4. Print all the Strings using a for-each loop*/
		for(int i = 0; i < strings.size(); i++) {
			if (i % 2 == 1) {
				String s = strings.get(i);
				System.out.println(s);
			}
		}
		/**5. Print only the even numbered elements in the list.*/
		for(int i = 4; i >= 0; i--) {
				String s = strings.get(i);
				System.out.println(s);
		}
		/**6. Print all the Strings in reverse order.*/
		for(int i = 4; i >= 0; i--) {
			if((strings.get(i)).contains("e") == true) {
				String s = strings.get(i);
				System.out.println(s);
			}
	}
		/**7. Print only the Strings that have the letter 'e' in them.*/
	}
}
