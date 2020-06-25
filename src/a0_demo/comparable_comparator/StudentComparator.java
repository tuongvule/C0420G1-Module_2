package a0_demo.comparable_comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // hai đối tượng mà null, coi như giống nhau
        if(o1 == null && o2==null){
            return 0;
        }
        // nếu o1 null, coi như o2 lớn hơn
        if(o1 == null ){
            return -1;
        }
        //nếu o2 null, coi như o1 lớn hơn
        if(o2 == null){
            return 1;
        }
        // sắp xếp tuổi tăng dần
        int value = o1.getAge()-o2.getAge();
        if(value!=0){//nếu tuổi bằng nhau thì không return value;tức value khác 0
            return value;
        }
        // nếu tuối bằng nhau thì sắp xếp theo tên
        value = o1.getName().compareTo(o2.getName());
        return value;

    }
}
