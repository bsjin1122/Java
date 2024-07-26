package DesignPattern.templateCallbackPattern;

public class Soldier {
    void runContext(String weaponSound){
        System.out.println("전투 시작");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투 종료");
    }

    private Strategy executeWeapon(final String weaponSound){
        // 전략을 생성하는 코드가 컨텍스트, 즉 군인 내부로 들어왔다.
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }


    /*기존: void runContext(Strategy strategy){
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }*/
}
