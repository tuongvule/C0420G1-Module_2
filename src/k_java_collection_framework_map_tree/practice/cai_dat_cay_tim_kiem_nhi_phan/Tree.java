package k_java_collection_framework_map_tree.practice.cai_dat_cay_tim_kiem_nhi_phan;

public interface Tree <E> {
    /**
     * Insert element e into the binary search tree.
     * Return true if the element is inserted successfully.
     */
    public boolean insert(E e);
    /**
     * Inorder nodes of number from the root
     */
    public void inorder();
    /**
     * Get the number of nodes in the tree
     */
    public int getSize();
    /**
     * Postorder nodes of number from the root
     */
    public void postorder();
    /**
     * Preorder nodes of number from the root
     */
    public void preorder();
    /**
     * Search a Nodes of number from the root
     */
    public boolean search(E e);
    /**Sort by breath first*/
    public void breathLevel();


}
