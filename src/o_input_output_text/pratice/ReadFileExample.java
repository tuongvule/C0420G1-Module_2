package o_input_output_text.pratice;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileExample {
    //Tạo phương thức readFileText với đối số truyền vào là đường dẫn file mà người dùng nhập vào.
public void readFileText(String filePath){
    try {
        //Đọc file theo đường dẫn
        File file = new File(filePath);

        //Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
        if(!file.exists()) {
            throw new FileNotFoundException();
        }

        // Đọc từng dòng của file và tiến hành cộng tất cả lại
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        int sum = 0;
        while ((line = br.readLine()) != null){
            System.out.println(line);
            sum += Integer.parseInt(line);
        }
        br.close();// đóng file
        System.out.println("Tổng" + sum);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        System.out.println("File không tồn tại");
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Nội dung có lỗi");
    }catch (Exception e){
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file");
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);

    }
}