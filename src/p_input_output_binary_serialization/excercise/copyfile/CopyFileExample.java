package p_input_output_binary_serialization.excercise.copyfile;

import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("D:\\CODEGYM\\C0420G1-Module_2\\testbinaryfile1.txt"));
            outStream = new FileOutputStream(new File("D:\\CODEGYM\\C0420G1-Module_2\\testbinaryfile2.txt"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
