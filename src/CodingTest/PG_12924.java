public class PG_12924 {
    public static void main(String[] args) {
        int n = 15;
        int add = 0;
        int answer = 0;
        int start = 1;
        while(start <= n){
            for (int i = 1; i < n; i++) {
                add += i;
                System.out.println(i);
                if(add == n){
                    System.out.println("더한 값: " + add);
                    start += 1;
                    add = 0;

                }
            }

        }

        //System.out.println(answer);


    }
}
