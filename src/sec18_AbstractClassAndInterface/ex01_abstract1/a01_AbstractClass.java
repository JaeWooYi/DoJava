package sec18_AbstractClassAndInterface.ex01_abstract1;

// 추상클래스의 객체 생성 방법 #1 : 자식클래스 생성 + 자식클래스 생성자를 가지고 객체 생성
abstract class A{
    abstract void abc();
}

class B extends A{
    @Override
    void abc(){
        System.out.println("방법 #1. 자식클래스 생성 및 추상메서드 구현");
    }
}

public class a01_AbstractClass {
    public static void main(String[] args){
        // 1. 객체 생성
//        A a = new A();  // 추상클래스는 객체 생성이 불가
                          // 자식클래스를 통해 객체를 생성해야함
        B b = new B();
        A b2 = new B(); // 해도문제가안생김.

        b.abc();
        b2.abc();
    }
}
