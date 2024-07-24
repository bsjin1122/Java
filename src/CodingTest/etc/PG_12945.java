package etc;

public class PG_12945 {
    public static void main(String[] args) {
        int n = 47;
        int answer = 0;
        answer = fibonacci(n);
        System.out.println(answer);
    }
    // 나머지 연산의 특징: (a+b) % m = ((a % m) + (b % m)) % m
    public static int fibonacci(int n){
        int m = 1234567;
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b % m;
            b = temp % m;
        }
        return b % m;
    }

}


//        if (n <= 1) {
//            return n;
//        }
//        return fibonacci(n-1) + fibonacci(n-2);
