package DesignPattern.templateMethodPattern;

public abstract class Animal {
    // 템플릿 메서드
    public void playWithOwner(){
        System.out.println("귀염둥이 이리온...");
        play();
        runsomething();
        System.out.println("잘했어");
    }
    // 추상메서드
    abstract void play();

    // Hook(갈고리) 메서드
    void runsomething(){
        System.out.println("꼬리 살랑살랑~");
    }
}
