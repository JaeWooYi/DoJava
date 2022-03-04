package sec19_Interface.ex06_defaultMethodOfInterface_1;

interface A {
    public abstract void abc();     // 1. 예를들어 이친구 2020에 만들었다

    default void bcd(){     // 2. 이친구는 2022년에 만들었다고 가정하자 -> 이친구 추가하자마자 class B는 오류가 발생 -> public abstract가 아닌 default접근지정자를 붙여보자
        System.out.println("A 인터페이스의 bcd()  -> 2022에 만든");
        }                            // default는 완성이기에 완성된 중괄호가 필요해
}

class B implements A {          // 1. 이친구 역시 2020에 생성
    @Override
    public void abc(){
        System.out.println("B클래스의 abc()이다 -> 2020년에 만든");
    }
}

class C implements A {
    public void abc(){
        System.out.println("C클래스의 abc()");
    }
    public void bcd(){
        System.out.println("C클래스의 bcd()");
    }
}

public class i06_defaultMethodOfInterface_1 {
    public static void main(String[] args) {
        // ##1. 객체 생성
        A a1 = new B();
        A a2 = new C();

        // ##2. 메서드 호출
        a1.abc();
        a1.bcd();

        System.out.println();

        a2.abc();
        a2.bcd();
    }
}
