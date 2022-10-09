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
				System.out.println("Please Enter the employee ID:");
				String s = sc.nextLine();
				try {
					epv.viewFile(s);
					System.out.println("32");
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Press Enter");
				sc.nextLine();
				obj1.Menu();
				break;
			}
			case 3: {
				System.out.println("Please Enter the employee ID:");
				String s = sc.nextLine();
				EmployeeRemove epr = new EmployeeRemove();
				epr.removeFile(s);
				System.out.println("Press Enter");
				sc.nextLine();
				obj1.Menu();
				break;
			}
			case 4: {
				System.out.println("Please Enter the employee ID:");
				String I = sc.nextLine();
				try {
					epv.viewFile(I);
				} catch (Exception e) {
					System.out.println(e);
				}
				EmployeeUpdate epu = new EmployeeUpdate();
				System.out.println("Please Enter the details you want to update");
				System.out.println("\n For Example:\n");
				System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. "
						+ "Then write the new Name then Press Enter. It will Update the Name.\n");
				String s = sc.nextLine();
				System.out.println("Please enter update info");
				String n = sc.nextLine();
				try {
					epu.updateFile(I, s, n);
					System.out.println("Press Enter");
					sc.nextLine();
					obj1.Menu();
					break;
				} catch (IOException e) {
					System.out.println(e);
				}
			}
			case 5: {
				CodeExit c = new CodeExit();
				c.out();
			}
			}
		}

	}

}
