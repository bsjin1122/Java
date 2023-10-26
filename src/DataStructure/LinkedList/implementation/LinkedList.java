package DataStructure.LinkedList.implementation;

// 객체 구현
public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(int input) {
        // 첫번째 30이 올 때
        // data = 30, next는 null
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null){
            tail = head; //마지막 노드는 head와 같다.
        }
    }

    // 하나의 element가 하나의 객체
    // element == node == vertex
    // Inner Class로 정의함.
    private class Node{
        private Object data; //데이터 저장
        private Node next; // 다음 노드가 누구인지에 대한 정보 저장
        public Node(Object input){
            this.data = input;
            this.next = null;
        }
        public String toString(){
            return String.valueOf(this.data);
        }
    }

    // addLast
    public void addLast(Object input){
        Node newNode = new Node(input);
        if(size == 0){
            addFirst(input); //데이터가 0일 때 addFirst로 넘김
        }else{
            tail.next = newNode; //tail의 뒤쪽에 새로운 node가 붙을 것이므로
            tail = newNode;
            size++;
        }
    }
    // Node
    public Node node(int index){ //test를 위해 public
        // 첫번째 노드를 찾고(head)
        Node x = head; // head값만으로도 첫번째 값을 찾을 수 있다.
        return x;

    }

}
