package sec15_inheritancePolymorphism.i03_typeCasting;

// 클래스의 상속관계
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class TypeCasting_1 {
    public static void main(String[] args){
        // 1. 업캐스팅 -> 생략시 컴파일러가 자동 추가.
        A aa = (A)new C();      // C -> A : 업캐스팅(자동변환)
//        A aa = new C();   // 생략되있는형태
        B bb = (B) new C();     // C -> B : 업캐스팅
//        B bb = new C();

        B bbb = new B();
        A a = bbb;  // B -> A : 업캐스팅
//        A a = (A)bb;

        // 2. 다운캐스팅 -> 자동 불가 : 수동변환
        // 2-1. 실행시 예외가 발생하는경우
        A aaa = new A();
//        B b2 = aaa;    // A -> B : 부모타입을 자식타입으로 바꾸라는말(다운캐스팅) -> 수동변환해야함
        B b2 = (B)aaa;   // 위 코드를 이런식으로 수동으로 다운캐스팅 해야함. 하지만 이 경우 오류야
//        C c2 = aaa;
        C c2 = (C)aaa;  // 위 코드를 이런식으로 수동으로 다운캐스팅한거. 이 경우도 오류

        // 2-2. 실행 가능한 경우
        A a3 = new B();
//        B b3 = a2;
        B b3 = (B)a3;   // 왼쪽도 B, 오른쪽도 B : 가능
//        C c3 = a2;
        C c3 = (C)a3;   // 왼쪽도 C, 오른쪽도 C : 불가능

        B b4 = new D();
//        D d4 = b4;
        D d4 = (D)b4;   // 수동 변환 : 가능

        A a5 = new D();
//        B b5 = a5;
        B b5 = (B)a5;   // 가능
//        D d5 = a5;
        D d5 = (D)a5;   // 가능
    }
}
