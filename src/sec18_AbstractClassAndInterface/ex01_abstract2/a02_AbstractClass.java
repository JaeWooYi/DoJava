package sec18_AbstractClassAndInterface.ex01_abstract2;

// 추상클래스의 객체 생성 방법 #2 : 자식클래스 생성 안하는 법 -> 익명이너클래스를 이용하여 객체 생성
abstract class A{
    abstract void abc();
}

public class a02_AbstractClass {
    public static void main(String[] args) {
        // 1. 객체 생성
        A a1 = new A(){
            @Override
            void abc(){
                System.out.println("방법 #2. 익명이너클래스를 이용하여 추상메서드 구현");
            }
        };
        a1.abc();

        A a2 = new A(){
            @Override
            void abc(){
                System.out.println("방법 #2. 익명이너클래스를 이용하여 추상메서드 구현");
            }
        };
        a2.abc();
    }
}
