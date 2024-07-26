package SOLID.SRP;

abstract class 강아지2 {
    abstract void 소변보다();
}
class 수컷강아지 extends 강아지2{
    @Override
    void 소변보다() {
        // 한쪽 다리를 들고 소변을 본다.
    }
}
class 암컷강아지 extends 강아지2{
    @Override
    void 소변보다() {
        //뒷다리 두 개로 앉은 자세로 소변을 본다.
    }
}
