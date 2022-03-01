package sec16_MethodOverriding.o04_ObjectClass;

class A {   // 아무것도 상속하지 않으면 컴파일러는 자동으로 Object를 상속 , 하지만 난 써볼래 히히
    int a = 3;
    int b = 4;
}

class B {
    int a = 1;
    int b = 2;

    @Override
    public String toString(){
        return "필드값(a, b) = " + a + ", " + b;
    }
}

public class ex01_ObjectMethodToString {
    public static void main(String[] args){
        // 1. 객체 생성
        A a = new A();
        B b = new B();

        // 2. 메서드 호출
        System.out.printf("%x\n", a.hashCode());
        System.out.println(a);  // a객체의 정보가 출력됨 // 실제로는 a.toString()인데 생략된거야
        System.out.println();
        System.out.println(b);
    }
}
