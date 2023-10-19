package DataStructure.LinkedList.implementation;

// 객체 구현
public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(int input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null){
            tail = head;
        }
    }

    // 하나의 element가 하나의 객체
    // element == node == vertex
    private class Node{
        private Object data;
        private Node next;
        public Node(Object input){
            this.data = input;
            this.next = null;
        }
        public String toString(){
            return String.valueOf(this.data);
        }
    }
}
