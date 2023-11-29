package DesignPattern.proxyPattern;

// 프록시를 사용하는 ClientWithProxy
public class ClientWithProxy {
    public static void main(String[] args) {
        // 프록시를 이용한 호출
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}
