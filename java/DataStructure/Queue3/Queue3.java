import java.util.ArrayDeque;
import java.util.Queue;

public class Queue3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        // 큐에 데이터 추가
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // 큐의 맨 앞 데이터를 제거하면서 반환
        int first = queue.poll();
        System.out.println(first);

        // 큐에 데이터 추가
        queue.add(4);
        queue.add(5);
        // 큐의 맨 앞 데이터를 제거하면서 반환
        first = queue.poll();
        System.out.println(first);

    }


}
