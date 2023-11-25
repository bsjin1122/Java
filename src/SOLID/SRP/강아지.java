package SOLID.SRP;

public class 강아지 {
    final static Boolean 수컷 = true;
    final static Boolean 암컷 = false;
    Boolean 성별;

    void 소변보다(){ //암,수컷 모두 구현하려고 해서 srp 원칙을 위배하고 있다.
        if(this.성별 == 수컷){
            // 한 쪽 다리를 들고 소변을 본다.
        }else{
            // 뒷다리 두 개를 굽혀 앉은 자세로 소변을 본다.
        }
    }
}
