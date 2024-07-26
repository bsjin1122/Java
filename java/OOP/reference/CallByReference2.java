package OOP.reference;

public class CallByReference2 {
    public static void main(String[] args) {
        Animal ref_a = new Animal();
        Animal ref_b = ref_a; // 서로 완전히 다른 변수지만, 같은 값을 갖고 있고 그 컴퓨터는 그 값을 주소로서 활용한다.
        // 참조하고 있는 객체가 같으니, 참조하고 있는 객체의 변화에 함께 영향을 받을 뿐이다.

        System.out.println(ref_a); //OOP.reference.Animal@823748ae
        System.out.println(ref_b); //OOP.reference.Animal@823748ae
    }
}
