import java.util.ArrayDeque;

public class DEQ {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        // 큐에 데이터 추가
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        // 큐의 맨 앞 데이터를 제거하면서 반환
        int first = queue.pollFirst();
        System.out.println(first);
        // 큐에 데이터 추가
        queue.addLast(4);
        queue.addLast(5);
        // 큐의 맨 앞 데이터를 제거하면서 반환
        first = queue.pollFirst();
        System.out.println(first);
    }
}
