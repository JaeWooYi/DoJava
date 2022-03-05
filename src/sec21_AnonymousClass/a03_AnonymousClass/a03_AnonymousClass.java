package sec21_AnonymousClass.a03_AnonymousClass;

interface A {
    public void abc();
}

// #1. 자식클래스를 직접 생성
class B implements A{
    @Override
    public void abc() {
        System.out.println("매개변수 전달");
    }
}

class C {
    void cde(A a){
        a.abc();
    }
}

public class a03_AnonymousClass {
    public static void main(String[] args){
        C c = new C();

        // # 방법1. A타입의 객체 생성 // 클래스명도 있고 (O) + 참초변수명도 있는 경우 (O)
        A a = new B();
        c.cde(a);

        // # 방법2.                // 클래스명도 있고 (O) + 참초변수명도 사용 않는 경우 (X)
        c.cde(new B());
    }
}
