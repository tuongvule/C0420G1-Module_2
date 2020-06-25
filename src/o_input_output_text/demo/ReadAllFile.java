package o_input_output_text.demo;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadAllFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(
                Paths.get("D:\\CODEGYM\\C0420G1-Module_2\\install_bst_Binary Search Tree_Read_only\\BST.java"),
                "UTF-8");//open file to read
        //  int inputInteger ;//= scanner.nextInt();  // đọc từ file D:\CODEGYM\C0420G1-Module_2\inputJavaTutorial.txt
        while (scanner.hasNextLine()){
            String lineData = scanner.nextLine();
            System.out.println("Second line data: "+ lineData);
        }
        scanner.close();//đóng file lại(đóng luồng lại)

    }
}
