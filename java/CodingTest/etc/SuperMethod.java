package etc;

class One{
    One(){
        this(3);
        System.out.println("One 생성자 1");
    }
    One(int a){
        System.out.println("One 생성자 2");
    }
}

class Two extends One {
    Two(){
        this(3);
        System.out.println("Two 생성자 1");
    }
    Two(int b){
        System.out.println("Two 생성자 2");
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        One aa1 = new One();
        System.out.println("111111111");
        One aa2 = new One(3);
        System.out.println("22222222");

        Two bb1 = new Two();
        System.out.println("3333333333");
        Two bb2 = new Two(3);
    }
}
