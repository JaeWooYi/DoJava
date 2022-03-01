package sec16_MethodOverriding.o03_SuperAndSuperMethod;

class A{
    void abc(){
        System.out.println("A 클래스의 abc()");
    }
}

class B extends A{
    @Override
    void abc(){
        System.out.println("B 클래스의 abc()");
    }
    void bcd(){
        abc();    // 이 print는 위 A의 print일까 아니면 B의 print일까? 내생각엔 A꺼야
//        this.abc();   // 원래 이형태야
    }
}

public class s01_SuperKeyword_1 {
    public static void main(String[] args){
        B b = new B();

        b.bcd();    // 예상과 다르게 B의것이 나오는군. this가 생략되있기 때문이야 -> 컴파일러가 자동추가
    }
}
