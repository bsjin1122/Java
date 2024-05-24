public class JadenCase {
    public static void main(String[] args) {
        String s = "  the school sesac ";//"3people unFollowed me";
        String answer = "";
        String capitalizedStr = capitalizeWords(s);

        System.out.println("Original: '" + s + "'");
        System.out.println("Capitalized: '" + capitalizedStr + "'");


    }
    public static String capitalizeWords(String str) {
        if(str.split(" ").length == 0){
            return " ";
        }
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                result.append(c);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }
}
//        for (int i = 0; i < sArr.length; i++) { // String string : sArr
//            if(!Character.isAlphabetic(sArr[i].charAt(0))){
//                sArr[i] = sArr[i].toLowerCase();
//            }else{
//                char firstChar = Character.toUpperCase(sArr[i].charAt(0));
//                String remainingStr = sArr[i].substring(1).toLowerCase();
//                sArr[i] = firstChar + remainingStr;
//            }
//        }
//        for(int k = 0; k < sArr.length; k++){
//            if(k == sArr.length-1){
//                answer += sArr[k];
//            }else{
//                answer += sArr[k] + " ";
//            }
//            if(sArr.length == 0){
//                answer = String.join(" ", sArr[k]);
//            }
//        }
//
//        System.out.println(answer);
//공백문자가 연속해서 나올 수 있기 때문에, str의 요소 str[i]는 빈 문자열 ""이 될 수 있습니다
//사족입니다만, 마지막에 String배열을 빈칸을 채워서 하나의String으로 만드는 부분은
//answer = String.join(" ", str);
