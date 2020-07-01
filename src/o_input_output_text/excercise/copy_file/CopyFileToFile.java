package o_input_output_text.excercise.copy_file;

import java.io.*;
import java.util.Scanner;

public class CopyFileToFile {
    static final String PATH = "src\\file1.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn chứa file bạn muốn copy");
        String PATH = scanner.nextLine();
        CopyFileToFile copyFileToFile = new CopyFileToFile();
        copyFileToFile.copyFile();
    }
public static void copyFile(){

    /** TẠO FILE RỖNG file2.txt */
    //Tạo đối tượng File trỏ tới đường dẫn
    File dir = new File("src");
    //Tạo thư mục nếu đường dẫn không tồn tại
    dir.mkdir();
    //Tạo đối tượng File trỏ tới đường dẫn
    File file = new File("src","file2.txt");
    try {
        //Tạo file
        if (file.createNewFile()){
            System.out.println("File created..");
        }else {
            System.out.println("File already exists..");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

//-------------------------------------------------------------------------------------------------------
    /**WRITE file2.txt BẰNG NỘI DUNG file1.txt SAU KHI ĐỌC file1.txt (tức copy nội dung file1 sang file2*/
    FileWriter fileWriter = null;
    try {
        fileWriter = new FileWriter("src\\file2.txt");
        fileWriter.write(readFile().toString());
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        if (fileWriter != null){
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//------------------------------------------------------------------------------------------------------
    /** METHOD TO READ FILE1.TXT*/
static StringBuffer readFile(){
    FileReader fileReader = null;
    BufferedReader bufferReader = null;
    try {
        fileReader = new FileReader(PATH);
        bufferReader = new BufferedReader(fileReader);
        StringBuffer result = new StringBuffer();
        String line = null;
        while ( (line = bufferReader.readLine()) != null){
            result.append(line);
        }
        System.out.println(result);
        bufferReader.close();
        fileReader.close();
        return result;
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}

}

