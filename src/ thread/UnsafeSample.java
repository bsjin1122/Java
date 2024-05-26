import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UnsafeSample {
    public static void main(String[] args) {
        // SimpleDateFormat 클래스는 스레드 세이프하지 않다.
        DateFormat unsafeDateFormat = new SimpleDateFormat("yyyy/MM/dd"); // 클래스를 동시에 사용하려고 해서 예측하지 못한 결과를 반환한다.
        // 날짜 1은 1989/03/10 이다.
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1989, Calendar.MARCH, 10);
        Date date1 = cal1.getTime();
        // 날짜2는 2020/06/20이다. .
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020, Calendar.JUNE, 20);
        Date date2 = cal2.getTime();

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                try{
                    String result = unsafeDateFormat.format(date1);
                    System.out.println("Thread1 = " + result);
                }catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            }
        });

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                try{
                    String result = unsafeDateFormat.format(date2);
                    System.out.println("Thread2 = " + result);
                }catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            }
        });

        System.out.println("스레드 세이프하지 않은 프로그램의 검증을 시작합니다.");
        thread1.start();
        thread2.start();

        // 2020/6/20 을 예상했으나, 날짜가 자기 멋대로 변경되어 있음을 확인할 수 있다. (10일로 바뀜)


    }
}
