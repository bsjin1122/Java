package DataStructure.LinkedList.implementation;

// 객체 구현
public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null){
            tail = head;
        }
    }

    // removeLast
    public Object removeLast() {
        return remove(size-1);
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

    // 28강 addLast
    public void addLast(Object input){
        Node newNode = new Node(input);
        if(size == 0){
            addFirst(input);
        }else{
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    // 29강 Node
    // public 노출시켜서는 안되는 메서드
    Node node(int index){
        Node x = head;
        for(int i = 0; i < index; i++){
            x = x.next;
        }
        //x = x.next;
        //x = x.next;
        return x;
    }

    public void add(int k, Object input){
        if(k == 0){
            addFirst(input);
        }else{
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if(newNode.next == null){
                tail = newNode;
            }
        }
    }

    // toString()
    public String toString(){
        if(head == null){
            return "[]";
        }
        String str = "[";
        Node temp = head;
        while(temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;

        }
        str += temp.data;

        /*for(int i=0; i < size; i++){
            str += (Object) node(i);
            if(i < size-1){
                str += ",";
            }
        }*/
        return str + "]";
    }

    // removeFirst
    // remove했을 때 삭제된 노드가 갖고 있던 값을 return
    /* 내가 시도해본 방식
    public boolean removeFirst(){
        if(size == 0){
            return true; //삭제할 것이 없음
        }else{
            head = head.next;
            size--;
            return true;
        }
    }*/

    public Object removeFirst(){
        Node temp = head;
        head = head.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    // 33강 remove removeLast
    public Object remove(int k){
        if(k==0){
            return removeFirst();
        }
        Node temp1 = node(k-1);
        Node todoDeleted = temp1.next;
        temp1.next = temp1.next.next;
        Object returnData = todoDeleted.data;
        if(todoDeleted == tail){
            tail = temp1;
        }
        todoDeleted = null;
        size--;
        return returnData;
    }

    //size
    public int size(){
        return size;
    }

    public Object get(int k){
        Node temp = node(k);
        return temp;
    }

    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        while(temp.data != data){
            temp = temp.next;
            index++;
            if(temp == null){ // 가장 끝에 있는 노드에 도달
                return -1; // 검색을 종료시킴
            }
        }
        return index;

    }
    public ListIterator listIterator(){
        return new ListIterator();
    }

    public class ListIterator {
        private Node next;
        private Node lastReturned;
        private int nextIndex;

        ListIterator(){
            next = head;
            nextIndex = 0;
        }

        // 호출되면 첫번째 노드의 값이 return 그다음 호출 시 return된 값을 가리킴
        public Object next() {
            lastReturned = next;
            next = next.next; //현재 next 노드의 다음 노드로
            nextIndex++;
            return lastReturned.data; // 저장된 값을 리턴
        }

        public boolean hasNext(){
           return nextIndex < size();
        }

        // 38강 add
        public void add(Object input){
            Node newNode = new Node(input);
            if(lastReturned == null){
                // 처음에 추가하는 경우
                head = newNode;
                newNode.next = next;
            }else{
                lastReturned.next = newNode;
                newNode.next = next;
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }

        public void remove(){
            if(nextIndex == 0){
                throw new IllegalStateException();
            }
            LinkedList.this.remove(nextIndex-1);
            nextIndex--;
        }
    }
}
