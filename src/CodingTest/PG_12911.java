public class PG_12911 {
    public static void main(String[] args) {
        int n =  15;
        int answer = 0;
        String nResult = Integer.toBinaryString(n).replace("0", "");
        for (int i = n+1; i < 1000000; i++) {
            String iResult = Integer.toBinaryString(i).replace("0", "");
            if(iResult.equals(nResult)){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
