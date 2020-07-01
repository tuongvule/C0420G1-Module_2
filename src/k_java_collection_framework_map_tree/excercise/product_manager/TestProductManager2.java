package k_java_collection_framework_map_tree.excercise.product_manager;

import java.util.Scanner;

public class TestProductManager2 {
    public static void main(String[] args) {

        ProductManager2 pro = new ProductManager2();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean check = true;
        while (check) {
            System.out.println("1.Add product " +
                    "\n2.Edit product" +
                    "\n3.Delete product" +
                    "\n4.Display list of products" +
                    "\n5.Finding a product" +
                    "\n6.Sort list of products by price" +
                    "\n7.Exit");
            System.out.println("Input your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    pro.addProduct();
                    break;
                case 2:
                    pro.editProduct();
                    break;
                case 3:
                     pro.deleteProduct();
                    break;
                 case 4:
                    pro.displayProduct();
                    break;
                case 5:
                    pro.findProduct();
                    break;
                case 6:
                    System.out.println("1.Sắp xếp tăng"+
                        "2.Sắp xếp giảm");
                    int choiceTypeSort = Integer.parseInt(scanner.nextLine());
                    switch (choiceTypeSort){
                        case 1:
                            pro.sortIncreasePrice();
                            break;
                        case 2:
                            pro.sortDecreasePrice();
                            break;
                    }
                    break;
                    case 7:
                        check = false;
                        break;
            }

        }
    }
}
