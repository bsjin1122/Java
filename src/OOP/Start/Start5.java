package OOP.Start;

public class Start5 {
    static int share; // 스태틱 영역에 변수 공간 할당
    // share 변수가 클래스의 멤버로 공간을 만들어 저장
    public static void main(String[] args) {
        share = 55;
        int k = fun(5, 7);
        System.out.println(share);

    }
    private static int fun(int m, int p){
        share = m + p;
        return m - p;
    }
}
