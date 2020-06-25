package k_java_collection_framework_map_tree.excercise.product_manager;

public class Product2 {
    private int Id;
    private String name;
    private int price;

    public Product2() {
    }

    public Product2(int id, String name, int price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
