package i_stack_queue.excercise.to_chuc_du_lieu_hop_li_Demerging_su_dung_Queue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DemergingQueue_cach2 {
     static class Employee{
        private String name;
        private String sex;
        private String dayOfbirth;

        public Employee() {
        }

        public Employee(String name, String sex, String dayOfbirth) {
            this.name = name;
            this.sex = sex;
            this.dayOfbirth = dayOfbirth;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getDayOfbirth() {
            return dayOfbirth;
        }

        public void setDayOfbirth(String dayOfbirth) {
            this.dayOfbirth = dayOfbirth;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    ", dayOfbirth='" + dayOfbirth + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Employee> male = new LinkedList<>();
        Queue<Employee> female = new LinkedList<>();
        System.out.println("input size");
        int size = Integer.parseInt(scanner.nextLine());
        Employee [] employees = new Employee[size];
        Employee employeeTmp;
        for(int i=0;i<size;i++){
            System.out.println("input name");
            String name = scanner.nextLine();
//            employees[i] = new Employee()
            System.out.println("input sex");
            String sex = scanner.nextLine();
//            employees[i].sex=sex;
            System.out.println("input dayOfBirth");
            String dayOfBirth = scanner.nextLine();
//            employees[i].dayOfbirth=dayOfBirth;
            employeeTmp = new Employee(name,sex,dayOfBirth);
            employees[i] = employeeTmp;
        }
        for(int i=0;i<size;i++){
            if(employees[i].getSex().equals("male")){
                male.add(employees[i]);
            }else {
                female.add(employees[i]);
            }
        }
        while (!male.isEmpty()){
            System.out.println(male.remove().toString());
        }
        while (!female.isEmpty()){
            System.out.println(female.remove().toString());
        }

    }
}

