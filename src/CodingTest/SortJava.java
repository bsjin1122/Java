import java.util.Arrays;
public class SortJava {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        String answer = "";

        // 콤마를 기준으로 문자열 분할
        String[] splitStr = s.split(" ");
        int[] intArray = new int[splitStr.length];
        for(int i = 0; i< splitStr.length; i++){
            intArray[i] = Integer.parseInt(splitStr[i]);
        }
        Arrays.sort(intArray);
        System.out.println(intArray[0] + " " + intArray[intArray.length-1]);

    }
}
