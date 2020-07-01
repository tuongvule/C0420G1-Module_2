import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String address;
    private int age;

    public void Student() {
    }

    public Student(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student@[id=" + id + " , name=" + name + ", "
                + "address= " + address + ",age =" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student otherStudent = (Student) obj;
            if (this.id == otherStudent.id) {
                return true;
            }
        }
        return false;
    }
}
