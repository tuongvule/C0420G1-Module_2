package k_java_collection_framework_map_tree.practice.cai_dat_cay_tim_kiem_nhi_phan;

import java.util.LinkedList;
import java.util.Queue;

public class BST <E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }
    public BST(E [] objects){
        for(int i=0;i<objects.length;i++){
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if(root ==null ){
            root = createNewNode(e); /*create a new root*/
        }else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current!=null){
                if(e.compareTo(current.element)<0){
                    parent= current;
                    current = current.left;
                }else if (e.compareTo(current.element)>0){
                    parent = current;
                    current = current.right;
                }else{
                    return false; /*Duplicate node not inserted*/
                }
            }
            if(e.compareTo(parent.element)<0){
                parent.left= createNewNode(e);
            }else {
                parent.right = createNewNode(e);
            }
        }
        size ++;
        return true; /*element inserted successfully*/

    }
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    @Override
    public boolean search(E e) {
        TreeNode<E> current = root;
        while (current!=null){
            if(e.compareTo(current.element)<0){
                current=current.left;
            }else if(e.compareTo(current.element)>0){
                current=current.right;
            }else {
                return true;
            }
        }
        return false;
    }

    @Override
    public void breathLevel() {
        breathLevel(root);
    }

    private void breathLevel(TreeNode<E> root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return;
        queue.add(root);
        TreeNode<E> temp;
        while (!queue.isEmpty()){
            temp =queue.peek();
            System.out.println(queue.poll().element + " ");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }

    //    private void breathLevel(TreeNode<E> root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        if (root == null) return;
//        queue.add(root);
//        TreeNode<E> temp;
//        while (!queue.isEmpty()) {
//            temp = queue.peek();
//            System.out.print(queue.poll().element + " ");
//
//            if (temp.left != null) {
//                queue.add(temp.left);
//            }
//            if (temp.right != null) {
//                queue.add(temp.right);
//            }
//        }
//    }
//------------------------------------------------
    //    public void deleteNode(E key){
//        deleteNode( root, key);
//    }
//    private TreeNode<E> deleteNode(TreeNode<E> root, E key){
//        if(root.element==null){
//            return null;
//        }
//        if(key.compareTo(root.element)<0){
//            root.left=deleteNode(root.left,key);/** nếu giá trị node cần xóa nhỏ hơn giá trị nod
//                                                    gốc thì đệ qui tại root chấm left*/
//        }else if (key.compareTo(root.element)>0){
//            root.right = deleteNode(root.right, key);/** nếu giá trị node cần xóa lớn hơn giá trị node gốc
//                                                        thì đệ qui tại root chấm right*/
//        }else{
//            /** nếu giá trị đưa vào là bằng với giá trị node gốc, thì xóa node gốc, có 3 trường hợp sau*/
//            if(root.left==null){return root.right;}/** TH1: nếu giá trị node bên trái node gốc, tức root.left null thì
//                                                   trả về liên kết với node bên phải */
//            if(root.right== null){return root.left;}/** TH2: ngược lại với bước trên*/
//            /** TH3: ngược lại cả 2 giá trị node bên trái và nốt bên phải node root trỏ đến ko null thì: */
//            TreeNode<E> temp = root.right; // khai báo node temp = node root;
//            while (temp!=null){
//                if(temp==null){break;}//nếu node temp == null, thoát khỏi vòng lặp/
//                temp=temp.left;//tro
//            }
//            E min_at_right = temp.element;/**giá trị node nhỏ nhất nhánh bên phải chính là giá trị của temp*/
//            root.element = min_at_right;
//            root.right = deleteNode(root.right,min_at_right);// đệ qui tại root.right xóa min_at_right
//        }
//        return root;/** tìm đã thèm mà ko có thì không làm gì cả, trả về node gốc*/
//    }
    public void deleteNode(E key){
       root = deleteNode( root, key);
    }
    private TreeNode<E> deleteNode(TreeNode<E> root, E key) {
        if (root == null) {
            return null;
        }

        if (key.compareTo(root.element) < 0) {
            root.left = deleteNode(root.left, key);
        } else {
            if (key.compareTo(root.element) > 0) {
                root.right = deleteNode(root.right, key);
            } else {
                //if same
                if (root.left == null) return root.right;
                if (root.right == null) return root.left;
                //otherwise, find min at right subtree
                TreeNode<E> temp = root.right;
                while (temp != null) {
                    if (temp.left == null) break;
                    temp = temp.left;
                }
                E min_at_right = temp.element;
                root.element = min_at_right;
                root.right = deleteNode(root.right, min_at_right);
            }
        }
        return root;
    }


    private void preorder(TreeNode<E> root) {
        if(root==null) return;
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);
    }

    private void postorder(TreeNode<E> root) {
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    private void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
}
