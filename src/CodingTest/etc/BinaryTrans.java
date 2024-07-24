package etc;

public class BinaryTrans {
    public static void main(String[] args) {
        String s = "110010101001";
        StringBuilder sb = new StringBuilder(s);

        int count = 0;
        int zeroCount = 0;
        int[] result = {count, zeroCount};

        // 반복문을 사용하여 문자열의 각 자리에서 "0"을 제거
        String originStr;
        String deleteStr;
        while(!sb.toString().equals("1")){
            originStr = sb.toString();
            deleteStr = deleteZero(sb.toString());
            zeroCount += originStr.length() - deleteStr.length();
            count++;
            sb.delete(0,originStr.length());
            String binStr = createBinary(deleteStr.length());
            sb.append(binStr);
        }
            System.out.println(count);
            System.out.println(zeroCount);
    }
    public static String deleteZero(String string){
        String delete = string.replace("0", "");
        return delete;
    }
    public static String createBinary(int len){
        String binaryString = Integer.toBinaryString(len);
        return binaryString;
    }

}
