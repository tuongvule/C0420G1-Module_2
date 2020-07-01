package furama_resort.controllers;

import furama_resort.models.House;
import furama_resort.models.InputSimilarVillaHouseRoom;
import furama_resort.models.Room;
import furama_resort.models.Villa;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainController {
    private static String id;
    private static String nameService; //tên dịch vụ
    private static double usableArea;     //diện tích sử dụng
    private static int rentalCosts;    //chi phí thuê
    private static int maxNumberOfPeople;   //số lượng người  tối đa
    private static String typeOfRent;  // kiểu thuê(theo năm, tháng, ngày, giờ)
    private static String freeAccompanyingService;

    static Scanner scanner = new Scanner(System.in);
    static MainController mainController = new MainController();
    public static void main(String[] args) {

        mainController.displayMainMenu();
    }
    public void displayMainMenu(){
        System.out.println("-----  MENU  -----");
        System.out.println("1.\tAdd New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");

        int choice=0;
        while (choice!=7){
            System.out.println("Input your choice in Menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    mainController.addNewServies();
                    break;
                case 2:
                    mainController.showServices();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        }
    }
    public void addNewServies(){
        int choiceService =0;
        while (choiceService!=5){
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("Select the service you want to hire");
            choiceService = Integer.parseInt(scanner.nextLine());
            switch (choiceService){
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    mainController.displayMainMenu();
                    break;
                case 5:
                    break;
            }
        }

    }

    public static void addNewVilla(){
        System.out.println("Please input the information of the Villa rental service below:");
        boolean isvalid=false;
        InputSimilarVillaHouseRoom inputSimilarVillaHouseRoom = new InputSimilarVillaHouseRoom();
        inputSimilarVillaHouseRoom.inputSimilarVillaHouseRoom();
        //---------------------7-----------------------------------------------------
        String roomStandard;
        do{
            System.out.println("Input Room Standard: ");
            roomStandard = scanner.nextLine();
            isvalid = Pattern.matches("^[A-Z][a-z]+$",roomStandard);
           if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid = false;
        //----------------------8-------------------------------------------------

        System.out.println("Input Other Facilities:");
        String otherFacilities = scanner.nextLine();
        //-----------------------9------------------------------------------
        double poolArea;
        do {
            System.out.println("Input Pool Area");
            poolArea = Double.parseDouble(scanner.nextLine());
            if(poolArea>30){
                isvalid=true;}
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid = false;

        //-------------------------10-----------------------------
        double numberOfFloors;
        do {
            System.out.println("Input Number of Floors");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
            if(numberOfFloors>0){
                isvalid=true;}
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid = false;
       //----------------------------------------------------------

        String PATH = "src\\furama_resort\\data\\villa.csv";

        try {
            FileWriter fileWriter = new FileWriter(PATH,true);
            fileWriter.write(id+", "+nameService+", "+usableArea+","+rentalCosts+","+maxNumberOfPeople+","+
                    typeOfRent+","+roomStandard+","+otherFacilities+","+poolArea+","+numberOfFloors+"\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addNewHouse(){
        System.out.println("Please input the information of the House rental service below:");
        boolean isvalid=false;
        InputSimilarVillaHouseRoom inputSimilarVillaHouseRoom = new InputSimilarVillaHouseRoom();
        inputSimilarVillaHouseRoom.inputSimilarVillaHouseRoom();
        //---------------------7-----------------------------------------------------
        String roomStandard;
        do{
            System.out.println("Input Room Standard: ");
            roomStandard = scanner.nextLine();
            isvalid = Pattern.matches("^[A-Z][a-z]+$",roomStandard);
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid = false;
        //----------------------8-------------------------------------------------

        System.out.println("Input Other Facilities:");
        String otherFacilities = scanner.nextLine();

        //-------------------------9-----------------------------
        double numberOfFloors;
        do {
            System.out.println("Input Number of Floors");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
            if(numberOfFloors>0){
                isvalid=true;}
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid = false;
        //----------------------------------------------------------


        String PATH = "src\\furama_resort\\data\\house.csv";

        try {
            FileWriter fileWriter = new FileWriter(PATH,true);
            fileWriter.write(id+", "+nameService+", "+usableArea+","+rentalCosts+","+maxNumberOfPeople+","+
                    typeOfRent+","+roomStandard+","+otherFacilities+","+numberOfFloors+","+"\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addNewRoom(){
        System.out.println("Please input the information of the House rental service below:");
        boolean isvalid=false;
        InputSimilarVillaHouseRoom inputSimilarVillaHouseRoom = new InputSimilarVillaHouseRoom();
        inputSimilarVillaHouseRoom.inputSimilarVillaHouseRoom();
        //-----
        do{
            System.out.println("Input The free accompanying Service:");
            String freeAccompanyingService = scanner.nextLine();
            if(freeAccompanyingService=="massage"||freeAccompanyingService=="karaoke"||
                    freeAccompanyingService=="food"||freeAccompanyingService=="drink"||freeAccompanyingService=="car"){
                isvalid=true;
            }
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);


        //---------------------------------
        String PATH = "src\\furama_resort\\data\\room.csv";

        try {
            FileWriter fileWriter = new FileWriter(PATH,true);
            fileWriter.write(id+", "+nameService+", "+usableArea+","+rentalCosts+","+maxNumberOfPeople+","+
                    typeOfRent+","+freeAccompanyingService+","+"\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showServices(){

        int choice =0;
        while (choice!=8){
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.println("Input your choice in menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    mainController.displayMainMenu();
                    break;
                case 8:
                    break;
            }
        }
    }
    public static void showAllVilla(){
        String PATH = "src\\furama_resort\\data\\villa.csv";
        List <Villa> villaList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
//            StringBuffer result = new StringBuffer();
            String line = null;
            Villa villa;
            String [] arrVilla;
            while ((line=bufferedReader.readLine())!=null){
//                result.append(line);
                arrVilla = line.split(",");
                villa = new Villa(arrVilla[0],arrVilla[1],Double.parseDouble(arrVilla[2]),Integer.parseInt(arrVilla[3]),
                        Integer.parseInt(arrVilla[4]),arrVilla[5],arrVilla[6],arrVilla[7],
                        Double.parseDouble(arrVilla[8]),Integer.parseInt(arrVilla[9]));
                villaList.add(villa);
            }
            bufferedReader.close();
            fileReader.close();
//            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("List of villa: ");
        for(Villa villa: villaList){
            villa.showInfo();
        }
    }

    public static void showAllHouse(){
        String PATH = "src\\furama_resort\\data\\house.csv";
        List <House> houseList = new ArrayList<>();
        String line = null;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))){
            while ((line= bufferedReader.readLine())!=null){
                String[]arrHouse = line.split(",");
                House house = new House(arrHouse[0],arrHouse[1],Double.parseDouble(arrHouse[2]),
                        Integer.parseInt(arrHouse[3]),Integer.parseInt(arrHouse[4]),arrHouse[5],
                        arrHouse[6],arrHouse[7],Integer.parseInt(arrHouse[8]));
                houseList.add(house);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("List of House is:");
        for (House house: houseList){
            house.showInfo();
        }

    }

    public void showAllRoom(){
        String PATH = "src\\furama_resort\\data\\room.csv";
        String line = null;
        List<Room> roomList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))){
            while ((line=bufferedReader.readLine())!=null){
                String[] arrRoom = line.split(",");
                Room room = new Room(arrRoom[0],arrRoom[1],Double.parseDouble(arrRoom[2]),Integer.parseInt(arrRoom[3]),
                        Integer.parseInt(arrRoom[4]),arrRoom[5],arrRoom[6]);
                roomList.add(room);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("List of Room is: ");
        for(Room room: roomList){
            room.showInfo();
        }
    }



}
