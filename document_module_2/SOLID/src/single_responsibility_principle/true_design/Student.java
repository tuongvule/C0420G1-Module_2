package single_responsibility_principle.true_design;

/**
 * Class Student bây giờ chỉ còn dùng để mô tả thông tin Student
 */
public class Student {
    private String name;
    private int age;

    public Student() {
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
}
