package Test;
// 오버라이딩 (올라탐)
// 책 내용: 같은 메서드 이름, 같은 인자 목록으로 상위 클래스의 메서드를 재정의
// 하위 클래스에서 상위 클래스의 메서드를 재정의하여 사용한다.
// * 상속관계에서만 발생한다.
// 상위 클래스의 메서드를 하위 클래스에서 재정의하여, 하위 클래스에서 다른 동작을 수행하도록 할 수 있다.
class Animal {
    public void makeSound(){
        System.out.println("동물 소리를 만든다.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
}