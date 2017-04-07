/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author viraj
 */
public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public Tree(Node root) {
        this.root = root;
    }

    public void insert(int i) {
        // Inserts int ‘i ’ to the BST
        // Create a new Node and initialize it
        Node newNode = new Node(i);
        // If there is no root this becomes root
        if (root == null) {
            root = newNode;
        } else {
            // Set root as the Node we will start
            // with as we traverse the tree
            Node locateRoot = root;

            // Future parent for our new Node
            Node parent;
            while (true) {
                // root is the top parent so we start
                // there
                parent = locateRoot;

                // Check if the new node should go on
                // the left side of the parent node
                if (i < locateRoot.data) {
                    // Switch focus to the left child
                    locateRoot = locateRoot.left;

                    // If the left child has no children
                    if (locateRoot == null) {
                        // then place the new node on the left of it
                        parent.left = newNode;
                        return; // All Done
                    }
                } else { // If we get here put the node on the right
                    locateRoot = locateRoot.right;
                    
                    // If the right child has no children
                    if(locateRoot == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public void printPreOrder(Node locateRoot) {
        // Prints elements and their children ’s contents of a sub - tree with the root node 
        // 'localRoot' using the pre - order traversal method
        
    }
    
    public void mirrorSubTree(Node locateRoot){
        // Converts a sub - tree with the root node ‘ localRoot ’ to its mirror image
        
    }
}
