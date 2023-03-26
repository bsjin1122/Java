interface Greet1{
    void greet();
}
interface Greet2{
    public default void afternoon(){
        System.out.println("안녕하세요");
    }
}
interface Greet3{
    static void greet(){
        System.out.println("안녕하세요!");
    }
}
class Greeting implements Greet1, Greet2{
    public void greet(){
        System.out.println("안녕하세요^^");
    }
}

public class Say {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.greet();
        g.afternoon();
        Greet3.greet();
    }
}
