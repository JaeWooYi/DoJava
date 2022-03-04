package sec19_Interface.ex07_defaultMethodOfInterface_2;

interface A{
    default void abc(){
        System.out.println("인터페이스 A의 abc()");
    }
}

class B implements A{
    @Override
    public void abc(){

        A.super.abc();      // 이게 바로 부모 인터페이스에 있는 메서드를 호출하는 문법
                            // super.abc() -> 부모클래스의 abc()를 호출하라는 소리야
        System.out.println("-----");
        System.out.println("클래스 B의 abc()");
    }
}

public class i07_defaultMethodOfInterface_2 {
    public static void main(String[] args){
        // 1. 객체 생성
        A a1 = new B();

        // 2. 메서드 호출
        a1.abc();
    }
}
