import java.util.Scanner;

public class EmployeeDetails {
	String Name;
	String EmployeeId;
	String address;
	Double PhoneNumber;

	public void Details() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		Name = sc.nextLine();
		System.out.print("Enter Employee ID : ");
		EmployeeId = sc.nextLine();
		System.out.println("Enter Employee Address : ");
		address = sc.nextLine();
		System.out.println("Enter Employee PhoneNumber : ");
		PhoneNumber = sc.nextDouble();
	}
}
