package p_input_output_binary_serialization.demo;

import java.io.*;

public class FilterOutputStreamWriteTxt {
    public static final String PATH = "src/test.txt";
    public static void main(String[] args) {
        FileOutputStream file = null;//khai báo đói tượng
        FilterOutputStream filter = null;//khai báo đói tượng
        try {
            file = new FileOutputStream(new File(PATH));
            filter = new FilterOutputStream(file);
            int s = 65;
            filter.write(s);
            filter.flush();
            System.out.println("Success...");
            filter.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
