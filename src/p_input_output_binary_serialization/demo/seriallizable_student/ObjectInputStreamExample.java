package p_input_output_binary_serialization.demo.seriallizable_student;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src\\p_input_output_binary_serialization\\demo\\seriallizable_student\\testOutputObj.txt"));
            Student student = (Student) ois.readObject();
            System.out.println("Succeeded");
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
