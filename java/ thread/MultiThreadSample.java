/**
 * 멀티 스레드 샘플
 */
public class MultiThreadSample implements Runnable { // Runnable 인터페이스를 구현
    /* 출력 메시지 템플릿 */
    private static final String MSG_TEMPLATE = "출력 중입니다. [%s][%d회째]";
    /* 스레드 명*/
    private final String threadName;

    public MultiThreadSample(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(String.format(MSG_TEMPLATE, threadName, i));
        }
    }

    public static void main(String[] args) {
        MultiThreadSample runnable1 = new MultiThreadSample("thread1");
        MultiThreadSample runnable2 = new MultiThreadSample("thread2");
        MultiThreadSample runnable3 = new MultiThreadSample("thread3");

        Thread thread1 = new Thread(runnable1); // 스레드 인스턴스 생성-> 스레드 생성
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        thread1.start(); // 스레드 시작
        thread2.start();
        thread3.start();
        // 처리가 동시에 실행되므로, 출력 순서가 매번 달라진다.
        // 단순히 run 실행해서는 실행되지 않는다.
    }
}
