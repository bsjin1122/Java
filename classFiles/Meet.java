/* 인터페이스 : 상속 관계가 아닌 클래스에 기능을 제공하는 구조.
클래스와 비슷한 구조이지만, 정의와 추상 메소드만이 멤버가 될 수 있다는 점이 다르다. 
클래스에서 인터페이스를 이용하도록 하게 하는 것을 '인터페이스의 구현'이라고 한다. 
 */
interface Greet{
    void greet();
}
interface Talk{
    void talk();
}
class Morning implements Greet, Talk{
    public void greet(){
        System.out.println("안녕하세요!");
    }

    public void talk() {
       System.out.println("날씨 좋네요.");
    }
}

class Meet {
    public static void main(String[] args) {
        Morning morning = new Morning();
        morning.greet();
        morning.talk();
    }    
}
