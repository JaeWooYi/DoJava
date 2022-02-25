package sec12_InternalComponents.Ex03_Constructor;

// 컴파일러가 자동 추가 해주는 생성자(기본 생성자)
class A {
    int m;          // 필드
    void work(){    // 메서드
        System.out.println(m);  // 0으로 초기화된 값 나옴
    }
    //A(){} //-> 컴파일러가 자동으로 추가해주는 기본 생성자 : 생략되있는거야.
    // 객체 생성 이후에 해야 할 추가 일들
}

class B {
    int m;
    void work(){
        System.out.println(m);  // 0
    }
    B(){    // 기본 생성자 -> 내가 직접 만듬 : 생성자는 기본적으로 클래스와 이름이 같다.

    }
}

class C {
    int m;
    void work(){
        System.out.println(m);  // 생성자로 넘어온 값
    }
    C(int a){   // 생성자의 기본 기능 : 객체 생성 + 필드 초기화
        m = a;  // m이뭔데? 필드 값
    }
}

public class c01_DefaultConstructor {
    public static void main(String[] args) {
        // 1. 클래스의 객체 생성
        A a = new A();
        B b = new B();
        C c = new C(5);
        a.work();   // 초기값 0
        b.work();   // 초기값 0
        c.work();   // 5
    }
}
