package k_java_collection_framework_map_tree.practice.cai_dat_cay_tim_kiem_nhi_phan;

public class TreeNode<E> {//Node kiểu dữ liệu E
    protected E element;// element là dữ liệu
    protected TreeNode<E> left;// left là liên kết bên trái, và nó liên kết sang node con bên trái
    protected TreeNode<E> right;// right là liên kết bên phải, và nó liên kết sang node con bên phải

    public TreeNode(E e) {
        this.element = e;
    }
}
