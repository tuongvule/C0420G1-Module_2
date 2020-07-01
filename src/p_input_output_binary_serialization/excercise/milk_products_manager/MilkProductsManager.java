package p_input_output_binary_serialization.excercise.milk_products_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MilkProductsManager {
    private static final String PATH ="src\\p_input_output_binary_serialization\\excercise\\milk_products_manager" ;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Milk> listOfMilkProducts = new ArrayList<>();
    static ArrayList <Milk> listOfMilkDisplay = new ArrayList<>();

    public static void main(String[] args) {

        MilkProductsManager milkProductsManager = new MilkProductsManager();

        int choice=0;
        while (choice!=4){
            System.out.println("----Milk Products Manager---\n1.Add Milk Products\n2.Display Milk Products\n" +
                    "3.Search For Milk Product\n4.Exit");
            System.out.println("Input your choice, then press Enter");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    milkProductsManager.addMilkProduct();
                    int yesOrNo;
                    do {
                        System.out.println("Do you want to add this product?\n1.Yes.\n2.No");
                        yesOrNo = Integer.parseInt(scanner.nextLine());
                        switch(yesOrNo){
                            case 1:
                                milkProductsManager.inputMilkProduct();
                                System.out.println("The product has been added successfully");
                                break;
                            case 2:
                                System.out.println("The product has not been added.");
                                break;
                            default:
                                System.out.println("You can only choose 1 or 2, please choose again!");
                        }

                    }while (yesOrNo!=1 && yesOrNo!=2);

                    break;
                case 2:
                    milkProductsManager.displayMilkProduct();
                    break;
                case 3:
                    milkProductsManager.searchForMilkProduct();
                    break;
                case 4:
                    break;
            }
        }

    }

    private static void searchForMilkProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Input product's name you want to find: ");
        String name = scanner.nextLine();
        for (int i = 0; i < listOfMilkDisplay.size(); i++) {
            if (name.equals(listOfMilkDisplay.get(i).getName())) {
                System.out.println("The product's ID you want to find is: " + "\n" + listOfMilkDisplay.get(i) + "\n");
                return;
            } else if (i == listOfMilkDisplay.size() - 1) {
                System.out.println("The product you are looking for is not in the list" + "\n");
            }
        }
    }


    private static void addMilkProduct() {
        /**TẠO FILE ĐỂ LƯU SẢN PHẨM */
        File dir = new File(PATH);                           //tạo đối tượng file trỏ tới thư mục có đường dẫn PATH
        dir.mkdir();                                         // tạo thư mục nếu nó không tồn tại (mkdir: make direction)
        File file = new File(PATH,"listOfMilkProducts.csv");        //tạo đối tượng file trỏ tới đường dẫn
        try {
            if(file.createNewFile()){
                System.out.println("file created");
            }else {
                System.out.println("file already exits");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean check = true;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src\\p_input_output_binary_serialization\\excercise\\milk_products_manager\\listOfMilkProducts.csv"));
            while (check) {
                Milk milkProduct  = (Milk) objectInputStream.readObject();
                if (milkProduct != null) {
                    listOfMilkProducts.add(milkProduct);
                } else
                    check = false;
            }
        } catch (Exception e) {
            e.getMessage();
        }

        System.out.println("Input information of the product that you want to add into list of Milk Products.");
        System.out.println("Input product ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input product's name:");
        String name = scanner.nextLine();
        System.out.println("Input kind of Milk:");
        String kindOfMilk = scanner.nextLine();
        System.out.println("Input price of Milk");
        int price = Integer.parseInt(scanner.nextLine());
        Milk milkProduct = new Milk(id,name,kindOfMilk,price);

        listOfMilkProducts.add(milkProduct);

    }
    private static void inputMilkProduct() {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\p_input_output_binary_serialization\\excercise\\milk_products_manager\\listOfMilkProducts.csv"));
            for (int i = 0; i <listOfMilkProducts.size() ; i++) {
                objectOutputStream.writeObject(listOfMilkProducts.get(i));
            }
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    private static void displayMilkProduct() {
        boolean check = true;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src\\p_input_output_binary_serialization\\excercise\\milk_products_manager\\listOfMilkProducts.csv"));
            while (check){
                Milk milkProductDisplay = (Milk) objectInputStream.readObject();
                if(listOfMilkProducts!=null){
                    listOfMilkDisplay.add(milkProductDisplay);
                }else {
                    check=false;
                }
            }

        }catch (Exception e){
            e.getMessage();
        }
        /** SĂP XẾP SẢN PHẨM VÀ XUẤT RA CONSOLE, dùng nổi bọt */
        boolean nextNeedPass = true;
        for (int i = 1; i <listOfMilkDisplay.size() && (nextNeedPass); i++) {
            nextNeedPass = false;
            for (int j = 0; j <listOfMilkDisplay.size()-i; j++) {
                Milk temp = listOfMilkDisplay.get(j);
                if(listOfMilkDisplay.get(j).getId()> listOfMilkDisplay.get(j + 1).getId()){
                    listOfMilkDisplay.set(j,listOfMilkDisplay.get(j+1));
                    listOfMilkDisplay.set(j+1,temp);
                    nextNeedPass = true;
                }
            }
        }
        System.out.println("List of milk products:");
        for (int i = 0; i <listOfMilkDisplay.size() ; i++) {
            System.out.print(listOfMilkDisplay.get(i) +"\n");
        }
        System.out.println();
    }
}
