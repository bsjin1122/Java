package DesignPattern.strategyPattern;

// 무기(전략)를 사용할 군인(컨텍스트) 구현
public class Soldier {
    void runContext(Strategy strategy){
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }
}
