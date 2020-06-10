package c_array_and_method.Practice;

public class MangHaiChieu_TaoBanDoTroChoiMineSweeper {
    public static void main(String[] args) {
        String [][] map = {
                {"*", "."}
        };
        final int MAP_WIDTH = map[0].length;
        for(int xOrdinate = 0; xOrdinate< MAP_WIDTH;xOrdinate++){
            if (map[0][xOrdinate].equals("*")){
                System.out.print("*");
            }else {
                System.out.print(1);
            }
        }


    }
}
