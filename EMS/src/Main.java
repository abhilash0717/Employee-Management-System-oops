import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("Press 1 : To Add an employee details");
		System.out.println("Press 2 : To See an employee details");
		System.out.println("Press 3 : To Remove employee");
		System.out.println("Press 4 : To Update employee details");
		System.out.println("Press 5 : To Exit the EMS portal");
		System.out.print("Please Enter choice : ");
		sc.nextInt();
		EmployeeDetails emd = new EmployeeDetails();
		emd.Details();
	}
}