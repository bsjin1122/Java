public class ExceptionClosable {
    public static void main(String[] args) {
        // 1. 리소스를 사용하고, finally 에서 리소스 수동 해제하기
        CloseTest a1 = null;
        
        try(CloseTest a2 = new CloseTest("특정 파일");){
            
        }catch (Exception e){
            System.out.println("예외처리");
        }

        System.out.print("코어수 : ");
        System.out.println(
                Runtime.getRuntime().availableProcessors());
//        try{
//            a1 = new CloseTest("특정 파일");
//        }catch (Exception e){
//            System.out.println("예외 처리");
//        }finally {
//            // 리소스 수동 해제
//            if(a1.resource != null){
//                try{
//                    a1.close();
//                }catch (Exception e){
//
//                }
//            }
//        }
    }
}
