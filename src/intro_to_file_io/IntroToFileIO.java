package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class IntroToFileIO {
	public static void main(String[] args) {
		IntroToFileIO mainIntro = new IntroToFileIO();

	}

	public IntroToFileIO() {
		JFrame mainFrame = new JFrame();
		JPanel mainPanel = new JPanel();
		JButton addButton = new JButton();
		JButton removeButton = new JButton();
		JButton saveButton = new JButton();
		JButton loadButton = new JButton();
		JLabel mainTitle = new JLabel();
		mainFrame.add(mainPanel);
		mainPanel.add(mainTitle);
		mainPanel.add(addButton);
		mainPanel.add(removeButton);
		mainPanel.add(saveButton);
		mainPanel.add(loadButton);
		mainTitle.setText("To-Do List");
		addButton.setText("Add Task to List");
		removeButton.setText("Remove Task from List");
		saveButton.setText("Save List");
		loadButton.setText("Load List");
		mainFrame.setVisible(true);
		mainFrame.setSize(400, 150);
		inputThings();
		readingThings();
		copyrightThings();

	}

	void copyrightThings() {
		String userCopyrightLocation = JOptionPane
				.showInputDialog("Select File to copyright; Enter in this format - packageName/fileNameHere.extension");
		FileWriter("src/" + userCopyrightLocation, FileReaderString("src/" + userCopyrightLocation));

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

	void FileReader(String fileToRead) {
		// Read from a file one character at a time
		try {
			FileReader fr = new FileReader(fileToRead);
			int c = fr.read();
			while (c != -1) {
				System.out.print((char) c);
				c = fr.read();

			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	String FileReaderString(String fileToRead) {
		String stuffRead = "//COPYRIGHT OWEN YIN";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileToRead));

			String line = br.readLine();
			while (line != null) {
				stuffRead = stuffRead + "\n" + line;
				line = br.readLine();
			}

			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stuffRead;

	}

	void BufferReader(String fileToRead) {
		// Read from a file one line at a time
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileToRead));

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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
		}
	}
}
