package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		/**
		 * 1. Create a Stack of Doubles // Don't forget to import the Stack class
		 **/
		Stack<Double> doubleStack = new Stack<Double>();
		for (int i = 0; i < 100; i++) {
			doubleStack.push((double) randomNumber.nextInt(100));
			System.out.println(i);
		}
		System.out.println(doubleStack.size());
		int userIn1 = Integer.parseInt(JOptionPane.showInputDialog("Input the lower bound here"));
		int userIn2 = Integer.parseInt(JOptionPane.showInputDialog("Input the upper bound here"));

		for (int i = 99; i >= 0; i--) {
			if (doubleStack.get(i) < userIn2 && doubleStack.get(i) > userIn1) {
					System.out.println(doubleStack.pop());
				}else {
					doubleStack.pop();
				}
		}
		/** 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack. **/

		/** 3. Ask the user to enter in two numbers between 0 and 100, inclusive. **/

		/**
		 * 4. Pop all the elements off of the Stack. Every time a double is popped that
		 * // is // between the two numbers entered by the user, print it to the screen.
		 **/

		/**
		 * EXAMPLE: // NUM 1: 65 // NUM 2: 75
		 **/

		/**
		 * Popping elements off stack... // Elements between 65 and 75: // 66.66876846
		 * // 74.51651681 // 70.05110654 // 69.21350456 // 71.54506465 // 66.47984807 //
		 * 74.12121224
		 **/

	}
}
