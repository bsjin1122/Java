package etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordChain {
    public static void main(String[] args) {
        int[] answer = new int[2];
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
                //{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int result = findMistake(words, n);
        if (result == -1) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            int person = (result % n) + 1;
            int turn = (result / n) + 1;
            answer[0] = person;
            answer[1] = turn;
        }

    }
    public static int findMistake(String[] words, int numPeople){
        Set<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String previousWord = words[i - 1];
            String currentWord = words[i];

            // Check if the current word starts with the last character of the previous word
            if (previousWord.charAt(previousWord.length() - 1) != currentWord.charAt(0)) {
                return i; // 끝말잇기 규칙 위반
            }

            // Check if the current word has already been used
            if (usedWords.contains(currentWord)) {
                return i; // 중복 단어 발견
            }

            usedWords.add(currentWord);
        }

        return -1; // 모든 단어가 끝말잇기 규칙을 따름
    }
}
