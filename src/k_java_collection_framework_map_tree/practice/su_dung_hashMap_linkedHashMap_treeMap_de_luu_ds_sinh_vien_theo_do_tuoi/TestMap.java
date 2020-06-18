package k_java_collection_framework_map_tree.practice.su_dung_hashMap_linkedHashMap_treeMap_de_luu_ds_sinh_vien_theo_do_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        /**Bước 2: Tạo HashMap trong main để lưu danh sách sinh viên*/

        Map<String, Integer> listStudent = new HashMap<String, Integer>();
        listStudent.put("Ngan",19);
        listStudent.put("Tien",24);
        listStudent.put("Phuoc",26);
        listStudent.put("Tuong",19);
        System.out.println("Display entries in HashMap(hiển thị các danh mục trong hashMap_listStudent)");
        System.out.println(listStudent + "\n");
        //-----------------------------
        /**Bước 3: Tạo TreeMap trong main để lưu key theo thứ tự tăng dần*/

        Map<String ,Integer> listStudent_2 = new TreeMap<>(listStudent);//listStudent_2 được khai báo dưới dạng tree map
        listStudent_2.put("Châu", 15);
        System.out.println("Display entries in ascending order of key(Hiển thị các mục theo thứ tự tăng dần của khóa)");
        System.out.println(listStudent_2 + "\n");

        /**Bước 4: Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu*/

        Map<String, Integer> listStudent_3 = new LinkedHashMap<>(listStudent);
        listStudent_3.put("Hiền",60);
        System.out.println("linked hash map là: ");
        System.out.println(listStudent_3);
    }
}
