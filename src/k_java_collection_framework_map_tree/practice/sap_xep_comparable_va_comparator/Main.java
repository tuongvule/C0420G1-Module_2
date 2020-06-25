package k_java_collection_framework_map_tree.practice.sap_xep_comparable_va_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vũ", 23,"DN");
        Student student2 = new Student("Thịnh", 24, "DN");
        Student student3 = new Student("Huy", 27, "Quảng Bình");
        Student student4 = new Student("Việt", 29, "Hà Nội");
        ArrayList<Student> listStudent = new ArrayList<Student>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        Collections.sort(listStudent);
        for(Student student : listStudent){
            System.out.println(student);
        }
//        System.out.println(listStudent);
        System.out.println("Sắp xếp theo tuổi: ");
        Collections.sort(listStudent,new AgeComparator());
        for(Student student: listStudent){
            System.out.println(student);
        }
    }
}
