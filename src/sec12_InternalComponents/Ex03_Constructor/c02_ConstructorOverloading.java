package sec12_InternalComponents.Ex03_Constructor;

class A1{
    A1(){
        System.out.println("first Constructor");
    }
    A1(int a){
        System.out.println("second Constructor");
    }
    A1(int a, int b){
        System.out.println("third Constructor");
    }
}

public class c02_ConstructorOverloading {
    public static void main(String[] args){
        // 1. 3가지 생성자를 이용한 객체 생성
        A1 a1 = new A1();
        A1 a2 = new A1(1);
        A1 a3 = new A1(2,3);
    }
}
