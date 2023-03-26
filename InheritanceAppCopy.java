class Cal{
    public int sum(int v1, int v2){
        return v1 + v2;
    }
    // Overloading 자식이 가질 수도 있음
    public int sum(int v1, int v2, int v3){
        return this.sum(v1, v2)+v3;
    }
} 

class Cal3 extends Cal{
    public int miuns(int v1, int v2){
        return v1 - v2;
    }
    // Overriding -- 재정의 부모가 가진 기능을 덮어쓴다 
    public int sum(int v1, int v2){
        System.out.println("Cal3!!");
        return super.sum(v1, v2);
    }
    // Overloading, Overriding 도 가능 
    public int sum(int v1, int v2, int v3){
        return v1 + v2 + v3;
    }
}
 
public class InheritanceAppCopy {
    public static void main(String[] args) {
       Cal c = new Cal();
       System.out.println(c.sum(2, 1));
       System.out.println(c.sum(2, 1, 1));
    
       System.out.println("-----------");
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2, 1));
        System.out.println(c3.miuns(2, 1));
    }
    
}

class Cal2{
    public int sum(int v1, int v2){
        return v1 + v2;
    } 
    public int minus(int v1, int v2){
        return v1 - v2;
    }
}        
   