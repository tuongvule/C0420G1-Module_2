package a0_demo.comparable_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//thêm dòng lệnh này vào sau class Student: implements Comparable<Student>
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "\n";
    }

//    @Override
//    public int compareTo(Student student) {
////        return this.getAge()-student.getAge();//sắp xếp theo tuổi
////        return student.getName().compareTo(this.getName());// sắp xếp theo tên dcba
//        return this.getName().compareTo(student.getName());// sắp xếp theo tên abcd
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student> listStudent = new ArrayList<Student>();
//        Student student1 = new Student("Tường", 23);
//        listStudent.add(student1);
//        Student student2 = new Student("Thịnh",25);
//        listStudent.add(student2);
//        Student student3 = new Student("vu",24);
//        listStudent.add(student3);
//        Collections.sort(listStudent);
//        System.out.println(listStudent);
//    }

}
