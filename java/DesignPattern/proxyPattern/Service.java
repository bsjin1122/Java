package DesignPattern.proxyPattern;

// IService 인터페이스를 구현한 Service
public class Service implements IService{
    public String runSomething(){
        return "서비스 짱!";
    }
}
