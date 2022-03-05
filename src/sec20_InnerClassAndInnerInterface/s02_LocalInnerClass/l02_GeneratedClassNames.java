package sec20_InnerClassAndInnerInterface.s02_LocalInnerClass;

// 네비게이터로 보기 아래 형태로 나올거야 -> 서로 다른 메서드에서 정의된 것이기 때문에 클래스 이름 중복이 되.
/*
A.class
A$1B.class
A$1C.class
A$1D.class
A$2C.class
 */

class A {
    void abc() {
        class B {}
        class C {}
    }
    void bcd() {
        class C {}
        class D {}
    }
}

public class l02_GeneratedClassNames {
}
