package DataStructure.ArrayList;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        /*11강 add */
        numbers.add(1, 15);
        numbers.addFirst(5);
        /* 12강 toString */
        numbers.add(1, 25);
        numbers.addFirst(3); //[3,5,25,10,15,20,30,40]
        //System.out.println(numbers);
        /* 13강 remove */
        System.out.println(numbers.remove(0));
        //System.out.println(numbers);
        /* 14강 removeFirst, removeLast */
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
        /* 15강 get */
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));

    }
}
