package o_input_output_text.demo;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadDataFromFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(
                Paths.get("D:\\CODEGYM\\C0420G1-Module_2\\inputJavaTutorial.txt"),
                "UTF-8");//open file to read
        int inputInteger ;//= scanner.nextInt();  // đọc từ file D:\CODEGYM\C0420G1-Module_2\inputJavaTutorial.txt
        while (scanner.hasNextInt()){
            inputInteger = scanner.nextInt();
            System.out.println("Value: "+inputInteger);
        }
        scanner.nextLine();// không đọc dấu kết thúc dòng đầu tiên (dòng có chứa số)
        String lineData = scanner.nextLine();
        System.out.println("Second line data: "+ lineData);
        scanner.close();//đóng file lại(đóng luồng lại)

    }
}
