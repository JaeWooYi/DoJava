package sec14_modifier.a2_staticModfier;

class A{
    int m = 3;  // intstance필드 -> 스태틱 안붙으면
    static int n = 5;   // static(정적)필드
}

public class StaticField_1 {
    public static void main(String[] args){
        // 1. 인스턴스 필드 활용 방법 (항상 객체 생성을 사용한 후에 사용가능 : A a = new A();)
        A a = new A();
        System.out.println(a.m);
        System.out.println();

        // 2. 정적(static)필드 활용 방법
        // 2-1. 객체 생성없이 바로 활용
        System.out.println(A.n);
        // 2-2. 인스턴스 필드와 마찬가지로 객체 생성후 활용(이 방법은 지양한다.)
        A a2 = new A();
        System.out.println(a2.n);
    }
}
