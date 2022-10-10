import java.io.IOException;
import java.util.Scanner;

public class EMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeShow epv = new EmployeeShow();
		int i = 0;

//		Calling Main class
		Main obj1 = new Main();
		obj1.Menu();
		while (i < 6) {
			System.out.println("Please Enter the choice");
			i = Integer.parseInt(sc.nextLine());

//			Switch case
			switch (i) {
			case 1: {
				EmployeeAdd ep = new EmployeeAdd();
				ep.createFile();
				obj1.Menu();
				break;
			}
			case 2: {
//				To display or view employee details
				System.out.println("Please Enter the Employee ID: ");
				String s = sc.nextLine();
				try {
					epv.viewFile(s);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Press Enter to continue");
				sc.nextLine();
				obj1.Menu();
				break;
			}
			case 3: {
//				To remove employee details
				System.out.println("Please Enter the employee ID:");
				String s = sc.nextLine();
				EmployeeRemove epr = new EmployeeRemove();
				epr.removeFile(s);
				System.out.println("Press Enter to continue");
				sc.nextLine();
				obj1.Menu();
				break;
			}
			case 4: {
//				To check weather the given details are present or not
				System.out.println("Please Enter the employee ID:");
				String I = sc.nextLine();
				try {
					epv.viewFile(I);
				} catch (Exception e) {
					System.out.println("The Given Employee details is not available");
				}
//				Updating the employee details  
				EmployeeUpdate epu = new EmployeeUpdate();
				System.out.println("Please Enter the details you want to update");
				System.out.println("\n For Example:\n");
				System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. "
						+ "Then write the new Name then Press Enter. It will Update the Name.\n");
				String s = sc.nextLine();
				System.out.println("Please Enter the updated info");
				String n = sc.nextLine();
				try {
					epu.updateFile(I, s, n);
					System.out.println("Press Enter to continue");
					sc.nextLine();
					obj1.Menu();
					break;
				} catch (IOException e) {
					System.out.println("The given details cannot be updated");
				}
			}
			case 5: {
//				Condition to exit the code
				CodeExit c = new CodeExit();
				c.out();
			}
			}
		}

	}

}
