import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;

public class RemovingEmployee {

    int employeeId;

    Logger log = Logger.getLogger(RemovingEmployee.class.getName());

    public String removeEmployee()  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID : ");
        employeeId = sc.nextInt();


        String employeeRemoved = remove(employeeId);
        return employeeRemoved;
    }

    private String remove(int employeeId) {
        File fileName = new File("C:/Users/Avinash S/Desktop/ABHI/" + "ID" + employeeId  + ".txt");

        if(fileName.exists()) {
            fileName.delete();
            EmployeeDetails.ids.remove(employeeId);
            return "\n Employee removed successfully : " + employeeId + "";
        }

        return "\nEmployee with ID : " + employeeId + " is not available";
    }


}
