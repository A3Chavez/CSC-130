import java.util.*;

/**
 * Program that represents a Binary Search Tree.
 *
 * @author Anthony Chavez
 * @version 1 March 2020
 */
public class BST<E extends Comparable<E>> {
    private Node<E> root;
    private Stack<E> s = new Stack();
    
    /**
     * Creates a new empty Binary Search Tree
     */
    public BST() {
        root = null;
    }
    
    /**
     * Checks if Binary Search Tree is empty
     *
     * @return boolean if Tree is empty
     */
    public boolean isEmpty() {
        return root == null;
    }
    
    /**
     * Get value of root
     *
     * @return int value of root
     */
    public Node<E> getRoot() {
        return root;
    }
    
    /**
     * Insert a new Node int
     *
     * @param root node of tree
     * @param x value of node to be inserted
     * @return Node to be inserted
     */
    public Node<E> insert(Node<E> root, E x)  {
        if(root == null)
            return new Node(x, null, null);
        
        int compareResult = x.compareTo(root.getValue());
        
        if(compareResult < 0)
            root.setLeftNode(insert(root.getLeftNode(), x));
        else if(compareResult > 0)
            root.setRightNode(insert(root.getRightNode(), x));
        else
            root.setLeftNode(insert(root.getLeftNode(), x));
        return root;
    }
    
    /**
     * Check if a tree has a given value
     *
     * @param x value to find
     * @param root node of tree
     * @return boolean true if value found, else false
     */
    public boolean contains(E x, Node<E> root) {
        if(root == null)
            return false;
        
        int compareResult = x.compareTo(root.getValue());
        
        if(compareResult < 0)
            return contains(x, root.getLeftNode());
        else if(compareResult > 0)
            return contains(x, root.getRightNode());
        else
            return true;    // Match
    }
    
    /**
     * Get values of left subtree
     *
     * @param root node of the tree
     * @return Stack containing values in reverse order
     */
    public Stack<E> getLeftSubTree(Node<E> root) {
        if(root == null)
            return null;
        else {
            while(root != null) {
                s.push(root.getValue());
                root = root.getLeftNode();
            }
            return s;
        }
    }
    
    /**
     * Get values of right subtree
     *
     * @param root node of the tree
     * @return Stack containing values in reverse order
     */
    public Stack<E> getRightSubTree(Node<E> root) {
        if(root == null)
            return null;
        else {
            while(root != null) {
                s.push(root.getValue());
                root = root.getRightNode();
            }
            return s;
        }
    }
}