import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UpdatingEmployee {
    String name;
    int employeeId;
    String address;
    long phoneNumber;

    public String details() throws IOException {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee Name : ");
            name = sc.nextLine();
            System.out.print("Enter Employee ID : ");
            employeeId = sc.nextInt();
            System.out.println("Enter Employee Address : ");
            address = sc.next();
            System.out.println("Enter Employee PhoneNumber : ");
            phoneNumber = sc.nextLong();
        }catch (Exception e){
            System.out.println("Please enter a valid input details");
        }


        String isSuccess = update(name, employeeId, address, phoneNumber);
        return isSuccess;
    }

    public String update(String name, int employeeId, String address, long phoneNumber) throws IOException {
        String employeeData = "Employee name: " + name + "\n" + "EmployeeId: " + employeeId + "\n" + "address: " + address + "\n" +
                "phoneNumber : " + phoneNumber + "\n" + "\n";

        String fileName = "C:/Users/Avinash S/Desktop/ABHI/" + "ID" + employeeId  + ".txt";
        File file = new File(fileName);

        if(file.exists()){
            FileWriter fWriter = new FileWriter(fileName);
            fWriter.write("");
            fWriter.write(employeeData);
            fWriter.close();
        }else{
            return "\nEmployee with ID : " + employeeId + " is not available";
        }
        return "\n Employee updated successfully : " + employeeId + "";
    }
}
