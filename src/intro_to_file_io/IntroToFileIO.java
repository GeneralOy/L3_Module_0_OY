package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class IntroToFileIO implements ActionListener {
	String list = "";
	ArrayList<String> listOfTasks = new ArrayList<String>();
	String fileChosen = "src/intro_to_file_io/TestingGrounds.java";
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JButton addButton = new JButton();
	JButton removeButton = new JButton();
	JButton saveButton = new JButton();
	JButton loadButton = new JButton();
	JLabel mainTitle = new JLabel();
	JLabel toDoList = new JLabel();

	public static void main(String[] args) {
		IntroToFileIO mainIntro = new IntroToFileIO();

	}

	public IntroToFileIO() {
		mainFrame.add(mainPanel);
		mainPanel.add(mainTitle);
		mainPanel.add(addButton);
		mainPanel.add(removeButton);
		mainPanel.add(saveButton);
		mainPanel.add(loadButton);
		mainPanel.add(toDoList);
		mainTitle.setText("To-Do List");
		addButton.setText("Add Task to List");
		removeButton.setText("Remove Task from List");
		saveButton.setText("Save List");
		loadButton.setText("Load List");
		addButton.addActionListener(this);
		removeButton.addActionListener(this);
		saveButton.addActionListener(this);
		loadButton.addActionListener(this);
		mainFrame.setVisible(true);
		mainFrame.setSize(630, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// inputThings();
		// readingThings();
		// copyrightThings();
		BufferReader("src/intro_to_file_io/TestingGrounds.java");
		System.out.println("\n \n");
		FileReader("src/intro_to_file_io/TestingGrounds.java");
		//toDoList.setText(BufferReaderStringOutput(fileChosen));;
		//list = BufferReaderStringOutput(fileChosen);
		toDoList.setText(listOfTasks.toString());
		update();
	}

	void copyrightThings() {
		String userCopyrightLocation = JOptionPane
				.showInputDialog("Select File to copyright; Enter in this format - packageName/fileNameHere.extension");
		// FileWriter("src/" + userCopyrightLocation, FileReaderString("src/" +
		// userCopyrightLocation));

	}

	void inputThings() {
		String userInputPre = JOptionPane.showInputDialog("Type in a message to encrypt and save here!");
		String userInput = userInputPre.substring(1, userInputPre.length()) + "" + userInputPre.substring(0, 1) + "ay";
		String fileToSaveTo = JOptionPane.showInputDialog(
				"What file would you like to save this to inside of Level_3_Module_0_OY/src/? Enter in this format; packageName/fileNameHere.extension");
		System.out.println(userInput);
		FileWriter("src/" + fileToSaveTo, userInput);
	}

	void readingThings() {
		String fileToRead = JOptionPane.showInputDialog(
				"Type in the name of the encrypted file you'd like to read from inside of Level_3_Module_0_OY/src/, in this format; packageName/fileNameHere.extension");
		FileReader("src/" + fileToRead);
	}

	String addTask(String taskLocation) {
		String userInputReady = JOptionPane.showInputDialog("Type in the task you would like to save here!");
		if (userInputReady != null) {
			list = "<html>" + list + "=>" + userInputReady + "<br><html>";
			listOfTasks.add(userInputReady);
			// FileWriter(taskLocation, FileReaderString(taskLocation) + "=-> " +
			// userInputReady);
		}
		return list;
	}

	/** vvvvvvvWORK HEREvvvvvvv **/
	String removeTask() {
		String taskToRemove = JOptionPane.showInputDialog(
				"Which item on the list would you like to remove? Enter -just- the number of the line");

		int taskToRemoveInt = Integer.parseInt(taskToRemove);
		// for (int i = 0; i < array.length; i++) {
		//
		// }
		// FileWriter("src/intro_to_file_io/TestingGrounds.java",
		// RemoveTaskReader("src/intro_to_file_io/TestingGrounds.java",taskToRemoveInt));
		//String returnedText = RemoveTaskReader(fileChosen, taskToRemoveInt);
		String returnedText = "";
		return returnedText;
	}

	/** ^^^^^^^WORK HERE^^^^^^^ **/
	void saveList(String fileToSaveTo) {
		FileWriter(fileToSaveTo, toDoList.getText());
	}

	void update() {
		//toDoList.setText(BufferReaderStringOutput(fileChosen));
	}
	
	String loadList() {
		String fileName;
		// Using a file chooser
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			fileName = jfc.getSelectedFile().getAbsolutePath();
			System.out.println(fileName);
			return fileName;
		} else {
			System.out.println("****************LOADING STOPPED****************");
			return "src/intro_to_file_io/TestingGrounds.java";
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Add Task to List")) {
			System.out.println("ADD");
			for (String string : listOfTasks) {
				list = "<html>" + list + "=>" + string + "<br><html>";
			}
			toDoList.setText(addTask(fileChosen));
		}
		if (e.getActionCommand().equals("Remove Task from List")) {
			System.out.println("REMOVE");
			toDoList.setText(removeTask());
		}
		if (e.getActionCommand().equals("Save List")) {
			System.out.println("SAVE");
			saveList(fileChosen);
		}
		if (e.getActionCommand().equals("Load List")) {
			System.out.println("LOAD");
			fileChosen = loadList();
		}
		update();
	}

	void FileReader(String fileToRead) {
		// Read from a file one character at a time
		try {
			FileReader fr = new FileReader(fileToRead);
			int c = fr.read();
			while (c != -1) {
				System.out.print((char) c);
				c = fr.read();
				// System.out.println("HI!");
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* vvvvvvvvvvvvvvv **/
	String FileReaderString(String fileToRead) {
		String stuffRead = "<html>";
		try {
			BufferedReader br = new

			BufferedReader(new FileReader(fileToRead));
			
			String line = br.readLine();
			while (line != null) {
				stuffRead =  stuffRead + line + "<br/>";
				line = br.readLine();
				// System.out.println("HI!"); "<html>" + "Guest number " + numberOfNames + "; " + List + "<br></html>"
			}

			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stuffRead += "<html>";
		return stuffRead;

	}
	/* ^^^^^^^^^^^^^^^ **/
	
	void BufferReader(String fileToRead) {
		// Read from a file one line at a time
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileToRead));

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
				System.out.println("HI!");
			}

			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*void BufferReaderStringOutput(String fileToRead)/check/ {
		// Read from a file one line at a time
		String fileRead = "<html>";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileToRead));

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				fileRead =fileRead + line + "<br/>";
				line = br.readLine();
				System.out.println("HI!");
			}
			fileRead +="<br></html>";

			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return fileRead;
	}*/

	/** 
	String RemoveTaskReader(String fileToRead, int lineToRemove) {
		// Read from a file one line at a time
		String stuffRead = "<html>";
		int lineNumber = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileToRead));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				if (lineNumber == (lineToRemove - 1)) {
					stuffRead = stuffRead + "<br/>";
					br.readLine();
				} else {
					stuffRead = stuffRead + line + "<br/>";
					line = br.readLine();
				}
				lineNumber++;
			}
			stuffRead += "<br></html>";
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // lineNumber = 1;
		System.out.println(stuffRead);
		return stuffRead;
	}
	/ / ^^^^^^^STILL NOT WORKING^^^^^^^/

	/ ^^^^^^^^^^^^^^^^ / **/

	void FileWriter(String fileToWriteTo, String messageToWrite) {
		// Write to a file
		try {
			FileWriter fw = new FileWriter(fileToWriteTo);

			/*
			 * NOTE: To append to a file that already exists, add true as a second parameter
			 * when calling the FileWriter constructor. (e.g. FileWriter fw = new
			 * FileWriter("src/intro_to_file_io/test2.txt", true);)
			 */

			fw.write(messageToWrite);

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void FileChooser() {
		// Using a file chooser
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String fileName = jfc.getSelectedFile().getAbsolutePath();
			System.out.println(fileName);
			System.out.println(jfc.getSelectedFile().getPath());
		}
	}

}
