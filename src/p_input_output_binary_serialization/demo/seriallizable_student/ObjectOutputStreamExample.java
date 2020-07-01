package p_input_output_binary_serialization.demo.seriallizable_student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {


    public static void main(String[] args) {
        ObjectOutputStream oos = null;
      try {
          oos = new ObjectOutputStream(new FileOutputStream("src\\p_input_output_binary_serialization\\demo\\seriallizable_student\\testOutputObj.txt"));
          //create student
          Student student = new Student(1,"Mr Wall","Bình Sa",31);
          oos.writeObject(student);
          System.out.println("you created object student successfully");
          oos.close();
      } catch (IOException e) {
          e.printStackTrace();
      }

    }
}
