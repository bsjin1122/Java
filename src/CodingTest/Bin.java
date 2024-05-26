
public class Bin{
    public static void main(String[] args) {
        String s = "110010101001";
        int[] result = solution(s);
        System.out.println("Count: " + result[0]);
        System.out.println("ZeroCount: " + result[1]);
    }

    public static int[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        int[] result = {0, 0};
        convertToBinary(sb, result);
        return result;
    }

    public static void convertToBinary(StringBuilder sb, int[] result) {
        if (sb.toString().equals("1")) {
            return;
        }

        // 0을 제외한 문자열로 변환
        String newString = deleteZero(sb.toString());
        // 삭제된 0의 개수를 카운트
        result[1] += sb.length() - newString.length();
        // 새로운 문자열의 길이를 이진수로 변환하여 다시 재귀 호출
        String binStr = createBinary(newString.length());
        sb.setLength(0);
        sb.append(binStr);
        // 재귀 호출 횟수 카운트
        result[0]++;
        convertToBinary(sb, result);
    }

    public static String deleteZero(String string) {
        return string.replace("0", "");
    }

    public static String createBinary(int len) {
        return Integer.toBinaryString(len);
    }
}