package DataStructure.ArrayList;

public class Main {
    public static void main(String[] args) {
        //LinkedList numbers = new LinkedList();
        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        System.out.println(numbers.indexOf(20));
        //System.out.println(numbers);

        ArrayList.ListIterator li = numbers.listIterator();
        while(li.hasNext()){
            int number = (int) li.next();
            if(number == 30){
                //li.add(35);
                li.remove(35);
            }
        }
        System.out.println(numbers);

        //numbers.add(1, 15);
        //numbers.addFirst(5);
        /*
        numbers.remove(1);
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        /* 17강 Iterator next hasNext
        ArrayList.ListIterator li = numbers.listIterator(); // ArrayList 클래스 안에 포함된 ListIterator인 클래스

        while(li.hasNext()){
            System.out.println(li.next());
        }
        */

        /* 18강 previous hasPrevious */
        /*
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.previous());
        System.out.println(li.previous());
        System.out.println(li.previous());
        System.out.println(li.previous());
        //System.out.println(li.previous());  // ArrayIndexOutOfBoundsException
        System.out.println(li.hasPrevious());

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        */

    }
}
