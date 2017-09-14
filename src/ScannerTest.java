import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		try {
			File file1 = new File("/Users/league/Desktop/L3_Module_0_OY/src/TestFile");
			Scanner scanner1 = new Scanner(file1);
			PrintWriter pw1 = new PrintWriter(file1);
			pw1.println("hi");
			pw1.println("sasd");
			pw1.close();

			while(scanner1.hasNext()) {
				scanner1.nextLine();
			}
		}catch(Exception e) {
			
		}
	}
	
}
