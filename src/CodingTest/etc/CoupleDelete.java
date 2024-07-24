package etc;

public class CoupleDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int result = 0;
        sb.append("baabaa");
        int i = 0;
        while (sb.length() > 1) { // sb의 길이가 1 이하가 되면 종료
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i + 1);

            if (ch1 == ch2) {
                sb.delete(i, i + 2);
                i = 0; // 인덱스를 다시 0으로 초기화하여 처음부터 검사
            } else {
                i++;
                // 인덱스가 범위를 벗어나지 않도록 조정
                if (i >= sb.length() - 1) {
                    break;
                }
            }
        }
        result = sb.isEmpty() ? 1 : 0;
        System.out.println(result);

    }
}
