package sec17_modifier2.m03_abstractModfier.Ex02;

// 1. 추상메서드,클래스 상속하는경우
abstract class Animal { // abstract만 붙이면 되.
    abstract void cry();    // 중괄호 없이 -> 메서드에 추상있으면 클래스앞에 무조건 abstract붙여줘야해
}

class Cat extends Animal {
    @Override
    void cry(){
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class AbstractModifier_2 {
    public static void main(String[] args){
        // 객체 생성
        Animal animal2= new Cat();
        Animal animal3= new Dog();

        animal2.cry();
        animal3.cry();
    }
}
