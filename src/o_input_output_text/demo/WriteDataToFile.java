package o_input_output_text.demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriteDataToFile {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter = new PrintWriter("C:\\Users\\Admin\\Desktop\\KQ.TUONG", "UTF-8");
        printWriter.println("Hello Java Core!");
//        printWriter.append("Hello Java Core222\n");
//        printWriter.append("Hello Java Core222\n");
//        printWriter.append("Hello Java Core222\n");
//        printWriter.append("Hello Java Core222\n");
        printWriter.close();// nhớ luôn đóng file khi kết thúc chương trình, ko đóng thì dữ liệu ko được ghi
    }
}
