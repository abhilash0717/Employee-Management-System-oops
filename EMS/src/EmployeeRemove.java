import java.io.File;

public class EmployeeRemove {
	public void removeFile(String id) {
		File file = new File("file" + id + ".txt");
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("Employee details deleted successfully");
			} else {
				System.out.println("Employee details doesnt exists");
			}
		}
	}
}
