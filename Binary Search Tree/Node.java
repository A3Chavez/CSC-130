import java.util.*;
import java.io.*;

/**
 * Program that handles Node procedures.
 * 
 * @author Anthony Chavez
 * @version 1 March 2020
 */

public class Node<E> {
    private E value;
    private Node leftNode;
    private Node rightNode;
    
    /**
     * Node constructor with initial Node value
     *
     * @param value for this Node
     * @param leftNode of Node
     * @param rightNode of Node
     */
    public Node(E value, Node<E> leftNode, Node<E> rightNode) {
        this.value = value;
        leftNode = null;
        rightNode = null;
    }
    
    /**
     * Set left node pointer for this Node
     *
     * @param node Left node for this Node
     */
    public void setLeftNode(Node<E> node) {
        this.leftNode = node;
    }
    
    /**
     * Set right node pointer for this Node
     *
     * @param node Right node for this Node
     */
    public void setRightNode(Node<E> node) {
        this.rightNode = node;
    }
    
    /**
     * Set value for this Node
     *
     * @param value for this Node
     */
    public void setValue(E value) {
        this.value = value;
    }
    
    /**
     * @return Left node for this Node
     */
    public Node getLeftNode() {
        return leftNode;
    }
    
    /**
     * @return Right node for this Node
     */
    public Node getRightNode() {
        return rightNode;
    }
  
    /**
     * @return Current value for this Node
     */
    public E getValue() {
        return value;
    }
}