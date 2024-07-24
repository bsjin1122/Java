package etc;

import java.io.IOException;
import java.io.InputStreamReader;

public class A25 {
    public static void main(String[] args) {
        // try with resource 구문 1
        try (InputStreamReader isr1 = new InputStreamReader(System.in)){
            char input = (char) isr1.read();
            System.out.println("입력글자 = " + input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(InputStreamReader isr2 = new InputStreamReader(System.in)){
            char input = (char) isr2.read();
            System.out.println("입력글자 = " + input);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
