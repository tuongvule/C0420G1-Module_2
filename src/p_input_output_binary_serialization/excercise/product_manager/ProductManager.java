package p_input_output_binary_serialization.excercise.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static final String PATH = "src\\p_input_output_binary_serialization\\excercise\\product_manager";
    static List<Product> list = new ArrayList<>();
    static List<Product> listShow = new ArrayList<>();

    public static void add() {
        File mk = new File(PATH);
        mk.mkdir();
        File file = new File(PATH, "product_manager.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("\"File created..\"");
            } else
                System.out.println("File already exists..");
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean bool = true;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("product_manager.csv"));
            while (bool) {
                Product product = (Product) objectInputStream.readObject();
                if (product != null) {
                    list.add(product);
                } else
                    bool = false;
            }
        } catch (Exception e) {
            e.getMessage();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập id sp ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sp: ");
        String name = scanner.nextLine();
        System.out.print("Nhập hãng sx: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập giá sp: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập thông tin khác của sp: ");
        String other = scanner.nextLine();
        Product product = new Product(id, name, manufacturer, price, other);
        list.add(product);

    }


    public static void input() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("product_manager.csv"));
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void show() {
        boolean bool = true;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("product_manager.csv"));
            while (bool) {
                Product product = (Product) objectInputStream.readObject();
                if (product != null) {
                    listShow.add(product);
                } else
                    bool = false;
            }
        } catch (Exception e) {
            e.getMessage();
        }

        boolean needNextPass = true;

        for (int k = 1; k < listShow.size() && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < listShow.size() - k; i++) {
                if (listShow.get(i).getId() > listShow.get(i + 1).getId()) {
                    Product temp = listShow.get(i);
                    listShow.set(i, listShow.get(i + 1));
                    listShow.set(i + 1, temp);
                    needNextPass = true;
                }
            }
        }


        System.out.println();
        System.out.println("Danh sách sp:");
        for (int i = 0; i < listShow.size(); i++) {
            System.out.println(listShow.get(i));
        }
        System.out.println();
    }

    public static void find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập tên sp muốn tìm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < listShow.size(); i++) {
            if (name.equals(listShow.get(i).getName())) {
                System.out.println("Sp bạn tìm có ID là: " + "\n" + listShow.get(i).getId() + "\n");
                return;
            } else if (i == listShow.size() - 1) {
                System.out.println("Sp cần tìm không có trong ds" + "\n");
            }
        }
    }

    public static void main(String[] args) {
        ProductManager pro = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("------Product Manager------");
            System.out.println("1.Thêm sản phẩm" +
                    "\n2.Hiển thị danh sách sp " +
                    "\n3.Tìm sp theo tên" +
                    "\n4.Thoát");
            System.out.print("Nhập lựa chọn thao tác: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    pro.add();
                    System.out.println("Are you input this product: " + "\n1.yes" + "\t2.no");
                    int num = Integer.parseInt(scanner.nextLine());
                    switch (num) {
                        case 1:
                            pro.input();
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 2:
                    pro.show();
                    break;
                case 3:
                    pro.find();
                    break;
                case 4:
                    break;
            }
        }

    }
}
