package sec21_AnonymousClass.a04_AnonymousClass;

interface A {
    public void abc();
}

class C {
    void cde(A a){
        a.abc();
    }
}

public class a04_AnonymousClass {
    public static void main(String[] args){
        C c = new C();

        // # 방법3        // 클래스명도 없고 (X) + 참초변수명도 있는 경우 (O)
        A a = new A() {
            @Override
            public void abc() {
                System.out.println("매개변수 전달");
            }
        };
        c.cde(a);

        // # 방법4        // 클래스명도 없고 (X) + 참초변수명도 없는 경우 (X)
        // ***** 중요 *****
        c.cde(new A() {
            @Override
            public void abc() {
                System.out.println("매개변수 전달");
            }
        });
    }
}