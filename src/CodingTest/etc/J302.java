package etc;
// 공통 원소 구하기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 */
public class J302 {
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

    public static ArrayList<Integer> solution(int n, int m, int[] aArr, int[] bArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        int p1 = 0;
        int p2 = 0;
        while(p1 < n && p2 < m){
            if(aArr[p1] < bArr[p2]){
                p1++;
            }else if(aArr[p1] == bArr[p2]){
                answer.add(aArr[p1++]);
                p2++;
            }else{
                p2++;
            }
        }
        return answer;

    }
}
