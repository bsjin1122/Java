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
        //numbers.addLast(30);
        numbers.addFirst(5);

        // add
        numbers.add(2, 25);
        System.out.println(numbers.toString());

        // removeFirst
        numbers.removeFirst();
        numbers.removeFirst();
        System.out.println(numbers.toString());
    }
}
