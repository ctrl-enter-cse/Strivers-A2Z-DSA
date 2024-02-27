import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileSerializationPract {
	public static void main(String[] args)   {
		
		
		Employee emp= new Employee();
		emp.setEmail("munna@gmail");
		emp.setPass("1234");
		
		try (FileOutputStream fos= new FileOutputStream("object.txt");
				ObjectOutputStream os = new ObjectOutputStream(fos)){
			os.writeObject(emp);
		}
		catch(FileNotFoundException fne) {
			fne.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		throws FileNotFoundException, IOException
		
		try (FileInputStream fileIn = new FileInputStream("object.txt");
	             ObjectInputStream in = new ObjectInputStream(fileIn)) {
			Employee deserializedObj = (Employee) in.readObject();
	            System.out.println("Non-transient field: " + deserializedObj.getEmail()); // Serialized
	            System.out.println("Transient field: " + deserializedObj.getPass()); // null
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	}
}
