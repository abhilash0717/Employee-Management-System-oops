import java.util.Scanner;

public class EmployeeDetails {
	String name;
	String employeeId;
	String address;
	Double phoneNumber;

	public void Details() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee name : ");
		name = sc.nextLine();
		System.out.print("Enter Employee ID : ");
		employeeId = sc.nextLine();
		System.out.print("Enter Employee Address : ");
		address = sc.nextLine();
		System.out.print("Enter Employee phoneNumber : ");
		phoneNumber = sc.nextDouble();
	}
}
