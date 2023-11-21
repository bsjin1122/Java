package OOP.Interface;

interface Speakable {
    // 속성에 public static final 을 붙이지 않아도 자동으로 자바가 알아서 붙여준다.
    public static final double PI = 3.14159; //double PI = 3.14159;
    public static final double absoluteZeroPoint = -275.15; //final double absoluteZeroPoint = -275.15;

    // 메서드에 public 과 abstract
    void sayYes();
}

class Speaker implements Speakable{

    @Override
    public void sayYes() {
        System.out.println("I say No!!");
    }
}

public class Driver{
    public static void main(String[] args) {
        System.out.println(Speakable.absoluteZeroPoint);
        System.out.println(Speakable.PI);

        Speaker reporter1 = new Speaker();
        reporter1.sayYes();
    }

    public static void test(){
        // final 변수에 대입할 수 없음-> Speakable.PI = 3.14;
    }
}