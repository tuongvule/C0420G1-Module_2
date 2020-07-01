package q_string_regex.excercise.validate_name_of_class;

import java.util.Scanner;

public class TestNameOfClass {
    private static NameOfClass nameOfClass;
    public static void main(String[] args) {
        nameOfClass = new NameOfClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of class: ");
        String regex = scanner.nextLine();
        boolean isvalid = nameOfClass.validate(regex);
        System.out.println("Name of class is: " + regex +"isvalid: " + isvalid);
    }
}
