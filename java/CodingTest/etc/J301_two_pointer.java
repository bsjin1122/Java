package etc;

import java.util.ArrayList;
import java.util.Scanner;

public class J301_two_pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] aArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] bArr = new int[m];
        for (int i = 0; i < m; i++) {
            bArr[i] = sc.nextInt();
        }
        for (int i : solution(n,m,aArr,bArr)) {
            System.out.print(i + " ");
        }


    }
    public static ArrayList<Integer> solution(int n, int m, int[] aArr, int[] bArr){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1 < n && p2 < m){
            if(aArr[p1] < bArr[p2]){
               answer.add(aArr[p1++]); //answer.add(aArr[p1++]); 도 가능
            }else{
                answer.add(bArr[p2++]);
            }
        }
        while(p1 < n){
            answer.add(aArr[p1++]);
        }
        while(p2 < m){
            answer.add(bArr[p2++]);
        }
        return answer;
    }
}
