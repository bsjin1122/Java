class Foo{  
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod(){
        System.out.println(classVar);
        // System.out.println(instanceVar);
    }
    public void instanceMethod(){
        System.out.println(classVar);
        System.out.println(instanceVar);
        // 모두 접근 가능하다
    }
}

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar);
        // System.out.println(Foo.instanceVar); // Error
        Foo.classMethod();
        // Foo.instanceMethod();
        Foo f1 = new Foo();
        
    }
}
