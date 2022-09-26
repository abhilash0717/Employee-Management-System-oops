//this class has the code which will take the employee data
//and put it in a file
import java.io.IOException;
import java.io.FileWriter; //import for file operations
import java.util.HashSet;

public class AddDetails {

    public String addDetailsToFile(String name, int employeeId, String address, long phoneNumber, HashSet<Integer> ids) {

        // Writing into file
        // Note: The content taken above inside the
        // string
        String employeeData = "Employee name: " + name + "\n" + "EmployeeId: " + employeeId + "\n" + "address: " + address + "\n" +
                "phoneNumber : " + phoneNumber + "\n" + "\n";

        try{
            if(!ids.contains(employeeId)){
                String fileName = "C:/Users/Avinash S/Desktop/ABHI/" + "ID" + employeeId  + ".txt";

                FileWriter fWriter = new FileWriter(fileName);

                //adding the details to the file
                fWriter.write(employeeData);

                //adding the details to the set
                ids.add(employeeId);

                //pushing all the data present in the writer to the file
                fWriter.close();

            }else{
                return "\nCannot add the employee as the Employee data is already present in the file.";
            }
        }catch (IOException e) {
            return "\nFailed to save the details of the employee.. Try again later";
        }

        for(int i : ids) System.out.println(i);
        return "\nEmployee details saved successfully.";
    }
}
