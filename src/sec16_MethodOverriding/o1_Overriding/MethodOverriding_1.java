package sec16_MethodOverriding.o1_Overriding;

class A{
    void print(){
        System.out.println("A class");
    }
}

class B extends A{
    @Override   // (생략해도 된다.)
    void print() {  // A를 상속받고 위 메스드와 이름이 같지? 오버라이딩 한거야
        System.out.println("B class");
    }
}

public class MethodOverriding_1 {
    public static void main(String[] args){
        // 1. A type, A constructor
        A aa = new A();
        aa.print();

        // 2. B type, B constructor
        B bb = new B();
        bb.print();

        // 3. A type, B constructor
        A aa2 = new B();
        aa2.print();
    }
}
