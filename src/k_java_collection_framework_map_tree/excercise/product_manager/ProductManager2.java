package k_java_collection_framework_map_tree.excercise.product_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager2 {
    static List<Product2> listProduct2 = new ArrayList<Product2>();

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.print("Input price: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product2 sp = new Product2(id, name, price);
        listProduct2.add(sp);
        System.out.println("List of Products: ");
        for (int i = 0; i < listProduct2.size(); i++) {
            System.out.println("ID: " + listProduct2.get(i).getId() + ", name: " + listProduct2.get(i).getName() + " Price: " + listProduct2.get(i).getPrice() + "USD");
        }
        System.out.println("-------------------------");

    }

    public static void editProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Input product's ID you want to edit: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Editing name of product: ");
        String name = sc.nextLine();
        for (int i = 0; i < listProduct2.size(); i++) {
            if (id == listProduct2.get(i).getId()) {
                listProduct2.get(i).setName(name);
            }
        }
        System.out.println("List of product ");
        for (int i = 0; i < listProduct2.size(); i++) {
            System.out.println("ID: " + listProduct2.get(i).getId() + ", name: " + listProduct2.get(i).getName() + ", Price: " + listProduct2.get(i).getPrice() + "USD");
        }
        System.out.println("-------------------------");
    }

    public static void deleteProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập id sản phẩm muốn xóa: ");
        int id = sc.nextInt();
        for (int i = 0; i < listProduct2.size(); i++) {
            if (listProduct2.get(i).getId() == id) {
                listProduct2.remove(i);
            }
        }
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < listProduct2.size(); i++) {
            System.out.println(listProduct2.get(i).getId() + ". " + listProduct2.get(i).getName() + ": " + listProduct2.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }

    public static void displayProduct() {
        System.out.println();
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < listProduct2.size(); i++) {
            System.out.println(listProduct2.get(i).getId() + ". " + listProduct2.get(i).getName() + ": " + listProduct2.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }

    public static void findProduct() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        String name = sc.nextLine();
        for (int i = 0; i < listProduct2.size(); i++) {
            if (name.equals(listProduct2.get(i).getName())) {
                System.out.println("Thông tin sản phẩm bạn muốn tìm: ");
                System.out.println(listProduct2.get(i).getId() + ". " + listProduct2.get(i).getName() + ": " + listProduct2.get(i).getPrice() + "đ");
            }
        }
        System.out.println("-------------------------");
    }

    public static void sortIncreasePrice() {
        boolean needNextPass = true;
        for (int k = 1; k < listProduct2.size() && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < listProduct2.size() - k; i++) {
                if (listProduct2.get(i).getPrice() > listProduct2.get(i + 1).getPrice()) {
                    Product2 temp = listProduct2.get(i);
                    listProduct2.set(i, listProduct2.get(i + 1));
                    listProduct2.set(i + 1, temp);
                    needNextPass = true;
                }
            }
        }

        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < listProduct2.size(); i++) {
            System.out.println(listProduct2.get(i).getId() + ". " + listProduct2.get(i).getName() + ": " + listProduct2.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }

    public static void sortDecreasePrice() {
        boolean needNextPass = true;
        for (int k = 1; k < listProduct2.size() && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < listProduct2.size() - k; i++) {
                if (listProduct2.get(i).getPrice() < listProduct2.get(i + 1).getPrice()) {
                    Product2 temp = listProduct2.get(i);
                    listProduct2.set(i, listProduct2.get(i + 1));
                    listProduct2.set(i + 1, temp);
                    needNextPass = true;
                }
            }
        }
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < listProduct2.size(); i++) {
            System.out.println(listProduct2.get(i).getId() + ". " + listProduct2.get(i).getName() + ": " + listProduct2.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }
}





