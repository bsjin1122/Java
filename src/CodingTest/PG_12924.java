public class PG_12924 {
    public static void main(String[] args) {
        int n = 15;
        int answer = 0;
        int j = 1;
        int add = 0;
        for (int i = 1; i < 10000; i++) {
            //System.out.println("i의 값: " + i);
            if(add < n){
                add += i;
                //System.out.println("더한 값 : " + add);
            }else if(add > n){
                i = j++;
                add = 0;
            }else{
                answer++;
                i = j++;
                add = 0;
            }
        }
        System.out.println(answer);

    }
}
