package sec14_modifier.a3_staticMethod;

class AAA{
    void abc(){
        System.out.println("instance method");
    }

    static void bcd(){
        System.out.println("static method");
    }
}

public class s01_StaticMethod {
    public static void main(String[] args){
        // 1. 인스턴스 메서드 활용방법(객체생성후 사용가능)
        AAA aaa = new AAA();
        aaa.abc();  // instance method
        System.out.println();

        // 2. 정적 메서드 활용방법
        // 2-1. 클래스 이름으로 바로 접근해서 활용
        AAA.bcd();  // static method
        // 2-2. 객체 생성후 사용(가능한 지양)
        AAA aaa2 = new AAA();
        aaa2.bcd();
    }
}
