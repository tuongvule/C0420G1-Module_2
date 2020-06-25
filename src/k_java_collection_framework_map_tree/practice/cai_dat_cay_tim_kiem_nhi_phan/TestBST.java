package k_java_collection_framework_map_tree.practice.cai_dat_cay_tim_kiem_nhi_phan;

import java.util.Scanner;

public class TestBST {
    public static void main(String[] args) {
        //craeate a BST
        Scanner scanner = new Scanner(System.in);
        BST <Integer> tree = new BST<>();
        tree.insert(60);
//        tree.insert(55);
//        tree.insert(45);
//        tree.insert(57);
//        tree.insert(59);
        tree.insert(100);
        tree.insert(67);
        tree.insert(107);
        tree.insert(101);
        //number tree
        //Test breath_level
        System.out.println( "\n"+"Breath level (sorted): ");
        tree.breathLevel();
        //Test inorder
//        System.out.println( "\n"+"Inorder (sorted): ");
//        tree.inorder();
//        System.out.println("\n"+"Postorder (sorted): ");
//        tree.postorder();
//        System.out.println("\n"+"Preorder (sorted): ");
//        tree.preorder();
//        System.out.println("\n"+"The number of nodes is: "+ tree.getSize());
//        System.out.println("Input element that you want to search below: ");
//        int elementX = scanner.nextInt();
//        if( tree.search(elementX)){
//            System.out.println("Tree exists the element "+ elementX+ " you are looking for");
//        }else {
//            System.out.println("Tree doesn't exist the element "+ elementX+ " you are looking for");
//        }
//        delete any node
        System.out.println("\n"+"Input a node that you want to delete");
        int nodeNeedToDelete = scanner.nextInt();
        tree.deleteNode(nodeNeedToDelete);
        System.out.println( "\n"+"Inorder (sorted): after delete node: "+nodeNeedToDelete );
        tree.breathLevel();

    }
}
