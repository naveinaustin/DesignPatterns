import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.doSomething();
		
		Singleton s2 = Singleton.getInstance();
		s2.doSomething();
		
	/*	try {
			Singleton s3 = (Singleton)s2.clone();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
		try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(s1);
            out.close();
 
            s1.setI(20);
 
            // Serialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            Singleton instanceTwo = (Singleton) in.readObject();
            in.close();
 
            System.out.println(s1.getI());
            System.out.println(instanceTwo.getI());
 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}

}
