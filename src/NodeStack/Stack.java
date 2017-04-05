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
public class Stack {
    private Node top;
    int size; // 

    public Stack() {
        top = null;
        size = 0; // 
    }

    public Stack(Node top) {
        this.top = top;
    }
    
    public boolean isEmpty(){
        return size == 0;
        // return top == null;
    }
    
    public void push(int i){
        Node n = new Node(i);
        if(top == null){
            top = n;
        }else{
            n.next = top;
            top = n;
            size++;
        }
    }
    
    public Node pop(){
        if(isEmpty()){
            return null;
        }else{
            Node cn = top;
            top.next = top;
            size--;
            return cn;
        }
    }
    
    public Node peek(){
        if(isEmpty()){
            return null;
        }
        return top;
    }
}
