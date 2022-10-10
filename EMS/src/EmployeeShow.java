import java.io.File;
import java.util.Scanner;

// to display a employee from the list  
public class EmployeeShow {
	public void viewFile(String s) throws Exception {
		File file = new File("file" + s + ".txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
