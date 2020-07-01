package p_input_output_binary_serialization.demo;

import java.io.*;

public class FilterInputStreamWriteTxt {
private static final String PATH = "src/test.txt";

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(PATH));
            FilterInputStream filter = new BufferedInputStream(fileInputStream);
//            DataInputStream filter =  new DataInputStream(fileInputStream);
            int k=0;
            while ((k = filter.read())!=-1){
                System.out.println((char) k);
                System.out.println(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
