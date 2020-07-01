package o_input_output_text.excercise.copy_file;

import java.io.*;
import java.util.Scanner;

public class CopyFileText_NhatHuy {
    static final String PATH = "src\\file1.txt";

        public void copyFile (String newfile, String filePath){
            /** Tạo file mới, rỗng */

            File file = new File (PATH); //tạo đối tượng file trỏ tới đường dẫn
            file.mkdir();//tạo thư mục nếu đường dẫn không tồn tại
            File file1 = new File(PATH, newfile);//tạo đối tượng file trỏ tới đường dẫn, tên file mới là newfile
            try {
                if (file1.createNewFile()){
                    System.out.println("File created");
                }else {
                    System.out.println("File already exits");
                }
            } catch (IOException e) {

            }

            /** Đọc file cần được copy (đã có)*/
            File file2 = new File(filePath);
            StringBuffer str = new StringBuffer();
            try {
                if(!file2.exists()){
                    throw new FileNotFoundException();
                }
                BufferedReader br = new BufferedReader(new FileReader(file2));
                String line = "";
                while ((line = br.readLine())!=null){
                    str.append(line).append("\n");
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** ghi nội dung file đã có vào file mới(new file)*/
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file1);
                fileWriter.write(String.valueOf(str));
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** chạy chương trình */
            CopyFileText_NhatHuy copyFileText_nhatHuy = new CopyFileText_NhatHuy();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập đường dẫn file để copy: ");
            String fileCopy = scanner.nextLine();
            System.out.println("Nhập tên file mới");
            String File = scanner.nextLine();
            copyFileText_nhatHuy.copyFile(File, fileCopy);
        }

}
