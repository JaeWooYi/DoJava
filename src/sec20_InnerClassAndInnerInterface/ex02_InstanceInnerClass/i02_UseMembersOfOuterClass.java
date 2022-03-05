package sec20_InnerClassAndInnerInterface.ex02_InstanceInnerClass;

class A {
    int a = 3;
    int b = 4;
    void abc(){
        System.out.println("A클래스 메서드");
    }

    // 인스턴스 이너클래스 정의
    class B{
        int a = 6;
        int b = 7;
        void abc(){
            System.out.println("B클래스 메서드");
        }
        void bcd(){
            // #1. inner class의 멤버 호출 또는 사용
            System.out.println(this.a); // 6
            System.out.println(b);      // 7 ---- this.이 생략되어있는 상태다 자기꺼 부른다
            abc();                      // B클래스의 메서드 ---- this.이 생략되어있는 상태다 자기꺼 부른다
            // #2. outer class의 멤버 호출 또는 사용  -> 외부클래스.this.멤버
            System.out.println(A.this.a);   // 3
            System.out.println(A.this.b);   // 4
            A.this.abc();                   // A클래스 메서드
        }
    }
}

public class i02_UseMembersOfOuterClass {
    public static void main(String[] args){
        // outer class 객체 생성
        A a = new A();
        // inner class 객체 생성
        A.B ab = a.new B();

        ab.abc();
        System.out.println();
        ab.bcd();
    }
}
