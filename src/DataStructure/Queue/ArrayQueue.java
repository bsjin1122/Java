import java.util.Arrays;

// ArrayQueue<String> s = new ArrayQueue<>(); 로 사용함
public class ArrayQueue<E> implements QueueInterface<E> {
    // private로 선언되어 메서드로만 접근
    private E queue[];
    private int front, tail, numItems;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null; // 임의의 에러 값

    public ArrayQueue() { // 생성자1 : 배열 크기가 주어지지 않은 경우
        queue = (E[]) new Object[DEFAULT_CAPACITY]; // 기본으로 주어진 상수 크기 할당
        front = 0;
        tail = DEFAULT_CAPACITY -1;
        numItems = 0;
    }

    public ArrayQueue(int n) { // 생성자2: 큐 크기를 받아 정수 배열 할당한다
        queue = (E[]) new Object[n];
        front = 0;
        tail = n-1;
        numItems = 0;
    }

    // 7-1 구현 : 큐에 원소 삽입하기
    @Override
    public void enqueue(E x) {
        if(isFull()) System.out.println();
    }

    // 큐가 꽉 찼는지 확인
    public boolean isFull(){
        return (numItems == queue.length);
    }

    // 큐에서 원소 제거하기
    @Override
    public E dequeue() {
        if(isEmpty()) return ERROR;
        else{
            E queueFront = queue[front];
            front = (front+1) % queue.length;
            --numItems;
            return queueFront;
        }
    }

    // 큐의 맨 앞 원소 알려주기
    @Override
    public E front() {
        if(isEmpty()) return ERROR;
        else return queue[front];
    }

    // 큐가 비었는지 확인하기
    @Override
    public boolean isEmpty() {
        return (numItems == 0);
    }

    // 큐 비우기
    @Override
    public void dequeueAll() {
        queue = (E[]) new Object[queue.length];
        front = 0;
        tail = queue.length - 1;
        numItems = 0;
    }
}
