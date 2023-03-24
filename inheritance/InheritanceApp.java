package inheritance;

class Cal{
    public int sum(int v1, int v2){
        return v1+v2;        
    }
}
class Cal3 extends Cal{
    public int minus(int v1, int v2){
        return v1-v2;        
    }
    // 부모가 가진 기능을 덮어씀 -> Overriding 
    // 상속이 존재하는 가장 근본적인 원인
    public int sum(int v1, int v2){
        System.out.println("Cal3!!");
        return v1+v2;        
    }
}
public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2, 1));

        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2, 3));
        System.out.println(c3.minus(3, 1));
        System.out.println(c3.sum(2, 3));
    }
}
