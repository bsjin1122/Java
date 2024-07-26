package Test;

public class CallByReference {
    public static void swap(String a, String b){
        String tmp = a;
        a = b;
        b = tmp;
    }

    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("a");
        swap(a, b);
        System.out.println(a == b);
    }
}
