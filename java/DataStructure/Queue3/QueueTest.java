import java.util.ArrayDeque;
import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) { // 1부터 N까지의 번호를 deque에 추가
            queue.addLast(i);
        }

        while(queue.size() > 1){ // deque에 하나의 요소가 남을 때까지 반복
            for (int i = 0; i < K-1; i++) {
                // K번째 요소 앞에서부터 제거하고, 뒤에 추가
                queue.addLast(queue.pollFirst());
            }
            queue.pollFirst(); // K번째 요소 제거
        }
        System.out.println(queue.pollFirst()); // 마지막으로 남은 요소 반환
    }
}
