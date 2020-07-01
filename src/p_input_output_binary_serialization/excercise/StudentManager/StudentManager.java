package p_input_output_binary_serialization.excercise.StudentManager;

import p_input_output_binary_serialization.excercise.milk_products_manager.Milk;

import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    private static final String PATH = "src\\p_input_output_binary_serialization\\excercise\\StudentManager";
    static List<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        System.out.println("Input file's name: ");
        String fileName = scanner.nextLine();

        int choice = 0;

        while (choice!=6){
            System.out.println("\"----Menu Student Manager---\n" +
                    "1.Add Student\n2.Display Student\n"  +
                    "3.Delete Student by ID \n4.Search for Student by ID" +
                    "\n5.Edit Student by ID\n6.Exit\"");
            System.out.println("Input your choice in Menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentManager.addStudent(fileName);
                    int yesOrNo=0;
                    try {
                        while (yesOrNo!=1 || yesOrNo!=2){
                            System.out.println("Do you want to add this student?\n1.Yes\n2.No");
                            yesOrNo = Integer.parseInt(scanner.nextLine());
                            if(yesOrNo == 1){
                                studentManager.write(fileName);
                                System.out.println("Added successfully.");
                                break;
                            }
                            if (yesOrNo==2){
                                System.out.println("Cancelled successfully.");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    studentManager.displayStudent(fileName);
                    break;
                case 3:
                    studentManager.deleteStudent(fileName);
                    break;
                case 4:
                    studentManager.searchStudent(fileName);
                    break;
                case 5:
                    studentManager.editStudent(fileName);
                    break;
                case 6:
                    break;
            }


        }

    }

    public static void read(String fileName){
        boolean check = true;
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("src\\" +
                    "p_input_output_binary_serialization\\excercise\\StudentManager"+fileName+".csv"));
            while (check){
                Student student = (Student) objectInputStream.readObject();
                if(student !=null){
                studentList.add(student);
                }else {
                    check = false;
                }
            }
            objectInputStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    public static void write(String fileName){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\" +
                    "p_input_output_binary_serialization\\excercise\\StudentManager"+fileName+".csv"));
            for (int i = 0; i <studentList.size(); i++) {
                objectOutputStream.writeObject(studentList.get(i));
            }
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addStudent(String fileName){
        File dir = new File(PATH);
        dir.mkdir();
        File file = new File(PATH, fileName+".csv");
        try {
            if(file.createNewFile()){
                System.out.println("File created");
            }else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        read(fileName);/**gọi hàm đọc để lấy ra ds đang có trong file*/
        int id= (studentList.size()>0) ? (studentList.size()+1) :1;
        System.out.println("Input name of student: ");
        String name = scanner.nextLine();
        System.out.println("Input age of student: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input class of student: ");
        String classStudent = scanner.nextLine();

        Student student = new Student(id, name, age, classStudent);
        studentList.add(student);
    }

    public static void input(String fileName){
        write(fileName);
        studentList.clear();
    }

    public static void displayStudent(String fileName){
        read(fileName);
        System.out.println();
        System.out.println("List of students is: ");
        for (int i = 0; i <studentList.size() ; i++) {
            System.out.println(studentList.get(i));
        }
        studentList.clear();
        System.out.println();
    }

    public static void deleteStudent(String fileName){
        System.out.println("Input student's Id that you wanna delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <studentList.size() ; i++) {
            if(studentList.get(i).getId()==id){
                studentList.remove(studentList.get(i));
            }else if(i==studentList.size()-1){
                System.out.println("The id you just inputted doesn't exist.");
                deleteStudent(fileName);
            }
        }
        write(fileName);
        studentList.clear();
    }

    public static void editStudent(String fileName){
        read(fileName);
        String name;
        int age;
        String classStudent;
        System.out.println("Input student's id you wanna edit: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <studentList.size() ; i++) {
            if(id==studentList.get(i).getId()){
                System.out.println("Input again student's info: ");
                System.out.println("Input student's name");
                name = scanner.nextLine();
                System.out.println("Input student's age");
                age = Integer.parseInt(scanner.nextLine());
                System.out.println("Input student's class: ");
                classStudent = scanner.nextLine();
                studentList.get(i).setName(name);
                studentList.get(i).setAge(age);
                studentList.get(i).setStudentClass(classStudent);
                studentList.clear();
                return;
            }
        }
    }

    public static void searchStudent(String fileName){
        read(fileName);
        System.out.println("Input student's id you wanna find");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <studentList.size(); i++) {
            if(id == studentList.get(i).getId()){
                System.out.println("Student you wanna find is: "+studentList.get(i));
                return;
            }else if(i==studentList.get(i).getId()-1){
                System.out.println("There are no students you want to search");
                searchStudent(fileName);
            }
        }
        studentList.clear();
    }

}
