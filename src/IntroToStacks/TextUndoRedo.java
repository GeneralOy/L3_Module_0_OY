package IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements ActionListener {
	public static void main(String[] args) {
		TextUndoRedo mainTextUndoRedo = new TextUndoRedo();
	}
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JLabel mainInputLabel = new JLabel();
	String userinput;

	public TextUndoRedo() {
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.setSize(500, 250);
		mainFrame.add(mainPanel);
		mainPanel.add(mainInputLabel);
		//mainInputLabel.setBounds(0, 0, mainPanel.getWidth(), mainPanel.getHeight());
		mainInputLabel.setText(userinput);
		mainInputLabel.setVisible(true);
	}

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 */
	/*
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 */
	/*
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 */
	/*
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		this.userinput += e.toString();
		System.out.println(e.toString());

	}

}
