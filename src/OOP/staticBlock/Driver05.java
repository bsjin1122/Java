package OOP.staticBlock;

public class Driver05 {
    public static void main(String[] args) {
        System.out.println("main 메서드 시작!");
        System.out.println(Animal.age);
        System.out.println(Animal.age);
        Animal 동물 = new Animal(19);
    }
}

class Animal{
    private int myage;

    static int age = 0;
    static{
        System.out.println("Animal Class ready on!");
    }
    public Animal(int age){
        System.out.println("생성자 호출용이야");
        myage = age;
        System.out.println(age);
    }
}
