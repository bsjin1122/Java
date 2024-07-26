package DataStructure.LinkedList.compare;

import DataStructure.ArrayList.ArrayList;
import DataStructure.LinkedList.implementation.LinkedList;

// 40강 arrayList vs LinkedList
public class Main {
    public static void main(String[] args) {
        // 자바에서는 정해진 사이즈를 꽉 채우면, 두 배의 크기의 배열을 만들게 된다.
        // 기존의 배열은 copy한 후 지워버림
        // Dynamic Array
        ArrayList a = new ArrayList();
        a.addLast(10);
        a.addLast(20);
        a.addLast(30);
        //a.addFirst(5);
        //a.get(2);
        ArrayList.ListIterator ai = a.listIterator();
        while(ai.hasNext()){
            if((int)ai.next()== 20){
                ai.add(25);
            }
        }

        // 자바의 Collection 프레임워크와 다름.
        // Doubly LinkedList가 collection 프레임워크의 내용.
        LinkedList l = new LinkedList();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        //l.addFirst(5);
        //l.get(2);
        LinkedList.ListIterator li = l.listIterator();
        while(li.hasNext()){
            if((int)li.next()==20){
                li.add(25);
            }
        }
    }
}
