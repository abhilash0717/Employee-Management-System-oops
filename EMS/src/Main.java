import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean Continue = true;
		EmployeeDetails emd = new EmployeeDetails();
		ReadingData data = new ReadingData();
		RemovingEmployee RM = new RemovingEmployee();
        UpdatingEmployee UM = new UpdatingEmployee();

		//to continue till the user exits the console
		while (Continue) {
			Scanner sc = new Scanner(System.in);
			//displaying the prompts on the comm
			System.out.println("EMPLOYEE MANAGEMENT SYSTEM \n");
			System.out.println("Press 1 : To Add an employee details");
			System.out.println("Press 2 : To See an employee details");
			System.out.println("Press 3 : To Remove employee");
			System.out.println("Press 4 : To Update employee details");
			System.out.println("Press 5 : To Exit the EMS portal \n");
			System.out.print("Please Enter choice : ");

			//taking the input from the user
			//to select which option to select

			try{
				int choice = sc.nextInt();

				//switch case to choose which task to be performed
				switch (choice) {
					case 1:
						//adding an employee
						String isSaved = emd.Details();
						System.out.println(isSaved);
						Continue = true;
						break;
					case 2:
						//seeing the employee details
						String employeeFound = data.details();
						System.out.println(employeeFound);
						Continue = true;
						break;
					case 3:
						//removing an employee details
						String employeeRemoved = RM.removeEmployee();
						System.out.println(employeeRemoved);
						Continue = true;
						break;
					case 4:
						//updating the employee details
						String employeeUpdated = UM.details();
						System.out.println(employeeUpdated);
						Continue = true;
						break;
					case 5:
						//exiting from the console
						Continue = false;
						System.out.println("\n Exiting from the console..");
						break;
					default:
						//if nothing is selected, then
						System.out.println("Please select a valid option");
						Continue = true;
				}
			}catch (Exception e){
				System.out.println("Please enter a valid input details");
			}
		}

	}

}