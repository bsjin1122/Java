package etc;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Min {
    public static void main(String[] args) {
        int[] a = {1, 2, 5};
        int[] b = {5, 8, 2};
        int answer = 0;
        // PriorityQueue를 역순 비교자로 초기화
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());

        // 모든 요소를 PriorityQueue에 추가
        for (int num : a) {
            priorityQueue.add(num);
        }
        for (int num : b) {
            priorityQueue2.add(num);
        }

        // PriorityQueue에서 요소를 하나씩 꺼내어 배열에 다시 넣기
        for (int i = 0; i < a.length; i++) {
            a[i] = priorityQueue.poll();
            b[i] = priorityQueue2.poll();
        }
        for (int k = 0; k < a.length; k++) {
            answer += a[k] * b[k];
        }
        System.out.println(answer);



    }
}

//        Arrays.sort(a);
//
//        // 기본형 배열을 래퍼 클래스 배열로 변환
//        Integer[] wrappedArray = Arrays.stream(b).boxed().toArray(Integer[]::new);
//
//        // 역순으로 정렬
//        Arrays.sort(wrappedArray, Collections.reverseOrder());
//
//        // 다시 기본형 배열로 변환
//        b = Arrays.stream(wrappedArray).mapToInt(Integer::intValue).toArray();
//        for(int i=0; i< b.length; i++){
//            System.out.println(b[i]);
//        }
//        System.out.println(answer);
