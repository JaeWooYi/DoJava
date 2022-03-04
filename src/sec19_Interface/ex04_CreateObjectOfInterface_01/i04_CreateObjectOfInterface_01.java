package sec19_Interface.ex04_CreateObjectOfInterface_01;

// (객체 생성) 방법1. 자식클래스를 생성후 -> 자식클래스 생성자로 객체 생성
interface A{
    public static final int a = 3;
    public abstract void abc();
}

class B implements A{

    @Override
    public void abc(){
        System.out.println("(객체 생성) 방법1. 자식클래스를 생성후 -> 자식클래스 생성자로 객체 생성");
    }
}

public class i04_CreateObjectOfInterface_01 {
    public static void main(String[] args){
        // 인터페이스는 객체생성이 불가능! 확인해보자
//        A a = new A();    // ok 확인완료

        // 1. 객체 생성
        // 자식이 A를 상속해서 만들어 볼까?
        A a = new B();  // 확인완료
        B b = new B();

        // 2. 메서드 호출
        a.abc();
        b.abc();
    }
}
