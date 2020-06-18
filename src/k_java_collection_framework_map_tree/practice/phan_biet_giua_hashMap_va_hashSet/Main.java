package k_java_collection_framework_map_tree.practice.phan_biet_giua_hashMap_va_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 23, "Hue");
        Student student2 = new Student("Tuong", 27, "QNa");
        Student student3 = new Student("Cua", 26, "QNg");

        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student3);
        //entrySet()   Phương thức này sẽ trả về 1 Set bao gồm các Entry có trong HashMap
        // (cú pháp khai báo Set: Set<Map.Entry<K,V>> set = hashmap.entrySet();)
        //Tạo một Set lưu các EntrySet của HashMap
        // Set<Map.Entry<String, String>> setHashMap = hashmap.entrySet();

        //Sử dụng một vòng lặp for để iterator(nhắc lại) qua toàn bộ Entry(danh sách) vừa được lưu vào Set
//        for (Map.Entry<String,String> i:setHashMap){
//            System.out.println(i.getKey()+"   -->   "+i.getValue());
//        }
        for(Map.Entry<Integer,Student> student: studentMap.entrySet()){
            System.out.println(student.toString());
        }

        //-----------------
        System.out.println("dùng hashSet");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student3);
         for(Student student: students);
        System.out.println(students.toString());
    }
}
