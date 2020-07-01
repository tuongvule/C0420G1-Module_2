package o_input_output_text.demo;

import java.util.Scanner;

public class InputMultiLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (scanner.hasNextLine()) {
            String tempStr = scanner.nextLine();
            if (tempStr.isEmpty()) break;
            str += tempStr + "\n";
        }
        System.out.println();
    }
}
