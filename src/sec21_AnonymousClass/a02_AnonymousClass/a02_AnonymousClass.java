package sec21_AnonymousClass.a02_AnonymousClass;

class A {
    C c = new C(){
        @Override
        public void bcd() {
            System.out.println("익명 이너페이스");
        }
    };

    void abc(){
        c.bcd();
    }

}

interface C {
    public abstract void bcd();
}
public class a02_AnonymousClass {
    public static void main(String[] args) {
        A a = new A();
        a.abc();
    }
}
