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
public class Node {
    int data;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int i) {
        data = i;
        left = right = null;
    }   

    public void display() {
        // Displays the node ’s content and its children ’s contents
        System.out.println("Node{" + "data=" + data + ", left=" + left + ", right=" + right + '}');
    }
    
    public void swapChildren(){
        // Swaps the left and right childen of the node
    }
    
}
