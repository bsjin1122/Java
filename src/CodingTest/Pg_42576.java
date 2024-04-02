import java.util.HashMap;

public class Pg_42576 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }
    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        String answer = "";
        // 완주한 선수들의 이름을 hashMap에 저장
        for (String s : completion) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }
        // 참가한 선수들의 이름을 키로 하는 값 1씩 감소
        for (String s : participant) {
            if (hashMap.getOrDefault(s, 0) == 0) {
                return s; // 완주하지 못한 선수면 반환
            }
            hashMap.put(s, hashMap.get(s) - 1);
        }
        return null;
    }
}
