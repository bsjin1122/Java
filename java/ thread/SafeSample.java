import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SafeSample {
    public static void main(String[] args) {
        // 날짜 1은 1989/03/10 이다.
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1989, Calendar.MARCH, 10);
        Date date1 = cal1.getTime();

        // 날짜2는 2020/06/20이다. .
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020, Calendar.JUNE, 20);
        Date date2 = cal2.getTime();

        Thread thread1 = new Thread(()->{
            // 스레드별로 포맷을 준비한다.
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");

            for (int i = 0; i < 100; i++) {
                try{
                    String result = dateFormat1.format(date1);
                    System.out.println("Thread1 = " + result);
                }catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            }
        });

        Thread thread2 = new Thread(()->{
            // 스레드별로 포맷을 준비한다.
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
            for (int i = 0; i < 100; i++) {
                try{
                    String result = dateFormat2.format(date2);
                    System.out.println("Thread2 = " + result);
                }catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            }
        });

        System.out.println("스레드 세이프한ㅇ 프로그램의 검증을 시작합니다.");
        thread1.start();
        thread2.start();

        // 2020/6/20 을 예상했으나, 날짜가 자기 멋대로 변경되어 있음을 확인할 수 있다. (10일로 바뀜)


    }
}
