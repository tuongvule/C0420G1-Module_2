package java_collection_framework.install_bst;

public interface Tree<E> {
    /**
     * Insert element e into the binary search tree.
     * Return true if the element is inserted successfully.
     */
    public boolean insert(E e);

    /**
     * Inorder traversal from the root
     */
    public void inorder();

    /**
     * Get the number of nodes in the tree
     */
    public int getSize();

    /**
     * Inorder traversal from the root
     */
    public void postorder();

    /**
     * Inorder traversal from the root
     */
    public void preorder();

    /**
     * Inorder traversal from the root
     */
    public void breathFirst();
}
