package sec19_Interface.ex08_StaticMethod;

interface A{
    public abstract void bcd(); // 미완성 메서드

    static void abc(){      // static을 붙이면 완성된 메서드로 정의 할 수 있따.
        System.out.println("인터 페이스 A의 정적 메서드 abc");
    }
}

public class i08_StaticMethod {
    public static void main(String[] args){

        // 1. 정적메서드 호출
        A.abc();
    }
}
