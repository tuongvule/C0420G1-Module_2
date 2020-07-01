package p_input_output_binary_serialization.excercise.milk_products_manager;

import java.io.Serializable;

public class Milk implements Serializable {
    private int id;
    private String name;
    private String kindOfMilk;
    private int price;

    public Milk() {
    }

    public Milk(int id, String name, String kindOfMilk, int price) {
        this.id = id;
        this.name = name;
        this.kindOfMilk = kindOfMilk;
        this.price = price;
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

    public String getKindOfMilk() {
        return kindOfMilk;
    }

    public void setKindOfMilk(String kindOfMilk) {
        this.kindOfMilk = kindOfMilk;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kindOfMilk='" + kindOfMilk + '\'' +
                ", price=" + price +
                '}';
    }
}
