import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Tangerine {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int answer = 0;
        // 빈도수를 저장할 HashMap 생성
        Map<Integer, Integer> countMap = new HashMap<>();

        // 배열의 각 원소에 대해 빈도수 세기
        for (int t : tangerine) {
            countMap.put(t, countMap.getOrDefault(t, 0) + 1);
        }
        // 결과 출력
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 빈도수로 최대 힙 생성 (내림차순 정렬)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(countMap.values());

        int kinds = 0;
        int currentCount = 0;
        for (Integer frequency : maxHeap) {
            System.out.print(frequency + " ");
        }

        // 빈도수가 높은 것부터 선택하여 k개를 채우기
        // 빈도수가 높은 귤부터 차례로 선택
        while (currentCount < k && !maxHeap.isEmpty()) {
            currentCount += maxHeap.poll();
            kinds++;
        }

        //return kinds;
        System.out.println(kinds);
    }
}
