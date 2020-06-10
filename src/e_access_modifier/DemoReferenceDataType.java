package e_access_modifier;

public class DemoReferenceDataType {
    static class Person{
        public String name;

        public Person(String name){
            this.name=name;
        }
    }
    public static void swap(Person first, Person second){
            String temp = first.name;
            first.name = second.name;
            second.name = temp;
    }

    public static void main(String[] args) {
        Person a  = new Person("Tuong");
        Person b = new Person("Cat");
        swap(a,b);
        System.out.println("a.name= " +a.name);
        System.out.println("b.name= "+b.name);
    }
}
