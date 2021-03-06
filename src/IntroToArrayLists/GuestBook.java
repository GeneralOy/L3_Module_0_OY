package IntroToArrayLists;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.omg.Messaging.SyncScopeHelper;

public class GuestBook implements ActionListener {
	ArrayList<String> namesList = new ArrayList<String>();
	JPanel mainPanel = new JPanel();
	JFrame mainFarme = new JFrame();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	JLabel names = new JLabel("", SwingConstants.CENTER);
	String a;
	String b;
	String c;
	String d;
	String e;
	String f;
	int numberOfNames = 0;
	
	public static void main(String[] args) {
		GuestBook guestbookMain = new GuestBook();
	}
	public GuestBook() {
		
		mainFarme.add(mainPanel);
		mainPanel.add(addName);
		mainPanel.add(viewNames);
		mainPanel.add(names);
		Dimension preferredSize = new Dimension(350,500);
		names.setPreferredSize(preferredSize);
		names.setVerticalTextPosition(SwingConstants.TOP);
		mainFarme.setSize(350, 400);
		addName.setText("Add a Name");
		viewNames.setText("View Names");
		mainFarme.show();
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		mainFarme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Add a Name")) {
			System.out.println("addName");
			namesList.add(JOptionPane.showInputDialog("Insert Name Here"));
			
		}
		if(e.getActionCommand().equals("View Names")) {
			String content = "";
			for(String List : namesList) {
				numberOfNames ++;
				//JLabel label = new JLabel();
				System.out.println("Guest number " + numberOfNames + "-" + List);
				//mainPanel.add(names);
				content += "Guest number " + numberOfNames + "-" + List + "\n";
			}
			names.setText(content /*+ "\n"*/);
			numberOfNames = 0;
			System.out.println("viewNames");
			viewNames.setText("Back");
		}
		if(e.getActionCommand().equals("Back")) {
			//mainPanel.removeAll();
			//mainPanel.add(addName);
			//mainPanel.add(viewNames);
			System.out.println("Back");
			viewNames.setText("View Names");
		}
		
	}
}
