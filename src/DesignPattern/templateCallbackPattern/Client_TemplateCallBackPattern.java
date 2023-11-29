package DesignPattern.templateCallbackPattern;

public class Client_TemplateCallBackPattern {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext("총! 총초종총 총! 총!");

        System.out.println();

        rambo.runContext("칼! 칼가가갈 칼! 칼!");

        System.out.println();

        rambo.runContext("도끼! 도독...도독도독 도끼!");
    }
}
