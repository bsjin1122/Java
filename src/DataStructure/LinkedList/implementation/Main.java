package DataStructure.LinkedList.implementation;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
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
        System.out.println(numbers.toString());

        //indexOf 어떤 특정한 데이터가 어떤 위치에 있는지 검색하기
        //System.out.println(numbers.indexOf(30));

    }
}
