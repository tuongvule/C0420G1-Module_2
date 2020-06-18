package i_stack_queue.excercise.dem_so_lan_xuat_hien_cua_mot_tu_su_dung_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLanXuatHienCuaMotTuTrongChuoiSuDungMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a text");
        String string = scanner.nextLine();
        string = string.replaceAll("\\p{Punct}", "");//loại bỏ các dấu chấm trong chuỗi
        String[] string1 = string.split("\\ ");
        Map<String, Integer> treeMap = new TreeMap<>();
        for (int i=0; i<string1.length;i++){
            int count=1;
            for(int j=0;j<i;j++){
                string1[i].toLowerCase();
                if(string1[i].equals(string1[j])){
                    count++;
                }
            }
            treeMap.put(string1[i],count);
        }
        System.out.println(treeMap);
    }
}
//    i love you i love you ok ok you. you loe i