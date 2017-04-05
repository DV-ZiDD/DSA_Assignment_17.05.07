/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodeStack;

/**
 *
 * @author viraj
 */
public class Node {
    int data;
    Node next;

    public Node() {
        data = 0;
        next = null;
    }
    
    public Node(int i) {
        this.data = i;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }
    
    public void display(){
        System.out.println("Data : " + data + "\nNext : " + next + "" );
    }
    
}
