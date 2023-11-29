package DesignPattern.templateCallbackPattern;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총! 총조종총 총! 총!");
            }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("칼! 카가갈 칼! 칼!");
            }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("도끼! 도독...도도독 독끼!");
            }
        });
    }
}
