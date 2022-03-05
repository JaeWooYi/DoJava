package sec22_InnerInterface.i01_InnerInterface;

class A {
    static interface B {
       public abstract void abc();
    }
}

class C implements A.B{
    @Override
    public void abc() {
        System.out.println("이너인터페이스 구현 클래스 생성");
    }
}

public class i01_CreateObjectOfInnerInterface {
    public static void main(String[] args) {
        // 객체 생성 방법 #1. 자식클래스 직접 생성
        A.B ab = new C();
        C c = new C();      // 위나 아래나 같다.

        // 객체 생성 방법 #2. 익명이너클래스 생성
        A.B ab2 = new A.B(){
            @Override
            public void abc() {
                System.out.println("익명이너클래스로 객체 생성");
            }
        };
    }
}
