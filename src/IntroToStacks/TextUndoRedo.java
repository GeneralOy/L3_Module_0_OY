package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	public static void main(String[] args) {
		TextUndoRedo mainTextUndoRedo = new TextUndoRedo();
	}

	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JLabel mainInputLabel = new JLabel();
	String userinput;
	Stack<String> stackOfLetters;
	Stack<String> deletedLetters;
	int numbOfLetters = 0;

	public TextUndoRedo() {
		userinput = "";
		stackOfLetters = new Stack<String>();
		deletedLetters = new Stack<String>();
		mainFrame.addKeyListener(this);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.setSize(500, 250);
		mainFrame.add(mainPanel);
		mainPanel.add(mainInputLabel);
		// mainInputLabel.setBounds(0, 0, mainPanel.getWidth(),
		// mainPanel.getHeight());
		mainInputLabel.setText(userinput);
		mainInputLabel.setVisible(true);
		System.out.println("asdf");
	}

	/**
	 * Create a JFrame with a JPanel and a JLabel.
	 */
	/**
	 * Every time a key is pressed, add that character to the JLabel. It should
	 * look like a basic text editor.
	 */
	/**
	 * Make it so that every time the BACKSPACE key is pressed, the last
	 * character is erased from the JLabel. Save that deleted character onto a
	 * Stack of Characters.
	 */
	/**
	 * Choose a key to be the Undo key. Make it so that when that key is
	 * pressed, the top Character is popped off the Stack and added back to the
	 * JLabel.
	 * 
	 */

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == e.VK_BACK_SLASH) {
			deletedLetters.push(stackOfLetters.pop());
			System.out.println(deletedLetters.peek());
			userinput = userinput.substring(0, userinput.length() - 1);
			mainInputLabel.setText(userinput);
		} else if (e.getKeyChar() == e.VK_ENTER) {
			System.out.println("ENTER");
			stackOfLetters.push(deletedLetters.pop());
			System.out.println(stackOfLetters.peek());
			userinput += stackOfLetters.peek();
			mainInputLabel.setText(userinput);
		} else {
			stackOfLetters.push(e.getKeyChar() + "");
			System.out.println(e.getKeyChar() + "");
			userinput += e.getKeyChar() + "";
			mainInputLabel.setText(userinput);
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
