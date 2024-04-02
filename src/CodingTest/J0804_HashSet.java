import java.util.HashSet;

public class J0804_HashSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8};
        int target = 6;
        boolean answer = solution(arr, target);
        System.out.println(answer);
    }
    public static boolean solution(int[] arr, int target){
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
          if(hashSet.contains(target-i)){
              return true;
          }
            hashSet.add(i);
        }
        return false;
    }
}
