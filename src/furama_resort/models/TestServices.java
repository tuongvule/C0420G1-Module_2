package furama_resort.models;

public class TestServices {
    public static void main(String[] args) {
        House house1=new House("11","aaa",12,16,19,
                "vip","chuan","44",8);
        house1.showInfo();
        Villa villa =new Villa("11","aaa",12,16,19,
                "vip","chuan","44",8,99);
        villa.showInfo();
        Room room = new Room("11","aaa",12,16,19,
                "vip","chuan");
        room.showInfo();

    }
}
