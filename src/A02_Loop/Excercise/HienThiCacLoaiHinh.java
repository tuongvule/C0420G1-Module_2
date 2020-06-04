package A02_Loop.Excercise;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Print the Rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right," +
                " botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4. Exit");

        int choice;
        System.out.println("Input your choose");
        choice=scanner.nextInt();

        switch (choice){
            case 1:
                int length, width;
                System.out.println("Input the length of Rectangle you want to draw");
                length = scanner.nextInt();
                System.out.println("Input the width of rectangle you want to draw");
                width = scanner.nextInt();

                for(int i=1; i<=width;i++){
                    for (int j=1;j<=length;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                int squareEdgeLength;
                System.out.println("Input the square edge length: ");
                squareEdgeLength = scanner.nextInt();

                for(int i=1;i<=squareEdgeLength;i++){
                    for (int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }

                for(int i=squareEdgeLength;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }

                for(int i=1;i<squareEdgeLength;i++){
                    for(int j=squareEdgeLength; j>i;j--){
                        System.out.print(" ");
                    }

                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }

                for(int i=squareEdgeLength;i>=1;i--){
                    for(int j=8;j>i;j--){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            case 3:
                int height;
                System.out.println("Input the high of the isosceles triangle: ");
                height = scanner.nextInt();
                for(int i=1;i<height;i++){
                    for(int j=height; j>i;j--){
                        System.out.print(" ");
                    }

                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    for (int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.exit(0);

            default:
                System.out.println("No Choice");
        }
    }
}
