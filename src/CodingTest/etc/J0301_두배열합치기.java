package etc;

import java.util.*;

public class J0301_두배열합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input1; i++) {
            list.add(sc.nextInt());
        }
        int input2 = sc.nextInt();
        for (int i = 0; i < input2; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
