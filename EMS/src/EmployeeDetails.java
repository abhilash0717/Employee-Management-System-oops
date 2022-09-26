import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeDetails {
	String name;
	int employeeId;
	String address;
	long phoneNumber;

	HashSet<Integer> ids = new HashSet<Integer>();

	public String Details() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.print("Enter Employee ID : ");
		employeeId = sc.nextInt();
		System.out.println("Enter Employee Address : ");
		address = sc.next();
		System.out.println("Enter Employee PhoneNumber : ");
		phoneNumber = sc.nextLong();

		AddDetails addDetails = new AddDetails();
		String isSuccess = addDetails.addDetailsToFile(name, employeeId, address, phoneNumber, ids);
		return isSuccess;
	}
}
