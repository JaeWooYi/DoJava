package sec16_MethodOverriding.o2_OverlapMember;

class A {
    int m = 3;
}

class B extends A {
    int m = 5;
}

public class o01_OverlapInstanceFiled {
    public static void main(String[] args){
        // 1. 객체 생성
        A aa = new A();
        System.out.println(aa.m);    // 3
        System.out.println();

        B bb = new B();
        System.out.println(bb.m);    // 5
        System.out.println();

        A ab = new B();
        System.out.println(ab.m);   // 5(x) -> A객체를 따르는구나.. 멍청아 넌 메모리 구조에 대하 아무것도 모르는거야.

        // 무슨타입으로 선언됐는지가 중요한거야
    }
}
