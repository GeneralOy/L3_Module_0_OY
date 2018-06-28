package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	int IDInt = 0;
	String IDConversion;
	HashMap<Integer, String> ID = new HashMap<Integer, String>();
	JPanel mainPanel = new JPanel();
	JFrame mainFrame = new JFrame();
	JButton addEntry = new JButton();
	JButton SearchID = new JButton();
	JButton ViewList = new JButton();

	public static void main(String[] args) {
		LogSearch searchbox1 = new LogSearch();
	}

	public LogSearch() {
		mainFrame.add(mainPanel);
		mainFrame.setSize(350, 75);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.show();
		mainPanel.add(addEntry);
		addEntry.setText("Add Entry");
		addEntry.addActionListener(this);
		mainPanel.add(SearchID);
		SearchID.setText("Search IDs");
		SearchID.addActionListener(this);
		mainPanel.add(ViewList);
		ViewList.setText("View List");
		ViewList.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Add Entry")) {
			System.out.println("Add Entry");
			String entryAdded = JOptionPane.showInputDialog("Input Entry Here");
			ID.put(IDInt + 1, entryAdded);
			System.out.println(ID.get(IDInt));
			IDInt++;
		}
		if (e.getActionCommand().equals("Search IDs")) {
			System.out.println("Search IDs");
			String searchID = JOptionPane.showInputDialog("Input ID Number Here");
			int IDnum = Integer.parseInt(searchID);
			if(ID.get(IDnum) == null) {
				JOptionPane.showMessageDialog(null, "This entry does not exist");
			}else {
				JOptionPane.showMessageDialog(null, "The Entry for this ID was " + this.ID.get(IDnum));
			}
		}
		if (e.getActionCommand().equals("View List")) {
			System.out.println("View List");
			if (IDInt > 0) {
				IDConversion = "ID";
				for (int i = 1; i <= IDInt; i++) {
					IDConversion += "; " + ID.get(i);
				}
				JOptionPane.showMessageDialog(null, "" + IDConversion);
			} else {
				JOptionPane.showMessageDialog(null, "No inputs yet!");
			}
		}
	}
	/**
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 **/
	/*
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 */
	/*
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */

}
