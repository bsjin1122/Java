package DataStructure.DoublyLinkedList.implementation;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList numbers = new DoublyLinkedList();
        // addFirst
        //numbers.addFirst(30);
        //numbers.addFirst(20);
        //numbers.addFirst(10);

        //addLast
        numbers.addLast(10);
        numbers.addLast(20); //10, 20, 25, 30
        numbers.addLast(30);
        //numbers.addFirst(5);

        // add
        //numbers.add(2, 25);

        // removeFirst
        //numbers.removeFirst();
        //numbers.removeFirst();

        //System.out.println(numbers.remove(0));
        //System.out.println(numbers.toString());
        //System.out.println(numbers.removeLast());

        // size
        //System.out.println(numbers.size());
        //System.out.println(numbers.get(1));
        //System.out.println(numbers.toString());

        //indexOf 어떤 특정한 데이터가 어떤 위치에 있는지 검색하기
        //System.out.println(numbers.indexOf(30));


        /* 36강 Iterator next
        LinkedList.ListIterator i = numbers.listIterator();
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.hasNext()); // True
        System.out.println(i.next());
        System.out.println(i.hasNext()); // False

        while(i.hasNext()){
            System.out.println(i.next());
        }*/

        /* 38강 Iterator add
        i.add(5); //첫번째 노드로 추가될 것
        i.next();
        i.add(15);
        System.out.println(numbers);*/

        DoublyLinkedList.ListIterator i = numbers.listIterator();
        /*System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.hasNext());*/

        // 49 마지막강 Iterator remove
        while(i.hasNext()){
            if((int) i.next() == 20){
                i.remove();
            }
        }
        System.out.println(numbers);

    }
}
