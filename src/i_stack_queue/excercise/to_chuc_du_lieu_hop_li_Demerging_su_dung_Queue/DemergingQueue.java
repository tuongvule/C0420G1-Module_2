package i_stack_queue.excercise.to_chuc_du_lieu_hop_li_Demerging_su_dung_Queue;

import java.util.LinkedList;
import java.util.Queue;
public class DemergingQueue {
    public static void main(String[] args) {
        Queue<Student> male = new LinkedList<>();
        Queue<Student> female = new LinkedList<>();
        int size = 5;
        Student[] profile = new Student[size];
//        ----------------------------------------
        profile[0] = new Student("Huy","Male","23/05/1990");
        profile[1] = new Student("Duong","Male","21/02/1990");
        profile[2] = new Student("Nhung","Female","13/04/1990");
        profile[3] = new Student("Minh","Male","25/12/1990");
        profile[4] = new Student("Linh","Female","19/05/1990");
//        ---------------------------------------
        for (int i = 0; i < size; i++) {
            if (profile[i].getGender().equals("Male")) {
                male.add(profile[i]);
            } else if (profile[i].getGender().equals("Female")) {
                female.add(profile[i]);
            }
        }
//        ---------------------------------------
        while(!female.isEmpty()){
            System.out.println(female.remove().toString());
        }
        while(!male.isEmpty()){
            System.out.println(male.remove().toString());
        }
    }

    public static class Student {
        private String name;
        private String gender;
        private String birthDay;

        public Student() {
        }

        public Student(String name, String gender, String birthDay) {
            this.name = name;
            this.gender = gender;
            this.birthDay = birthDay;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(String birthDay) {
            this.birthDay = birthDay;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", birthDay='" + birthDay + '\'' +
                    '}';
        }
    }
}
