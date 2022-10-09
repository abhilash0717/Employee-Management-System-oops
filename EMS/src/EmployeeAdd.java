import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

// To add the employee Details
public class EmployeeAdd {
	public void createFile() {
		Scanner sc = new Scanner(System.in);
		EmployeeDetails emp = new EmployeeDetails();
		emp.Details();
		try {
			File f1 = new File("file" + emp.employeeId + ".txt");
			if (f1.createNewFile()) {
				FileWriter myWriter = new FileWriter("file" + emp.employeeId + ".txt");
				myWriter.write("Employee ID -" + emp.employeeId + "\n" + "Employee Name -" + emp.name + "\n"
						+ "Address -" + emp.address + "\n" + "Phone Number -" + emp.phoneNumber);
				myWriter.close();
				System.out.println("\nEmployee details added successfully");
				System.out.println("\nPress Enter to continue");
				sc.nextLine();
			} else {
				System.out.println("Employee details already exists");
				System.out.println("Press Enter to continue");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
