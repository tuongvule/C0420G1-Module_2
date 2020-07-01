package furama_resort.models;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputSimilarVillaHouseRoom {
    static Scanner scanner = new Scanner(System.in);
    public void inputSimilarVillaHouseRoom(){
        boolean isvalid = false;
        //---------------1------------------------------------------
        String id;
        do{
            System.out.println("Input Villa's ID");
            id = scanner.nextLine();
            isvalid = Pattern.matches("SVVL-[0-9]{4}$",id);
            if(!isvalid){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid=false;
        //---------------2-------------------------------------------
        String nameService;
        do{
            System.out.println("Input name of Service:");
            nameService = scanner.nextLine();
            isvalid = Pattern.matches("^[A-Z][a-z]+$",nameService);
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid = false;
        //-----------------3------------------------------------------
        double usableArea;
        do {
            System.out.println("Input usable Area: ");
            usableArea = Double.parseDouble(scanner.nextLine());
            if(usableArea>30){
                isvalid=true;}
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
//            String check = Double.toString(usableArea);
//            isvalid = Pattern.matches("([3-9]{1}[0-9]{1})|([0-9]+[0-9]+[0-9]+$)",check);
        }while (!isvalid);
        isvalid = false;
        //--------------------4-----------------------------------------------------
        int rentalCosts;
        do{
            System.out.println("Input retal Costs:");
            rentalCosts = Integer.parseInt(scanner.nextLine());
            if(rentalCosts>0) {
                isvalid = true;
            }
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid = false;
        //----------------------5-------------------------------------------------
        int maxNumberOfPeople;
        do{
            System.out.println("Input Max Number Of People: ");
            maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
            if(maxNumberOfPeople>0 && maxNumberOfPeople<20){
                isvalid = true;
            }
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid = false;
        //-------------------6------------------------------------------------------
        String typeOfRent;
        do{
            System.out.println("Input Type Of Rent");
            typeOfRent = scanner.nextLine();
            isvalid = Pattern.matches("^[A-Z][a-z]+$",typeOfRent);
            if(isvalid=false){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        isvalid = false;
    }

}
