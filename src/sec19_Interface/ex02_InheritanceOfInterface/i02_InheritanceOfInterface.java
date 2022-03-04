package sec19_Interface.ex02_InheritanceOfInterface;

interface A{

}

interface B{

}

// 1. 단일인터페이스 상속
class C implements A{

}

// 2. 다중인터페이스 상속
class D implements A,B{

}

// 3. 클래스와 인터페이스를 한번에 상속하는 경우
class E extends D implements A,B{       // extends와 implements는 순서변경은불가능 하다.

}

public class i02_InheritanceOfInterface {
    public static void main(String[] a){

    }
}
