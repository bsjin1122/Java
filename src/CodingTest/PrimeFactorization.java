import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args) {
        int number = 56; // 소인수분해 할 숫자
        List<Integer> primeFactors = getPrimeFactors(number);

        System.out.println("Prime factors of " + number + " are: " + primeFactors);
    }

    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        // 2로 나누기
        while (number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;
        }

        // 홀수로 나누기 시작
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        // 남은 소수가 있는 경우 추가
        if (number > 2) {
            primeFactors.add(number);
        }

        return primeFactors;
    }
}
