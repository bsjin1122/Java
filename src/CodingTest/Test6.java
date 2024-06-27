public class Test6 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);
        System.out.println(a.n);
        a.work1();


    }
}

class A{
    int m;
    int n;
    void work1(){
        int k = 0;
        System.out.println(k); // 오류
    }
}


//        int[] a = new int[3];
//        a[0]=3;
//        System.out.println(a[0]);
//        a[1]=4;
//        a[2]=5;
//        a[0]=2;
//        System.out.println(a);
//
//        int b = 0;
//        int[] c = null; // null : 객체를 가리키지 않음
//        System.out.println(b);
//        System.out.println(c);
//        String str1 = new String("안녕");
//        String str2 = "안녕";
//        String str3 = "안녕";
//        String str4 = new String("안녕");
//
//        //@stack메모리값 비교 (객체의 번지(위치))
//        System.out.println(str1==str2); //false
//        System.out.println(str2==str3); //true
//        System.out.println(str3==str4); //false
//        System.out.println(str4==str1); //false

