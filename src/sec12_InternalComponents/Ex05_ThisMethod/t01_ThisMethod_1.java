package sec12_InternalComponents.Ex05_ThisMethod;

// this() : 디스 메서드 -> 문법적 특징과 의미 -> 자신이 속한 클래스에 다른 생성자를 호출
// this(생성자의 매개변수)

// 1. 클래스의 정의
class A {
    A(){
//        this(3);
        System.out.println("first Constructor");
    }
    A(int a){
        this();     // 내 생성자를 호출한다. 위에 A()를 -> 만약 첫번째 생성자에서 이 A(int a)생성자를 호출하고 싶다면?
                    // 이거 주석하고 위에 this(int값) 쓰면 되지
                    // 생성자의 첫줄에만 올 수 있따. 의심스럽다면 println 밑이나 메서드 하나만들고 그 안에 써봐.
        System.out.println("second Constructor");
    }
}

public class t01_ThisMethod_1 {
    public static void main(String[] args){
        // 객체 생성
        A a1 = new A();         // first Constructor
        System.out.println();
        A a2 = new A(3);    // first Constructor, second Constructor
    }
}
