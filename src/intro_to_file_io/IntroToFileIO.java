package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class IntroToFileIO {
	public static void main(String[] args) {
		IntroToFileIO mainIntro = new IntroToFileIO();
		
		
	}

	public IntroToFileIO() {
		String userInput = JOptionPane.showInputDialog("Type in a message to save here!");
		FileReader("src/intro_to_file_io/test.txt");
		BufferReader("src/intro_to_file_io/test2.txt");
		FileWriter("src/intro_to_file_io/test2.txt", "\nThis is me writing a message!");
		FileWriter("src/intro_to_file_io/test.txt", userInput);
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
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
