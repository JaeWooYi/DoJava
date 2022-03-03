package sec17_modifier2.m03_abstractModfier.Ex01;

// 1. 일반 클래스 상속하는경우
class Animal {
    void cry(){             // void 앞에 final을 붙이면 어떻게 될까? 결과는 말안해도 알지? 오버라이드 안돼.
                            // 그냥 빈값으로 아무것도 안하는것 자체가 abstract(추상)라는 뜻이야 -> 클래스앞에 썻지?
    }
}

class Cat extends Animal{
    @Override
    void cry(){
        System.out.println("야옹");
    }
}

class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class AbstractModifier_1 {
    public static void main(String[] args){
        // 객체 생성
        Animal animal2= new Cat();
        Animal animal3= new Dog();

        animal2.cry();
        animal3.cry();
    }
}
