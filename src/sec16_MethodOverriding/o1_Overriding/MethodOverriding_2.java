package sec16_MethodOverriding.o1_Overriding;

class Animal{
    void cry(){

    }
}

class Bird extends Animal{
    @Override
    void cry(){
        System.out.println("짹짹");
    }
}

class Dog extends Animal{
    @Override
    void cry(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    @Override
    void cry(){
        System.out.println("야옹");
    }
}

public class MethodOverriding_2 {
    public static void main(String[] args){
        // 1. 각각의 타입으로 선언 + 각각의 타입으로 생성
        Animal aa = new Animal();
        Bird bb = new Bird();
        Dog cc = new Dog();
        Cat dd = new Cat();

        aa.cry();
        bb.cry();
        cc.cry();
        dd.cry();

        System.out.println();

        // 2. All Animal type + 자식클래스 타입으로 생성
        Animal ab = new Bird();
        Animal ac = new Dog();
        Animal ad = new Cat();

        ab.cry();
        ac.cry();
        ad.cry();

        System.out.println();

        // 3. 동일한 타입이면 배열로 관리 할 수 있다. -> 장점
        Animal[] animals = new Animal[]{ab,ac,ad};
        for(Animal animal : animals){
            animal.cry();
        }
    }
}
