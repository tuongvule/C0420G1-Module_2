package n_debug_xu_ly_ngoai_le.excercise;

import sun.security.util.math.ImmutableIntegerModuloP;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class InputSideOfTriangle {
    private int side1;
    private int side2;
    private int side3;
    private static boolean check;

    public InputSideOfTriangle() {
    }
    public InputSideOfTriangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) throws IllegalTriangleSideException {
        if(side1<0){
            check = false;
            throw new IllegalTriangleSideException("side1 phải lớn hơn 0");
        }else {
            this.side1 = side1;
        }
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) throws IllegalTriangleSideException {
        if(side2<0){
            check = false;
            throw new IllegalTriangleSideException("side2 phải lớn hơn 0 ");
        }else {
            this.side2 = side2;
        }
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) throws IllegalTriangleSideException {
        if(side3<0){
            check = false;
            throw new IllegalTriangleSideException("side3 phải lớn hơn 0");
        }else {
            this.side3 = side3;
        }
    }

    @Override
    public String toString() {
        return "Three sides of the triangle is: " +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +".";
    }

    public  void checkCondition3Sides(int side1, int side2, int side3) throws IllegalTriangleSideException {
        if (side1>side2+side3 || side2>side1+side2 || side3 >side1+side2){
            check = false;
            throw new IllegalTriangleSideException("Tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
    }


    public static void main(String[] args) {
        InputSideOfTriangle inputSideOfTriangle = new InputSideOfTriangle();
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("input side1 ");
                int side1 = Integer.parseInt(scanner.nextLine());
                inputSideOfTriangle.setSide1(side1);
                System.out.println("input side2");
                int side2 = Integer.parseInt(scanner.nextLine());
                inputSideOfTriangle.setSide2(side2);
                System.out.println("input side3");
                int side3 = Integer.parseInt(scanner.nextLine());
                inputSideOfTriangle.setSide3(side3);

                inputSideOfTriangle.checkCondition3Sides(side1, side2, side3);
                System.out.println(inputSideOfTriangle.toString());
                check =true;
            } catch (IllegalTriangleSideException e) {
                System.err.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Không nhập chữ");
                check = false;

            } catch (Exception e){
                System.out.println("Bạn đã có exception");
            }

        }while (!check);
    }
}
