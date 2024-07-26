import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 스레드 풀 샘플
 */
public class ThreadPoolSample implements Runnable{
    private static final String MSG_TEMPLATE = "출력 중입니다. [%s][%d회째]"; // 출력 메시지 템플릿
    private final String threadName; // 스레드명

    public ThreadPoolSample(String threadName) {
        this.threadName = threadName;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(String.format(MSG_TEMPLATE, threadName, i));
        }
    }


    public static void main(String[] args) {
        ThreadPoolSample runnable1 = new ThreadPoolSample("thread1");
        ThreadPoolSample runnable2 = new ThreadPoolSample("thread2");
        ThreadPoolSample runnable3 = new ThreadPoolSample("thread3");

        // 스레드 동시 실행 수는 3
        ExecutorService executorService = Executors.newFixedThreadPool(3); // 3개의 스레드 동시에 실행 (동시 실행 스레드 최대 수) 지정
        // 메서드 인수를 1로 두었을 경우 동시 실행 수가 1이 되어 최초의 스레드부터 차례로 실행된다.
        // 이 경우는  getSingleThreadExecutor 메서드로 ExecutorService 인스턴스를 가져오는 것과 같다. 

        executorService.execute(runnable1); // 시작
        executorService.execute(runnable2);
        executorService.execute(runnable3);

        executorService.shutdown(); // 메서드 처리 종료 (실행중인 스레드가 끝나야 비로소 종료 상태)

        try{
            if(!executorService.awaitTermination(5, TimeUnit.MINUTES)){ // 스레드가 종료될 때까지 대기 상태로 둠, 5분이 경과하면 타임아웃(시간 종료)
                // 타임아웃 이후에도 아직 실행이 끝나지 않았다
                executorService.shutdownNow(); // 스레드 전체를 강제종료 
                // 단, 일반적인 애플리케이션에서는 (단순히 강제 종료하는 것이 아니라) 어떻게 대처할지 검토한 다음에 이상 시 처리를 기술할 필요가 있다.
            }
        } catch (InterruptedException e) {
            // 종료 대기 시에 뭔가 오류가 발생했다.
            e.printStackTrace(); // 오류 정보 출력
            executorService.shutdownNow(); // 스레드 강제 종료
        }
    }

}
