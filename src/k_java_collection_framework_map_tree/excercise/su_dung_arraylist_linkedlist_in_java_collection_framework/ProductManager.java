//package k_java_collection_framework_map_tree.excercise.su_dung_arraylist_linkedlist_in_java_collection_framework;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class ProductManager<E> {
//    public ArrayList<E>map;
//
//    public ProductManager() {
//        this.map = new ArrayList<>();
//    }
//    public void add(E element){
//        map.add(element);
//    }
//    public void show(){
//        System.out.println(map);
//    }
//    public int size(){
//        return map.size();
//    }
//    public E get(int i){
//        return map.get(i);
//    }
//    public void set(int index, E element){
//        map.set(index, element);
//    }
//    public void remove(int index){
//        map.remove(index);
//    }
//
//    public static void main(String[] args) {
//        Product product1 = new Product(1, "Coca", 2200);
//        Product product2 = new Product(2, "Aloxinh", 2200);
//        Product product3 = new Product(3, "Cigaret", 20000);
//        ProductManager<Product> listProduct = new ProductManager<>();
//        listProduct.add(product1);
//        listProduct.add(product2);
//        listProduct.add(product3);
//
//
//        Scanner scanner = new Scanner(System.in);
//        listProduct.add(product3);
//
//        // Thông tin update
//
////        System.out.println("Nhập Id bạn muốn sửa:");
////        int id  = Integer.parseInt(scanner.nextLine());
////        System.out.println("Nhập lại tên sp");
////        String name = scanner.nextLine();
////        System.out.println("Nhập lại giá sp");
////        int cost = Integer.parseInt(scanner.nextLine());
////
//        //Update Product
//
////        for(int i=0;i<listProduct.size();i++){
////            if(id==listProduct.get(i).getId()){
////                listProduct.set(i,new Product(id,name,cost));
////            }
////        }
//
//
//        //Remove Product
//
////        for(int i=0;i<listProduct.size();i++){
////            if(id==listProduct.get(i).getId()){
////                listProduct.remove(i);
////            }
////        }
//
//        //Tìm kiếm sản phẩm
//
////        System.out.println("Nhập tên sản phẩm");
////        String name = scanner.nextLine();
////        for(int i=0;i<listProduct.size();i++){
////             if(name.equals(listProduct.get(i).getName())){
////                 System.out.println("Id: " +listProduct.get(i).getId() +"name: "+
////                         listProduct.get(i).getName()+"cost: "+listProduct.get(i).getCost());
////             }
////        }
//
//        //Sắp xếp sẳn phẩm
//        Collections.sort(listProduct.map);
//
//        //show săn phẩm
//        listProduct.show();
//
//    }
//}
