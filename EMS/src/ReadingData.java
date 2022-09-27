import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingData {
    int employeeId;

    FileReader fr;

    public String details() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID : ");
        employeeId = sc.nextInt();


        String employeeFound = getEmployeeDetails(employeeId);
        return employeeFound;
    }

    public String getEmployeeDetails(int employeeId) throws IOException {

        try{
            File fileName = new File("C:/Users/Avinash S/Desktop/ABHI/" + "ID" + employeeId  + ".txt");
            fr = new FileReader(fileName);
            if(fileName.exists()) {
                // Declaring loop variable
                int i;
                // Holds true till there is nothing to read
                while ((i = fr.read()) != -1)
                    // Print all the content of a file
                    System.out.print((char)i);

                fr.close();
            }else{
                return "\nEmployee with ID : " + employeeId + " is not available";
            }
        }
        catch (Exception e){
            return "\nEmployee with ID : " + employeeId + " is not available";
        }
        return "\nEmployee with ID : " + employeeId + " is found successfully";
    }
}
